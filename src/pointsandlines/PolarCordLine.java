package pointsandlines;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.LINE_PATTERN)
public interface PolarCordLine extends Locatable
{
	public int getWidth();
	public int getHeight();
	public double getAngle();
	public void setAngle(double newAngle);
	public double getRadius();
	public void setRadius(double newRadius);
	public void rotate(double newAngle);
}
