//Programmed by Matthew Wroblewski
//9/4/2013
package main;
import interpreter.*;

import java.awt.Component;
import java.beans.PropertyChangeListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import AnimationsThreads.MoveAnimation;
import MVC.ConsoleSceneView;
import MVC.PaintListener;
import MVC.ToolkitCommand;
import avatars.*;
import beanscommands.ScannerBean;
import beanscommands.SetAndGet;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import util.misc.ThreadSupport;
public class Assignment11
{

public static void main(String[] args) 
{
   BroadcastingClearanceManager clearanceManager=new ABroadcastingClearanceManager();

	    SetAndGet mine = new ScannerBean();
		Scene montyScene =new BridgeScene();
		PropertyChangeListener theMonitor = new ConsoleSceneView(montyScene);
		Interpreter commandz = new CommandInterpreter(montyScene,mine,clearanceManager);
		PropertyChangeListener view = new PaintListener(montyScene);
		JFrame mainFrame =new JFrame("A Scene View");
		mainFrame.add((Component)view);
	 	mainFrame.setSize(900,600);
		mainFrame.setLocation(0,100);
		mainFrame.setVisible(true);
	    
	     OEFrame clearance = ObjectEditor.edit(clearanceManager);
	     clearance.setLocation(600,0);
	     clearance.setSize(200,150);

		
		ThreadSupport.sleep(1000);

	    commandz.asynchronousArthur();
	 	commandz.asynchronousRobin();
	 	
	     ThreadSupport.sleep(6000);
	     
	     montyScene.getArthur().move(0, 0);
	     montyScene.getRobin().move(0, 0);

	     commandz.waitingArthur();
		 commandz.waitingGalahad();
		 commandz.waitingLancelot();
		 commandz.waitingRobin();
		 ThreadSupport.sleep(500);
		 commandz.startAnimation();
		 ThreadSupport.sleep(5000);
	     
	     montyScene.getArthur().move(0, 0);
	     montyScene.getRobin().move(0, 0);
	     montyScene.getLancelot().move(0, 0);
	     montyScene.getGalahad().move(0, 0);
////////////////////////////      END  ANIMATION METHOS /////////////////////////
	     commandz.setInput("move arthur 10 10 ");
	     OEFrame commands1 = ObjectEditor.edit(commandz);
	     commands1.setLocation(0,0);
	     commands1.setSize(600,150);
	     
	     commandz.commandParser();
	     commands1.refresh();
		 clearanceManager.waitForProceed();
		 commandz.setInput("{ move arthur 5 5 move galahad 5 5 move lancelot 5 5 move robin 5 5 } ");
	     commands1.refresh();
		 commandz.commandParser();
		 clearanceManager.waitForProceed();
		 commandz.setInput("approach arthur ");
		 commands1.refresh();
		 commandz.commandParser();
	     clearanceManager.waitForProceed();
		 commandz.setInput("say \"What are you doing here?\" ");
	     commands1.refresh();
		 commandz.commandParser();
	     clearanceManager.waitForProceed();
		 commandz.setInput("say \"Seeking the grail\" ");
	     commands1.refresh();
		 commandz.commandParser();
	     clearanceManager.waitForProceed();
		 commandz.setInput("passed ");
	     commands1.refresh();
	     commandz.commandParser();
	     clearanceManager.waitForProceed();
	     commandz.setInput("{ approach lancelot fail } ");
	     commands1.refresh();
	     commandz.commandParser();
	     clearanceManager.waitForProceed();   
	     commandz.setInput("repeat 5 { repeat 5 { move robin 10 10 move galahad 10 10 } } ");
	     commands1.refresh();
	     commandz.commandParser();
		 clearanceManager.waitForProceed();
	}
}




	