package beanscommands;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;

@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","LowerCase","array"})
@EditablePropertyNames({"String"})
@Tags({"fail"})
public class Fail extends AWordToken implements ToLowerCase{
	public Fail(String info)
	{
		super(info);
	}
	
}
