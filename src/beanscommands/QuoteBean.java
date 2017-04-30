package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","array"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"Quote Token"})
public class QuoteBean extends AStartEndToken implements SetAndGet{
	public QuoteBean(String info)
	{
		super(info);
	}
		    
}

