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
@Tags({"sleep"})
public class Sleep extends AWordToken implements ToLowerCase{
	public Sleep(String info)
	{
		super(info);
	}
		    
}
