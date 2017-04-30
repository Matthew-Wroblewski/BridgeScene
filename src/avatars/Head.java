package avatars;
import pointsandlines.ABoundedShape;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.LABEL_PATTERN)
@PropertyNames({"x","y","width","height","imagefilename","full"}) 
@EditablePropertyNames({"x","y","width","height","imagefilename"})
@Tags({ "Head"})
public class Head extends ABoundedShape implements Skull {
	 String imageFileName;
     int x, y, height, width;
     public Head (String initImageFileName, int initX, int initY, int initHeight, int initWidth) {	
    	 super(initX,initY,initHeight,initWidth);
    	imageFileName = initImageFileName;
    	x = initX;
    	y = initY;    
    	height = initHeight;
    	width = initWidth;
     }          
 
    public String getImageFileName() {return imageFileName;}  
    public void setImageFileName(String newVal) {imageFileName = newVal ;}     

}
