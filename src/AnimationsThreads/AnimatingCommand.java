package AnimationsThreads;

import interpreter.BroadcastingClearanceManager;
import avatars.Body;
import avatars.Scene;
import util.annotations.Tags;

@Tags({"animating command"})
public class AnimatingCommand implements Runnable{
	Body avatar;
	MoveInterface moveIt;
	Scene scene;
	BroadcastingClearanceManager clearance;

	public AnimatingCommand(Body avatar,BroadcastingClearanceManager clear)
	{
		this.avatar=avatar;
		MoveInterface moveAnimation = new MoveAnimation
				                    (this.avatar, 7, 25, 5, 450);
		this.moveIt=moveAnimation;
		this.clearance=clear;
	}
	@Override
	public void run() {
		this.clearance.waitForProceed();
		moveIt.move();
		}

}
