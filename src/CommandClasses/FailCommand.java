package CommandClasses;

import util.annotations.Tags;
import avatars.Scene;
@Tags({"fail command"})
public class FailCommand implements Runnable {
Scene montyScene;
	public FailCommand(Scene montyScene)
	{
		this.montyScene=montyScene;
		
	}
	@Override
	public void run() {
		montyScene.failed();
	}

}