package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","LowerCase","array"})
@EditablePropertyNames({"String"})
@Tags({"Word Token"})
public class LetterBean extends AWordToken implements ToLowerCase{
	public LetterBean(String info)
	{
		super(info);
	}
		    
}

