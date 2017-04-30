package avatars;
import pointsandlines.*;
import util.annotations.EditablePropertyNames;
import util.annotations.IsCompositeShape;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.Tags;
@StructurePattern("Bean Pattern") 
@IsCompositeShape(true)
@PropertyNames({ "x","y","stringshape","legs","arms","head","torso","full"}) 
@EditablePropertyNames({ "x", "y","stringshape"})
@Tags({ "Avatar"})
public class Avatar extends ALocatable implements Body{
   TwoPoints arms,legs;
   BoundedShape torso;
   Skull avatarHeadNew;
   int originX,originY;
   StringShape text;
   
	public Avatar(Skull headOfAvatar,StringShape text,int x, int y){
		super(x,y);
		this.originX=x;
		this.originY=y;
		this.avatarHeadNew=headOfAvatar;
		this.text=text;
		TwoPoints arms =new Angle(45,30,x,y);
		TwoPoints legs=new Angle(45,30,x,y);
	    BoundedShape torso=new ALineStraight(1,1,0,40);
		this.arms=arms;
		this.legs=legs;
		this.torso=torso;
		connect();
		
		
	}
	public TwoPoints getLegs(){return legs;}
	public TwoPoints getArms(){return arms;}
	public BoundedShape getTorso(){return torso;}
	public Skull getHead(){return avatarHeadNew;}
	
	public StringShape getStringShape(){return this.text;}
	
	public void setStringShape(StringShape text)
	{
		this.text=text;
	}
	
	public void move(int x,int y)
	
	{
		originX+=x;  originY+=y;
		arms.getLeftSide().setX(originX);
		arms.getLeftSide().setY(originY);
		arms.getRightSide().setX(originX);
		arms.getRightSide().setY(originY);
		connect();
	}
	public void connect(){
			
		legs.getLeftSide().setX(originX);
		legs.getLeftSide().setY(originY+40);
		legs.getRightSide().setX(originX);
		legs.getRightSide().setY(originY+40);
		
	 	getTorso().setX(originX);  
	 	getTorso().setY(originY);
	 	
		getHead().setX(originX-28);  
		getHead().setY(originY-60);
		
		getStringShape().setX(originX-15);
		getStringShape().setY(originY-85);
	}
	
}
	
