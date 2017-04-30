package AnimationsThreads;

import util.annotations.Tags;
import util.misc.ThreadSupport;
import avatars.Body;

@Tags({"sync animator"})
public class SyncAnimation implements MoveInterface{

	Body avatar;
    int animationStep;
    int animationPauseTime;
    protected  int startX,endX, startY, endY;
    
    public SyncAnimation (Body avatar,
    		int anAnimationStep, int anAnimationPauseTime,int startX,int endX) {
    	this.avatar = avatar;
    	this.startX=startX;
    	this.endX=endX;
    	this.startY=startX;
    	this.endY=endX;
        animationStep = anAnimationStep;
        animationPauseTime = anAnimationPauseTime;
        
      
    }
    public synchronized void moveX()
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
    	  public synchronized void moveY()
    	    {
    	    	//  startY=this.avatar.getTorso().getY();
    	        //  this.avatar.connect();
    	    	  while (this.avatar.getLegs().getLeftSide().getAngle() < 50)
    	          {
    	          	ThreadSupport.sleep(animationPauseTime);
    	          	startY += animationStep;
    	          	this.avatar.getLegs().getLeftSide().rotate(10);

    	          }

    }
		@Override
		public void move() {
			// TODO Auto-generated method stub
			
		}
    
 
}
/*  public void run() {
        int distance = 0;
        while(distance <= displacement){
        	this.avatar.setX(this.avatar.getX() -animationStep);       
        	distance += animationStep;
        	ThreadSupport.sleep(animationPauseTime);*/
        
    


