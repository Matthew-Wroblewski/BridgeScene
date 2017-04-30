package CommandClasses;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;

@Tags({"Repeat"})
public class RepeatCommand  implements Runnable
{
	int count;
	Runnable command;
	
	public RepeatCommand(int count,Runnable command)
	{
		this.count=count;
		this.command=command;
	}

	@Override
	public void run() {
		
		for(int i=0 ; i < count ; i++)
		{
			this.command.run();
		}
		
	}
}
