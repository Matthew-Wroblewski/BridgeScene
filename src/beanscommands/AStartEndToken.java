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
@Tags({"astartendtoken"})

public abstract class AStartEndToken implements SetAndGet{

	String letter;
	
	public AStartEndToken(String userString)
	{letter=userString;}
		
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

