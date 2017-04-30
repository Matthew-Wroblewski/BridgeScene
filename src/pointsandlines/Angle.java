package pointsandlines;
import util.annotations.IsCompositeShape;
import util.annotations.StructurePattern;
@StructurePattern("Bean Pattern") 
@IsCompositeShape(true)
public class Angle extends ALocatable implements TwoPoints {
int x, y;
double angle,radius;
PolarCordLine leftSide;
PolarCordLine rightSide;
	
public Angle (double angle, double radius, int x,int y) {
		super(x,y);
		rightSide =new APolarCordLine(angle*Math.PI/180,radius,x,y);
		leftSide =new APolarCordLine((angle+90)*Math.PI/180,radius,x,y);
		this.x=x;
		this.y=y;
		
		this.angle=angle;
		this.radius=radius;
	}
	public PolarCordLine getRightSide(){return rightSide;}
	public PolarCordLine getLeftSide(){return leftSide;}
}
