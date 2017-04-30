package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","LowerCase","pass"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"proceedall"})
public class ProceedAll extends AWordToken implements ToLowerCase{
	public ProceedAll(String info)
	{
		super(info);
	}
		    
}
