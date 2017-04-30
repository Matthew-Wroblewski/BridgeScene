package MVC;
import interpreter.Interpreter;

import java.awt.GridLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ToolkitCommand implements ActionListener {
	JButton move,say,approach,passed,failed;
	Interpreter commands;
	Random gen = new Random(10);
	
	public ToolkitCommand(JButton move1,JButton say1,JButton approach1,JButton passed1,JButton failed1,Interpreter commands)
	{
		this.move=move1;
		this.say=say1;
		this.approach=approach1;
		this.passed=passed1;
		this.failed=failed1;
		this.commands=commands;
		move.addActionListener(this);
		say.addActionListener(this);
		approach.addActionListener(this);
		passed.addActionListener(this);
		failed.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
	    String propertyName = event.getActionCommand();
	if(propertyName=="move")
	{
		this.commands.setInput("move Arthur 50 50 ");
		commands.commandParser();
	}
	else if(propertyName=="say")
	{
		int randomNum=gen.nextInt(10);
		
		if(commands.getScene().isKnightTurn())
		{
			commands.getScene().getGuard().getStringShape().setText("");
			commands.getScene().say("To find the grail	");
		}
		else
		{
			commands.getScene().getKnight().getStringShape().setText("");
			commands.getScene().say("What are you doing here?");
		}
	/*	if(randomNum==0) {this.commands.setInput("say \"I'm seeking the grail\"");}
		else if(randomNum==1) {this.commands.setInput("say \"I believe I can fly!!\"");}
		else if(randomNum==2) {this.commands.setInput("say \"I'm the King!!\"");}
		else if(randomNum==3) {this.commands.setInput("say \"Java\"");}
		else if(randomNum==4) {this.commands.setInput("say \"Awesome Demo!!\"");}
		else if(randomNum==5) {this.commands.setInput("say \"Hi Tony\"");}
		else if(randomNum==6) {this.commands.setInput("say \"Don't hurt me!!\"");}
		else if(randomNum==7) {this.commands.setInput("say \"Programming\"");}
		else if(randomNum==8) {this.commands.setInput("say \"I like to code\"");}
		else                  {this.commands.setInput("say \"Code day and night!\"");}
		commands.sayOrMove();*/
	}
	else if(propertyName=="approach")
	{
		commands.getScene().approach(commands.getScene().getArthur());
	}
	else if(propertyName=="passed")
	{
		commands.getScene().passed();
	}
	else if(propertyName=="failed")
	{
		commands.getScene().failed();
	}

}
public void processInput(){};


}
