package CommandClasses;
import java.util.ArrayList;
import java.util.List;

import util.annotations.Tags;

@Tags({"Command List"})
public class CommandList implements Runnable {
	
	List<Runnable> list=new ArrayList<Runnable>();
	
	public CommandList(){
		
	}
	
	public void add(Runnable command)
	{
		this.list.add(command);
	}

	@Override
	public void run() {
		for(int i=0 ; i<list.size() ; i++)
		{
		list.get(i).run();
		}
	}

}
