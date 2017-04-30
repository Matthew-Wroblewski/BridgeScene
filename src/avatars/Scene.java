package avatars;

import java.beans.PropertyChangeListener;
import pointsandlines.BoundedShape;
import util.models.PropertyListenerRegisterer;

public interface Scene extends PropertyChangeListener, PropertyListenerRegisterer {
	public boolean isOccupied();
	public boolean isKnightTurn();
	public BoundedShape getOval1();
	public BoundedShape getOval2();
	public BoundedShape getBridge();
	public BoundedShape getBridge1();
	public BoundedShape getBridge2();
	public BoundedShape getBridge3();
	public Body getArthur();
	public Body getLancelot();
	public Body getGalahad();
	public Body getRobin();
	public Body getGuard();
	public Body getKnight();
	public boolean occupied();
	public boolean knightTurn();;
	public void approach(Body body1);
	public void say(String talk);
	public void passed();
	public void failed();
}
