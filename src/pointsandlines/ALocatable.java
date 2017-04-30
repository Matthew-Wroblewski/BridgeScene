package pointsandlines;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import util.annotations.EditablePropertyNames;
import util.annotations.Explanation;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.POINT_PATTERN)
@Explanation("Uses Cartesian representation.")
@PropertyNames({ "x","y","full"}) 
@EditablePropertyNames({"x","y"})
@Tags({ "ALocatable"})
public abstract class ALocatable implements Locatable
 {	
	    int x, y;
		public final int MAX_SIZE = 50;
		PropertyChangeListener[] contents = new PropertyChangeListener[MAX_SIZE];
	    int size=0;
	    


		public ALocatable(int theX, int theY) {
			x = theX;
			y = theY;}
		
		   public boolean isFull() {
		        return size == MAX_SIZE;

		    }
	    public void add(PropertyChangeListener l) {
	        if (isFull())
	            System.out.println("Adding item to a full collection");
	        else {
	            contents[size] = l;
	            size++;
	            }
	        }
		   public int size() {
		        return size;
		    }
		    
		    public PropertyChangeListener get (int index) {
		        return contents[index];
		    }
		    public void notifyAllListeners(PropertyChangeEvent event) {
		        for (int index = 0; index < size(); index++) {
		            get(index).propertyChange(event);
		        }
		    }

		public int getX() { return x; }
		public int getY() { return y; }
		
		public void setX(int newVal) {
			  int oldVal = getX();
			  this.x=newVal;
			  notifyAllListeners(new PropertyChangeEvent(this, "X", oldVal, newVal));
	    	}

		public void setY(int newVal) {
		  int oldVal = getY();
		  this.y=newVal;
		  notifyAllListeners(new PropertyChangeEvent(this, "Y", oldVal, newVal));}
		
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			add(listener);
		}

}


