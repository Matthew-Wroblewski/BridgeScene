package CommandClasses;

import util.annotations.Tags;
import avatars.Body;
import avatars.Scene;
@Tags({"approach command"})
public class ApproachCommand implements Runnable {
Scene montyScene;
Body body;
	public ApproachCommand(Scene montyScene,Body body)
	{
		this.montyScene=montyScene;
		this.body=body;
		
	}
	@Override
	public void run() {
		montyScene.approach(this.body);
	}

}