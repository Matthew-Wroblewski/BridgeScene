package CommandClasses;
import util.annotations.Tags;
import avatars.Avatar;
import avatars.Body;
@Tags({"move command"})
public class MoveCommand implements Runnable {
Body avatar;
int x,y;
public MoveCommand(Body body,int x,int y)
{
	this.avatar=body;
	this.x=x;
	this.y=y;
}
	@Override
	public void run() {
		this.avatar.move(this.x, this.y);
	}

}
