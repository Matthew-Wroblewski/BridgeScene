package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","LowerCase"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"rotateleftarm"})
public class RotateLeftArm extends AWordToken implements ToLowerCase{
	public RotateLeftArm(String info)
	{
		super(info);
	}
		    
}
