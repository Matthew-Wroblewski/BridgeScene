package avatars;
import java.beans.PropertyChangeEvent;

import pointsandlines.ALocatable;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.STRING_PATTERN)
@PropertyNames({ "x", "y","text","full"}) 
@EditablePropertyNames({ "x", "y","text"})
@Tags({ "AStringShape"})
public class AStringShape extends ALocatable implements StringShape {
	String text;
	int x, y;

	public AStringShape(String initText, int initX, int initY) {
		super(initX,initY);
		text = initText;
		x = initX;
		y = initY;
	}
	
	public String getText() {return text;}
	public void setText(String newVal) {
		
		String oldVal = getText();
		this.text = newVal;
		notifyAllListeners(new PropertyChangeEvent(this, "Text", oldVal, newVal));
	}

}
