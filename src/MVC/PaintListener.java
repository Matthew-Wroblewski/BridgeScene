package MVC;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import avatars.*;
import pointsandlines.*;
import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;
@Tags({"Inheriting Bridge Scene Painter"})
public class PaintListener extends Component implements PropertyChangeListener{
	Scene bridgeScene;
    BasicStroke dotted = new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 
            5f, new float[] {2f}, 0f);
    
    public PaintListener(Scene theScene){
    	  bridgeScene = theScene;
    
    	  bridgeScene.getGalahad().getStringShape().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getArthur().getStringShape().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getGuard().getStringShape().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getLancelot().getStringShape().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getRobin().getStringShape().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getHead().addPropertyChangeListener(this);
    }
   
    public void propertyChange(PropertyChangeEvent arg0) {
    	repaint();
    	}
    	
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(dotted);
        g.setColor(Color.BLACK);     
        draw(g2, bridgeScene);
    }
    
   public void draw(Graphics2D g, Scene theScene) {
	   
	   	
	   	draw(g,theScene.getBridge());
   		draw(g,theScene.getBridge1());
   		draw(g,theScene.getBridge2());
   		draw(g,theScene.getBridge3());
   	
   		draw(g,theScene.getOval1());
   		draw(g,theScene.getOval2());
   	
    	draw(g, theScene.getArthur().getStringShape());
    	draw(g, theScene.getArthur().getHead());
    	draw(g, theScene.getArthur().getTorso());
    	draw(g,theScene.getArthur().getArms().getLeftSide());
    	draw(g,theScene.getArthur().getArms().getRightSide());
    	draw(g,theScene.getArthur().getLegs().getLeftSide());
    	draw(g,theScene.getArthur().getLegs().getRightSide());
    	
    	draw(g, theScene.getLancelot().getStringShape());
    	draw(g, theScene.getLancelot().getHead());
    	draw(g, theScene.getLancelot().getTorso());
    	draw(g,theScene.getLancelot().getArms().getLeftSide());
    	draw(g,theScene.getLancelot().getArms().getRightSide());
    	draw(g,theScene.getLancelot().getLegs().getLeftSide());
    	draw(g,theScene.getLancelot().getLegs().getRightSide());
    	
    	draw(g, theScene.getGalahad().getStringShape());
    	draw(g, theScene.getGalahad().getHead());
    	draw(g, theScene.getGalahad().getTorso());
    	draw(g,theScene.getGalahad().getArms().getLeftSide());
    	draw(g,theScene.getGalahad().getArms().getRightSide());
    	draw(g,theScene.getGalahad().getLegs().getLeftSide());
    	draw(g,theScene.getGalahad().getLegs().getRightSide());
    	
    	draw(g, theScene.getRobin().getStringShape());
    	draw(g, theScene.getRobin().getHead());
    	draw(g, theScene.getRobin().getTorso());
    	draw(g,theScene.getRobin().getArms().getLeftSide());
    	draw(g,theScene.getRobin().getArms().getRightSide());
    	draw(g,theScene.getRobin().getLegs().getLeftSide());
    	draw(g,theScene.getRobin().getLegs().getRightSide());
    	
    	draw(g, theScene.getGuard().getStringShape());
    	draw(g, theScene.getGuard().getHead());
    	draw(g, theScene.getGuard().getTorso());
    	draw(g,theScene.getGuard().getArms().getLeftSide());
    	draw(g,theScene.getGuard().getArms().getRightSide());
    	draw(g,theScene.getGuard().getLegs().getLeftSide());
    	draw(g,theScene.getGuard().getLegs().getRightSide());

    }

    public void draw(Graphics g, StringShape aLabel) {
        String s = aLabel.getText();
        g.drawString(s, aLabel.getX(), aLabel.getY());      
    }
    
    public  void draw(Graphics2D g, Skull anImage) {
        Image img = Toolkit.getDefaultToolkit().getImage(anImage.getImageFileName());
        g.drawImage(img, anImage.getX(), anImage.getY()-17, this); 
        
    }
    
    public  void draw(Graphics2D g, BoundedShape torso) {
    	if(torso instanceof ALineStraight)
    	 g.drawLine(torso.getX(),torso.getY(),torso.getX() + torso.getWidth(), torso.getY() + torso.getHeight());
    	else
    		g.drawOval(torso.getX(),torso.getY(), torso.getWidth(), torso.getHeight());
    }		
    public  void draw(Graphics2D g, PolarCordLine legOrArm) {
   	 g.drawLine(legOrArm.getX(),legOrArm.getY(),legOrArm.getX() + legOrArm.getWidth(), legOrArm.getY() + legOrArm.getHeight());

   	}

	public void register (PropertyListenerRegisterer aPropertyChangeRegister){
		aPropertyChangeRegister.addPropertyChangeListener(this);        
	}

}