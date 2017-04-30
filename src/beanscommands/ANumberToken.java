package beanscommands;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"String","int","array"})
@EditablePropertyNames({"String"})
@Tags({"awordtoken"})
public abstract class ANumberToken implements ConvertNumber{

	String number;
	
	public ANumberToken(String userString)
	{this.number=userString;}
		
	
	public void setString(String letters)
		{
		this.number=letters;
		}
		    
	public String getString() 
		{
		return this.number;
		}
	
	public int getInt()  //return String of numbers to Integer form of numbers wihout the 0....prefix
	{
	getString();
	return Integer.parseInt(this.number);
	}


	@Override
	public SetAndGet[] getArray() {
		// TODO Auto-generated method stub
		return null;
	}
}

