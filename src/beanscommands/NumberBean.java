package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","Int","array"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"Number Token"})
public class NumberBean extends ANumberToken implements ConvertNumber{
	public NumberBean(String info)
	{
		super(info);
	}
		    
}
