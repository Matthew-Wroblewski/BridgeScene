package interpreter;
import AnimationsThreads.*;
import CommandClasses.*;
import avatars.*;
import beanscommands.*;
import util.annotations.ComponentWidth;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
import util.annotations.Visible;
import util.misc.ThreadSupport;
@PropertyNames({"Input","scene"})
@EditablePropertyNames({"Input"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"Command Interpreter"})
public class CommandInterpreter implements Interpreter 
{
	boolean compoundCommand, inRepeat;
	SetAndGet testing;
	Scene bridge;
	String commandString;
	GenericTable<String,Object> table;
	BroadcastingClearanceManager manager;
	SetAndGet[] interpret;
	int j = 0;
	int numRepeat =1;
	CommandList commands = new CommandList();
//	Runnable animator = new AnimatingCommand(this.bridge.getArthur(),this.manager);
	//ASyncMoveAnimator syncAnimator =  new SyncAnimationCommand(null);

	
	
	public CommandInterpreter(Scene monty,SetAndGet scanned,
								BroadcastingClearanceManager manager2)
	{
	    this.manager=manager2;
		GenericTable<String,Object> table = new Table();
		this.table=table;
		this.bridge=monty;
		this.testing=scanned;

		this.table.put("arthur ", this.bridge.getArthur());
		this.table.put("robin ", this.bridge.getRobin());
		this.table.put("guard ", this.bridge.getGuard());
		this.table.put("galahad ", this.bridge.getGalahad());
		this.table.put("lancelot ", this.bridge.getLancelot());
		
	}
	public void setInput(String input)
	{
		compoundCommand=false;
		inRepeat=false;
		numRepeat=1;
		j=0;
		CommandList commands1=new CommandList();
		this.commands=commands1;
		commandString=input;
		testing.setString(getInput());
		SetAndGet[] interpret=testing.getArray();
		this.interpret=interpret;
	}
	@ComponentWidth (600)
	public String getInput()
	{
		return this.commandString;
	}
	
	@Tags({"command parser"})
	public void commandParser()
	{
		while(j < interpret.length )
		{
		if(interpret[j] instanceof Say)
		{
		
			sayParser();
		}
		else if (interpret[j] instanceof Move)
		{
			moveParser();
		}
		else if(interpret[j] instanceof Approach)
		{
			approachParser();
		}
		else if(interpret[j] instanceof Pass)
		{
			if(j+1 == interpret.length)
			{
			passParser();
			break;
			}
			else passParser();
		}
		else if(interpret[j] instanceof Fail)
		{
			if(j+1 == interpret.length)
			{
				failParser();
				break;
			}
			else failParser();
		}
		else if(interpret[j] instanceof Repeat)
		{
			repeatParser();
		}
		else if(interpret[j] instanceof StartBean)
		{
			commandListParser();
		}
		else break;
	}	
	}
		
	@Tags({"say parser"})
	public SayCommand sayParser()
	{
		String say =this.interpret[j+1].getString();
		SayCommand sayCommand = new SayCommand(this.bridge,say);
		if (compoundCommand==false  && inRepeat==false)
			sayCommand.run();
		commands.add(sayCommand);
		if (j < interpret.length-1)
		{
			j++;
		}		
		return sayCommand;
	}

