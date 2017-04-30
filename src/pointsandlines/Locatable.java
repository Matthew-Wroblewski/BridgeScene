package pointsandlines;

import util.models.PropertyListenerRegisterer;
import util.annotations.Tags;
@Tags({"Locatable"})
public  interface Locatable extends PropertyListenerRegisterer {
	
	public int getX();
	public int getY();
	public void setX(int newX);
	public void setY(int newY);
}
