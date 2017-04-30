package interpreter;
import java.util.ArrayList;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.Tags;
import avatars.*;
@PropertyNames({"ArrayList","ArrayList1"})
@Tags({"Generic Table"})
public class GenTable implements GenericTable<String,Object> {
	
	ArrayList<String> keys1=new ArrayList<String>();
	ArrayList<Object> values1=new ArrayList<Object>();

	public GenTable()
	{
	ArrayList<String> keys=new ArrayList<String>();
	ArrayList<Object> values=new ArrayList<Object>();
	
	this.keys1=keys;
	this.values1=values;    
	}
	


	public void put(String key,Object val){
		
	if (key==null  ||val==null)
	{
			
	}
	
	else if (keys1.size()==0)
	{
		keys1.add(key);
		values1.add(val);
	}
	
	
	else 
	{
		for (int i=0; i<keys1.size()+1; i++)
		{
		      if(keys1.get(i).equalsIgnoreCase(key))
		    		  {
		    	  			keys1.remove(i);
		    	  			values1.remove(i);
		    	  			keys1.add(i, key);
		    	  			values1.add(i, val);
		    	  			break;
		    		  }
		      else
		      {
		    	  keys1.add(key);
		    	  values1.add(val);
		    	  break;
		      }
		  }}
	}
	
	public Object get(String key)
	{
		
		for(int i=0; i< keys1.size();i++)
		{
			if(keys1.get(i).equalsIgnoreCase(key))
			{
				 return values1.get(i);
			}
			
		}
		return null;
	}
	public ArrayList<String> getArrayList(){return this.keys1;}
	public ArrayList<Object> getArrayList1(){return this.values1;}

}
	