	@Tags({"move parser"})
	public MoveCommand moveParser()
	{
		j+=2;
		int x1=Integer.parseInt(interpret[j].getString());
		j++;
		int y1=Integer.parseInt(interpret[j].getString());
		MoveCommand moveCommand = new MoveCommand(((Body) this.table.get(interpret[j-2].getString())), x1, y1);
		commands.add(moveCommand);
		if (compoundCommand==false  && inRepeat==false)
			moveCommand.run();
		if (j < interpret.length-1)
		{
			j++;
		}
		return moveCommand;
	}
	@Tags({"approach parser"})
	public ApproachCommand approachParser()
	{
		j++;
		ApproachCommand approachCommand = new ApproachCommand(bridge,
				                          (((Body) this.table.get(interpret[j].getString()))));
		commands.add(approachCommand);
		if (compoundCommand==false  && inRepeat==false)
		{approachCommand.run();}
		if (j < interpret.length-1)
		{
			j++;
		}
		return approachCommand;
		
	}
	@Tags({"pass parser"})
	public PassCommand passParser()
	{
		PassCommand passCommand= new PassCommand(this.bridge);
		commands.add(passCommand);
		if (compoundCommand==false  && inRepeat==false)
			passCommand.run();
		if (j < interpret.length-1)
		{
			j++;
		}
		return  passCommand;
	}
	@Tags({"fail parser"})
	public FailCommand failParser()
	{
		FailCommand failCommand = new FailCommand(this.bridge);
		commands.add(failCommand);
		if (compoundCommand==false  && inRepeat==false)
			failCommand.run();
		if (j < interpret.length-1)
		{
			j++;
		}
		return failCommand;
	}
	@Tags({"command list parser"})
	public CommandList commandListParser()
	{
		compoundCommand = true;
		j++;
		while (!(interpret[j] instanceof EndBean ||  interpret[j] instanceof StartBean))
		{
		commandParser();
		}
		if (inRepeat==false)
			commands.run();
		return commands;
	}
	@Tags({"repeat parser"})
	public RepeatCommand repeatParser()
	{
		inRepeat=true;
		j++;
		numRepeat*=Integer.parseInt(interpret[j].getString());
		j++;
		if (interpret[j] instanceof Move)
		{
			RepeatCommand repeat = new RepeatCommand
					(numRepeat,moveParser());		
			repeat.run();
			inRepeat=false;
			numRepeat=1;
			return repeat;
		}
		else if (interpret[j] instanceof StartBean)
		{
			RepeatCommand repeat = new RepeatCommand
					(numRepeat,commandListParser());		
			repeat.run();
			inRepeat=false;
			numRepeat=1;
			return repeat;
		}
		else commandParser();
			
		return null;
	}

	public Scene getScene()
	{
		return this.bridge;
	}
@Tags({"start animation"})
public void startAnimation()
{
	this.manager.proceedAll();
}

@Tags({"waiting Arthur"})
public void waitingArthur()
{
	Runnable animateArthur = new AnimatingCommand(this.bridge.getArthur(),this.manager);
	Thread thread1 = new Thread(animateArthur);
	thread1.start();
}
@Tags({"waiting Galahad"})
public void waitingGalahad()
{
	
	Runnable animateGalahad = new AnimatingCommand(this.bridge.getGalahad(),this.manager);
	Thread thread2 = new Thread(animateGalahad);
	thread2.start();
}
@Tags({"waiting Lancelot"})
public void waitingLancelot()
{
	Runnable animateLancelot = new AnimatingCommand(this.bridge.getLancelot(),this.manager);
	Thread thread3 = new Thread(animateLancelot);
	thread3.start();
}
@Tags({"waiting Robin"})
public void waitingRobin()
{
	Runnable animateRobin = new AnimatingCommand(this.bridge.getRobin(),this.manager);
	Thread thread4 = new Thread(animateRobin);
	thread4.start();
	
}
@Tags({"asynchronous Arthur"})
public void asynchronousArthur()
{
	MoveInterface animator = new SyncAnimation
			(this.bridge.getArthur(), 2, 10, 5, 450);
	Runnable moveX = new SyncCommandX(animator);
	Thread thread1 = new Thread(moveX);
	thread1.start();
	
	ThreadSupport.sleep(50);
	Runnable moveY = new SyncCommandY(animator);
	Thread thread2 = new Thread(moveY);
	thread2.start();
	
}
	
@Tags({"asynchronous Galahad"})
public void asynchronousGalahad()
{
	MoveInterface animator = new SyncAnimation
			(this.bridge.getGalahad(), 2, 10, 5, 450);
	Runnable moveX = new SyncCommandX(animator);
	Thread thread1 = new Thread(moveX);
	thread1.start();
}
@Tags({"asynchronous Lancelot"})
public void asynchronousLancelot()
{
	MoveInterface animator = new SyncAnimation
			(this.bridge.getLancelot(), 2, 10, 5, 450);
	Runnable moveX = new SyncCommandX(animator);
	Thread thread1 = new Thread(moveX);
	thread1.start();
}
@Tags({"asynchronous Robin"})
public void asynchronousRobin()
{
	MoveInterface animator = new SyncAnimation
			(this.bridge.getRobin(), 2, 10, 5, 450);
	Runnable moveX = new SyncCommandX(animator);
	Thread thread1 = new Thread(moveX);
	thread1.start();
}

}

	

