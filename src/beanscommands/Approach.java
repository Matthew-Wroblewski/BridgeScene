package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","LowerCase","array"})
@EditablePropertyNames({"String"})
@Tags({"approach"})
public class Approach extends AWordToken implements ToLowerCase{
	public Approach(String info)
	{
		super(info);
	}
	@Override
	public SetAndGet[] getArray() {
		// TODO Auto-generated method stub
		return null;
	}
		    
}
