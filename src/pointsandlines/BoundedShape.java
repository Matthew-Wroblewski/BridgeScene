package pointsandlines;

import java.beans.PropertyChangeListener;
import util.annotations.Tags;
@Tags({"Bounded Shape"})
public interface BoundedShape extends Locatable {

	public void add(PropertyChangeListener l);
	 public boolean isFull();
	public int getWidth();
    public int getHeight();
    public void setWidth(int newHeight);
    public void setHeight(int newWidth);
}
