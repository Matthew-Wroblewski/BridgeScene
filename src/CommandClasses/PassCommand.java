package CommandClasses;

import util.annotations.Tags;
import avatars.Scene;
@Tags({"pass command"})
public class PassCommand implements Runnable {
Scene montyScene;
	
public PassCommand(Scene montyScene)
	{
		this.montyScene=montyScene;		
	}
	@Override
	public void run() {
		montyScene.passed();
	}

}