package beanscommands;
import bus.uigen.OEFrame;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@PropertyNames({"String","Array"})
@EditablePropertyNames({"String"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@Tags({"Scanner Bean"})
public class ScannerBean implements SetArray
{
    String stuffString;
	SetAndGet[] holderArray =new SetAndGet[100];
    SetAndGet[] compactArray;
	
	public ScannerBean(){}  //no arg constructor
	public SetAndGet[] getArray(){return compactArray;}
	public String getString(){return stuffString;}
	
	public void setString(String scannedString)
	{
		    stuffString=scannedString;
		    int element = 0;
			int index = 0;
		    String userInput="";
		    while (index < scannedString.length()) 
		    {
		        //If '.' is entered exit program
		    	if (scannedString.charAt(index)=='.')
		    		{
		    		System.out.print("You've entered an invalid character.  Goodbye!");
		    		break;
		    		}
		    	
		    	//STRING FORMATTING LOGIC BEGIN ****************************************************
		    	else if (scannedString.charAt(index)=='{')
		  		{
			  	userInput+=scannedString.charAt(index);
			  	SetAndGet myStartB = new StartBean(userInput);
		    	//System.out.println(myStartB);
		    	holderArray[element]=myStartB;
		    	userInput="";
		    	element++;
			  	index++;
		  		}
		    	
		    	
		    	
		    	else if (Character.isDigit(scannedString.charAt(index)))  //If content starts with number
			  		{												      //STRING FORMATTING LOGIC
				  	userInput+=scannedString.charAt(index);
				  	index++;
			  		}
		    	
		    	else if (Character.isLetter(scannedString.charAt(index))) //If content starts with letter
		  			{
		    		userInput+=scannedString.charAt(index);
		    		index++;
		  			}
		    	
		    	else if (scannedString.charAt(index)=='"') //If content is a Quoted String
		    	{
		    		index++; 
		    		do
		    		{
		    			userInput+=scannedString.charAt(index);
		        		index++;
		    			
		    		}while (scannedString.charAt(index)!='"');
		    		 
		    			if (scannedString.charAt(index)=='"')
				        {
				    	   
		    				SetAndGet myQB = new QuoteBean(userInput);  //STRING FORMATTING LOGIC
					    	//System.out.println(myQB);
					    	//System.out.println(myQB.getString());
		    				holderArray[element]=myQB;
		    		    	userInput="";
		    		    	element++;
				    	}
		    			
		    			if (scannedString.charAt(index)=='}')
				  		{
					  	userInput+=scannedString.charAt(index);
					  	SetAndGet myEndB = new EndBean(userInput);
					  	holderArray[element]=myEndB;
				    	element++;
					  	
				    	}
		    			index++;
		    	}//////////////////////////END CONDITIONAL LOOPS FOR QUOTED STRING
		    	else if (scannedString.charAt(index)=='}')
    			{
    				userInput+=scannedString.charAt(index);
    				SetAndGet myEndB = new EndBean(userInput);
    				holderArray[element]=myEndB;
			    	element++;
    				index++;
    			}
			  
		    	else if (scannedString.charAt(index)==' ')    //String formatting logic
		    			
		  	  		{
		    			
				       
		    			if (Character.isDigit(scannedString.charAt(index-1)))
				       {
				    	   ConvertNumber myNB = new NumberBean(userInput);
				    	   //System.out.println(myNB);
				    	  // System.out.println(myNB.getString());
				    	   //System.out.println(((ConvertNumber)myNB).getInt());
				    	   holderArray[element]=myNB;
					    	userInput="";
					    	element++;
						  	
				    	 
				    	   
				    	 	if (scannedString.charAt(index)=='}')
					  		{
						  	userInput+=scannedString.charAt(index);
						  	SetAndGet myEndB = new EndBean(userInput);
					    	System.out.println(myEndB);
					    	System.out.println(myEndB.getString());
					  		}

				       }
				       else if ((Character.isLetter(scannedString.charAt(index-1))))
				    	   	//String formatting logic
				       {
				    	   userInput+=scannedString.charAt(index);
				    	   if (userInput.equalsIgnoreCase("move "))
				    	   {
				    		   ToLowerCase myMoveBean = new Move(userInput);
					    	 
					    	   //System.out.println(((ToLowerCase)myMoveBean).getLowerCase());
					    	  
						    	holderArray[element]=myMoveBean;
						    	element++;
					    	   userInput="l";
					
				    				   
				    	   }
				    	   else if (userInput.equalsIgnoreCase("fail "))
			    	   	   {
				    		   ToLowerCase myFailBean = new Fail(userInput);
				    		   holderArray[element]=myFailBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("pass "))
			    	   	   {
				    		   ToLowerCase myPassBean = new Pass(userInput);
				    		   holderArray[element]=myPassBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("call "))
				    	   	   {
					    		   ToLowerCase myCallBean = new Call(userInput);
					    		   holderArray[element]=myCallBean;
					    		   element++;
						    	   userInput="l";
					    	   }
				    	   else if (userInput.equalsIgnoreCase("define "))
				    	   {
				    		   ToLowerCase myDefineBean = new Call(userInput);
				    		   holderArray[element]=myDefineBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("proceedall "))
				    	   {
				    		   ToLowerCase myProceedBean = new Call(userInput);
				    		   holderArray[element]=myProceedBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("repeat "))
			    	   	   {
				    		   ToLowerCase myRepeatBean = new Repeat(userInput);
				    		   holderArray[element]=myRepeatBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   
				    	   else if (userInput.equalsIgnoreCase("approach "))
			    	   	   {
				    		   ToLowerCase myApproachBean = new Approach(userInput);
				    		   holderArray[element]=myApproachBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("passed "))
			    	   	   {
				    		   ToLowerCase myPassBean = new Pass(userInput);
				    		   holderArray[element]=myPassBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("failed "))
			    	   	   {
				    		   ToLowerCase myFailBean = new Fail(userInput);
				    		   holderArray[element]=myFailBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("rotateleftarm "))
			    	   	   {
				    		   ToLowerCase myRotateLBean = new Call(userInput);
				    		   holderArray[element]=myRotateLBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("rotaterightarm "))
			    	   	   {
				    		   ToLowerCase myRotateRBean = new Call(userInput);
				    		   holderArray[element]=myRotateRBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("say "))
			    	   	   {
				    		   ToLowerCase mySayBean = new Say(userInput);
				    		   holderArray[element]=mySayBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("sleep "))
			    	   	   {
				    		   ToLowerCase mySleepBean = new Call(userInput);
				    		   holderArray[element]=mySleepBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("say "))
			    	   	   {
				    		   ToLowerCase mySayBean = new Say(userInput);
				    		   holderArray[element]=mySayBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("thread "))
			    	   	   {
				    		   ToLowerCase myThreadBean = new Call(userInput);
				    		   holderArray[element]=myThreadBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("undo "))
			    	   	   {
				    		   ToLowerCase myUndoBean = new Call(userInput);
				    		   holderArray[element]=myUndoBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   else if (userInput.equalsIgnoreCase("wait "))
			    	   	   {
				    		   ToLowerCase myWaitBean = new Call(userInput);
				    		   holderArray[element]=myWaitBean;
				    		   element++;
					    	   userInput="l";
				    	   }
				    	   
				    	    if (scannedString.charAt(index)=='}')
					  		{
						  	userInput+=scannedString.charAt(index);
						  	SetAndGet myEB = new EndBean(userInput);
					    	System.out.println(myEB.getString());
					  		}
				    	   
				    	   else if (userInput.equalsIgnoreCase("l")==false)
				    	   {
				    	   ToLowerCase myLB = new LetterBean(userInput);
				    	   SetAndGet myStartB = new StartBean(userInput);
					    	holderArray[element]=myLB;
					    	userInput="";
					    	element++;
						  
				    	   }
				    	   
				       }
				       
				    userInput="";
				  	index++;
		  	  		}//STRING FORMATTING LOGIC END *************************************************
		      
		    	
		    }//End while loop******
		    
		    SetAndGet[] arrayCompacted =new SetAndGet[element];
		    for(int element1=0;element1<element;element1++)
	    	{
		    	arrayCompacted[element1]=holderArray[element1];
	    		
	    	}
		   compactArray=arrayCompacted;
	}
	
	   
}
	