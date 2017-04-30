package avatars;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import MVC.*;
import pointsandlines.*;
import util.annotations.IsCompositeShape;
import util.annotations.StructurePattern;
import util.annotations.Visible;

@StructurePattern("Bean Pattern") 
@IsCompositeShape(true)


public class BridgeScene implements Scene{
	
	APropertyListenerSupport propertySupport = new APropertyListenerSupport();
	Body knight;
	boolean occupied,knightTurn=false;
	BoundedShape bridgeLeft,bridgeRight,bridgeMid,bridgeMid1,oval1,oval2;
	String arthurPic="arthurmw.jpg", lancelotPic="lancelotmw.jpg", galahadPic = "galahadmw.jpg",
	guardPic="guardmw.jpg",robinPic = "robinmw.jpg";
	Body arthur, lancelot, galahad, robin, guard;
	Skull arthurHead=new Head      (arthurPic, 1, 1,  60, 60);
	Skull lancelotHead=new Head (lancelotPic,  1, 1,  60, 60);
	Skull galahadHead=new Head   (galahadPic,  1, 1,  60, 60);
	Skull robinHead=new Head       (robinPic,  1, 1,  60, 60);
	Skull guardHead=new Head       (guardPic,  1, 1,  60, 60);
	
	StringShape arthurString=new AStringShape(" ",1,1);
	StringShape lancelotString=new AStringShape(" ",1,1);
	StringShape galahadString=new AStringShape(" ",1,1);
	StringShape robinString=new AStringShape(" ",1,1);
	StringShape guardString=new AStringShape(" ",1,1);
	
	
	public BridgeScene (){
		BoundedShape oval1 = new AOval(423,300,75,75);
		this.oval1=oval1;
		BoundedShape oval2 = new AOval(323,300,75,75);
		this.oval2=oval2;
	    BoundedShape bridge = new ALineStraight(500,0,0,700);
	    this.bridgeLeft=bridge;
	    BoundedShape bridge1 = new ALineStraight(700,0,0,700);
	    this.bridgeRight=bridge1;
	    BoundedShape bridge2 = new ALineStraight(500,300,200,0);
	    this.bridgeMid=bridge2;
	    BoundedShape bridge3 = new ALineStraight(500,400,200,0);
	    this.bridgeMid1=bridge3;
		Body one=new Avatar(arthurHead,arthurString,100, 100);
		this.arthur=one;
		Body two=new Avatar(lancelotHead,lancelotString,100,300);
		this.lancelot=two;
		Body three=new Avatar(galahadHead,galahadString,200,90);
		this.galahad=three;
		Body four=new Avatar(guardHead,guardString,460,280);
		this.guard=four;
		Body five=new Avatar(robinHead,robinString,200,250);
		this.robin=five;

	}
	
	public BoundedShape getOval1(){return this.oval1;}
	public BoundedShape getOval2(){return this.oval2;}
	public BoundedShape getBridge(){return this.bridgeLeft;}
	public BoundedShape getBridge1(){return this.bridgeRight;}
	public BoundedShape getBridge2(){return this.bridgeMid;}
	public BoundedShape getBridge3(){return this.bridgeMid1;}
	public Body getArthur(){return this.arthur;}
	public Body getLancelot(){return this.lancelot;}
	public Body getGalahad(){return this.galahad;}
	public Body getRobin(){return this.robin;}
	public Body getGuard(){return this.guard;}
	@Visible(false)
	public Body getKnight(){return this.knight;}
	public boolean isOccupied(){return this.occupied;}
	public boolean isKnightTurn(){return this.knightTurn;}

	public boolean preApproach()
	{
		return !this.occupied;
	}
	
	public void approach(Body armslegs)
	{
		assert preApproach();
		this.knight=armslegs;
		
		if(this.knight.getArms().getLeftSide().getX()< this.guard.getArms().getLeftSide().getX())
		{
			this.knight.move(getGuard().getArms().getX()-this.knight.getArms().getLeftSide().getX()-100
							,getGuard().getArms().getY()-this.knight.getArms().getLeftSide().getY());
		}
		else
		{
			this.knight.move(-(getGuard().getArms().getX()-this.knight.getArms().getX()+115)
					,-(getGuard().getArms().getY()-this.knight.getArms().getY()-15));
		}
			occupied();
			propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
					"approach", preApproach()));
			propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
					"say    ", preSay()));
			propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
					"fail", preFail()));	
		
	}
	
public boolean occupied()
{
	occupied=true;
	return occupied;
}

public boolean knightTurn()
{
	this.knightTurn=true;
	return knightTurn;
	}

public boolean preSay()
{
	return this.occupied;
}
public void say(String talk)
{
	assert preSay();
	if(!knightTurn)
	{
		this.guard.getStringShape().setText(talk);
		knightTurn();
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"pass", prePass()));
	}
	else if(knightTurn)
	{
		this.guard.getStringShape().setText("");
		this.knight.getStringShape().setText(talk);
		this.knightTurn=false;
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"pass", prePass()));
	}
}

public boolean prePass()
{
	return !this.knightTurn && this.occupied;
}
public void passed()
{
		assert prePass();
		this.knight.move(375,0);
		this.occupied=false;
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"pass", prePass()));
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"approach", preApproach()));
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"fail", preFail()));	
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"say    ", preSay()));
	
}
public boolean preFail()
{
	return this.occupied;
}
public void failed()
{
	assert preFail();
	if(knightTurn==true)
	{
		this.guard.move(560, 340);	
	}
	else
	{
		this.knight.move(200,240);
		this.occupied=false;
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
		"fail", preFail()));	
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"approach", preApproach()));
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"say    ", preSay()));
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "this",
				"pass", prePass()));
		}
		
	}
	
@Override
public void propertyChange(PropertyChangeEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addPropertyChangeListener(PropertyChangeListener listener) {
	propertySupport.add(listener);
}
}

