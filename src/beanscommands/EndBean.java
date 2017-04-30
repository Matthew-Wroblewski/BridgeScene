package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","array"})
@EditablePropertyNames({"String"})
@Tags({"End Bean"})
public class EndBean extends AStartEndToken implements SetAndGet{
	public EndBean(String info)
	{
		super(info);
	}
	
		    
}
