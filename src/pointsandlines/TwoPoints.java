package pointsandlines;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.LINE_PATTERN)
public interface TwoPoints{
	public PolarCordLine getRightSide();
	public PolarCordLine getLeftSide();
	public void setX(int x);
	public int getY();
	public int getX();
	public void setY(int y);

}
