package MVC;

import interpreter.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
import avatars.*;
@Tags({ "Console Scene View"})
public class ConsoleSceneView implements PropertyChangeListener{
	
	Scene monty;
	Interpreter interpret;

	public ConsoleSceneView(Scene bridgeScene)
	{
	     this.monty=bridgeScene;
		
		 // bridgeScene.addPropertyChangeListener(this);
		  
	/*	  bridgeScene.getGalahad().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getGalahad().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getArthur().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getArthur().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getRobin().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getRobin().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getLancelot().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getLancelot().getHead().addPropertyChangeListener(this);
		  
		  bridgeScene.getGuard().getArms().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getArms().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getLegs().getLeftSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getLegs().getRightSide().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getTorso().addPropertyChangeListener(this);
		  bridgeScene.getGuard().getHead().addPropertyChangeListener(this);   */
		  
		
		  
	}
					
	public void propertyChange(PropertyChangeEvent arg0) {
		String current = "";
	//	if (arg0.getSource() == this.monty.getArthur())
			//current = "Arthur";
		//if  (arg0.getSource() ==this.monty)
		//	current = "Scene";
		/*else if (arg0.getSource() == this.monty.getArthur().getHead())
			current = "ArthurHead";
		else if (arg0.getSource() == this.monty.getArthur().getStringShape())
			current = "ArthurStringShp";
		else if (arg0.getSource() == this.monty.getArthur().getHead())
			current = "ArthurHead";
		else if (arg0.getSource() == this.monty.getArthur().getArms().getLeftSide())
			current = "ArthurLeftArm";
		else if (arg0.getSource() == this.monty.getArthur().getArms().getRightSide())
			current = "ArthurRightArm";
		else if (arg0.getSource() == this.monty.getArthur().getLegs().getLeftSide())
			current = "ArthurLeftLeg";
		else if (arg0.getSource() == this.monty.getArthur().getLegs().getRightSide())
			current = "ArthurRightLeg";
		else if (arg0.getSource() == this.monty.getArthur().getTorso())
			current = "ArthurTorso";
		else if (arg0.getSource() == this.monty.getGalahad().getStringShape())
			current = "GalahadStringShp";
		else if (arg0.getSource() == this.monty.getGalahad().getArms().getLeftSide())
			current = "GalahadLeftArm";
		else if (arg0.getSource() == this.monty.getGalahad().getArms().getRightSide())
			current = "GalahadRightArm";
		else if (arg0.getSource() == this.monty.getGalahad().getLegs().getLeftSide())
			current = "GalahadLeftLeg";
		else if (arg0.getSource() == this.monty.getGalahad().getLegs().getRightSide())
			current = "GalahadRightLeg";
		else if (arg0.getSource() == this.monty.getGalahad().getTorso())
			current = "GalahadTorso";
		else if (arg0.getSource() == this.monty.getLancelot())
			current = "Lancelot";
		else if (arg0.getSource() == this.monty.getGalahad())
			current = "Galahad";
		else if (arg0.getSource() == this.monty.getGuard())
				current = "Guard";*/
		//else current = "none";
	//	System.out.println("Object: " + current + "\t Property name: "
			//	+ arg0.getPropertyName() + "\t old value: "
				//+ arg0.getOldValue() + "\t new value: " + arg0.getNewValue());
	//	System.out.println();

}}
