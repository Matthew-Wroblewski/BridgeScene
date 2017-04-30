package AnimationsThreads;

import avatars.Body;
import avatars.Scene;
import util.annotations.Tags;

@Tags({"animating command"})
public class SyncCommandX implements Runnable{
	Body avatar;
	MoveInterface moveIt;
	Scene scene;

	public SyncCommandX(MoveInterface moveAnimation)
	{
		this.avatar=avatar;
	//	SyncAnimation moveAnimation = new SyncAnimation
				    //                (this.avatar, 3, 25, 5, 450);
		this.moveIt=moveAnimation;
	}
	

	@Override
	public void run() {
		moveIt.moveX();
		
	}

}
