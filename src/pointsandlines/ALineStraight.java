package pointsandlines;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({ "x", "y","width","height","full"}) 
@EditablePropertyNames({ "x", "y","width","height"})
@StructurePattern(StructurePatternNames.LINE_PATTERN) 
@Tags({ "ALineStraight"})
public class ALineStraight extends ABoundedShape implements PropertyChangeListener{
	int x,y,width,height;
	public ALineStraight (int initX,int initY,int initWidth, int initHeight)
	{
		super(initX,initY,initWidth,initHeight);
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
}