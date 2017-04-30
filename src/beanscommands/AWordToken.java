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
@Tags({"awordtoken"})

public abstract class AWordToken implements ToLowerCase{

	String letter;
	
	public AWordToken(String userString)
	{letter=userString;}
		
		public String getLowerCase() 
		{
		getString();
		return this.letter.toLowerCase();
		}
	
	public void setString(String letters)
		{
		this.letter=letters;
		}
		    
	public String getString() 
		{
		return this.letter;
		}

	@Override
	public SetAndGet[] getArray() {
		// TODO Auto-generated method stub
		return null;
	}
}
