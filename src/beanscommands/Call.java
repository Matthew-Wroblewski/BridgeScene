package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","LowerCase"})
@EditablePropertyNames({"String"})
@Tags({"call"})
public class Call extends AWordToken implements ToLowerCase{
	public Call(String info)
	{
		super(info);
	}
		    
}
