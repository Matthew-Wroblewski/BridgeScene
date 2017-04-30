package pointsandlines;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.OVAL_PATTERN) 
@PropertyNames({ "x", "y","width","height","full"}) 
@EditablePropertyNames({ "x", "y","width","height"})
@Tags({ "Oval"}) 
public class AOval extends ABoundedShape {
	int x,y,width,height;
	public AOval (int initX,int initY,int initWidth, int initHeight)
	{
		super(initX,initY,initWidth,initHeight);
	}
}
