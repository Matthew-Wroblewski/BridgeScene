package pointsandlines;
import java.beans.PropertyChangeEvent;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN) 
@PropertyNames({ "x", "y","width","height","full"}) 
@EditablePropertyNames({ "x", "y","width","height"})
@Tags({ "Bounded Shape"})
public abstract class ABoundedShape extends ALocatable implements BoundedShape {
	int width,height;
	
	public ABoundedShape(int initX,int initY,int initWidth,int initHeight)	
	{
		super(initX,initY);
		this.width=initWidth;
		this.height=initHeight;
	}
	
 	    public int getWidth() {return width;}
	    public int getHeight() {return height;}
	    public void setWidth(int newWidth) {
	    	int oldVal =this.width;
	    	this.width = newWidth;
	    	notifyAllListeners(new PropertyChangeEvent(this, "Width", oldVal,newWidth));
	    	}
	 
	    public void setHeight(int newHeight) {this.height=newHeight;}
}
