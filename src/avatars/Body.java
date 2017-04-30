package avatars;
import pointsandlines.*;
public interface Body extends Locatable {
	
	public TwoPoints getLegs();
	public TwoPoints getArms();
	public BoundedShape getTorso();
	public Skull getHead();
	public void setStringShape(StringShape text);
	public StringShape getStringShape();
	public void move(int x,int y);
	public void connect();
}
