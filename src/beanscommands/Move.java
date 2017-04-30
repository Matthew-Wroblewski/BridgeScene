package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","LowerCase","array"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"move"})
public class Move extends AWordToken implements ToLowerCase{
	public Move(String info)
	{
		super(info);
	}
		    
}
