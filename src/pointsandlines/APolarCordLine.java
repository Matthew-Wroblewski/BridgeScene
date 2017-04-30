package pointsandlines;
import java.beans.PropertyChangeEvent;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"x", "y","width","height","radius","angle","full"})
@EditablePropertyNames({ "x", "y","radius","angle"})
@StructurePattern(StructurePatternNames.LINE_PATTERN)
@Tags({ "APolarCordLine"})
public class APolarCordLine extends ALocatable implements PolarCordLine {
	int x, y; double angle, radius; 
;
	
	public APolarCordLine (double angle, double radius, int x, int y){
		super(x, y);
		this.radius = radius;
		this.angle=angle;
		this.setX(x);
		this.setY(y);
		}
	
	public double getAngle() {return this.angle;}
	
	public void setAngle(double newAngle) {this.angle=newAngle;}
	
	public double getRadius() {return this.radius;}
	
	public void setRadius(double newRadius) {this.radius=newRadius;}
	
	public void rotate(double newAngle)
	{
		int oldWidth = getWidth();
		int oldHeight =getHeight();
		//Convert Angle from Radians to Degrees///////////
		double oldAngle = getAngle()*(180/Math.PI);
		this.angle+=newAngle*Math.PI/180;
		newAngle+=oldAngle;
		
		notifyAllListeners(new PropertyChangeEvent(this, "Angle", oldAngle, newAngle));
		
		int newWidth=getWidth();
		notifyAllListeners(new PropertyChangeEvent(this, "Width", oldWidth, newWidth));
		
		
		int newHeight=getHeight();
		notifyAllListeners(new PropertyChangeEvent(this, "Height", oldHeight, newHeight));
	}
	public int getWidth() {
		return (int) (getRadius()*Math.cos(getAngle()));}
	public int getHeight() {
		return (int) (getRadius()*Math.sin(getAngle()));}
	
	
}
