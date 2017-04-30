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
@Tags({"define"})
public class Define extends AWordToken implements ToLowerCase{
	public Define(String info)
	{
		super(info);
	}
		    
}
