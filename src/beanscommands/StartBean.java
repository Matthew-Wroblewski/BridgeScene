package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","array"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"Start Token"})
public class StartBean extends AStartEndToken implements SetAndGet{
	public StartBean(String info)
	{
		super(info);
	}
		    
}
