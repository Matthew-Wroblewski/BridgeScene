package CommandClasses;

import util.annotations.Tags;
import avatars.Scene;
@Tags({"say command"})
public class SayCommand implements Runnable {
Scene montyScene;
String talk;
	public SayCommand(Scene montyScene,String talk)
	{
		this.montyScene=montyScene;
		this.talk=talk;
		
	}
	@Override
	public void run() {
		montyScene.say(this.talk);
	}
}
