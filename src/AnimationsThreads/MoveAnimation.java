package AnimationsThreads;

import util.annotations.Tags;
import util.misc.ThreadSupport;
import avatars.Body;

@Tags({"animator"})
public class MoveAnimation implements MoveInterface{

	Body avatar;
    int animationStep;
    int animationPauseTime;
    protected  int startX,endX;
    
    public MoveAnimation (Body avatar,
    		int anAnimationStep, int anAnimationPauseTime,int startX,int endX) {
    	this.avatar = avatar;
    	this.startX=startX;
    	this.endX=endX;
        animationStep = anAnimationStep;
        animationPauseTime = anAnimationPauseTime;
        
      
    }
    public void move()
    {
    	  startX=this.avatar.getTorso().getX();
    	  this.avatar.connect();
    	  while (this.avatar.getTorso().getX()< this.endX)
          {
          	ThreadSupport.sleep(animationPauseTime);
          	startX += animationStep;
          	this.avatar.getTorso().setX(startX+25);

          	this.avatar.getHead().setX(startX);

          	this.avatar.getLegs().getLeftSide().setX(startX+25);
          	this.avatar.getLegs().getRightSide().setX(startX+25);
          	
        	this.avatar.getArms().getRightSide().setX(startX+25);
          	this.avatar.getArms().getLeftSide().setX(startX+25);

          }

    }
	@Override
	public void moveX() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveY() {
		// TODO Auto-generated method stub
		
	}
    
 
}
/*  public void run() {
        int distance = 0;
        while(distance <= displacement){
        	this.avatar.setX(this.avatar.getX() -animationStep);       
        	distance += animationStep;
        	ThreadSupport.sleep(animationPauseTime);*/
        
    


