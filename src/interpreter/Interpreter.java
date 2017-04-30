package interpreter;

import CommandClasses.*;
import avatars.Scene;

public interface Interpreter {

	public Scene getScene();
	
	public void commandParser();
	public SayCommand sayParser();
	public MoveCommand moveParser();
	public ApproachCommand approachParser();
	public PassCommand passParser();
	public FailCommand failParser();
	public RepeatCommand repeatParser();
	public CommandList commandListParser();

	public void setInput(String input);
	public String getInput();
	public void startAnimation();
	public void waitingArthur();
	public void waitingGalahad();
	public void waitingLancelot();
	public void waitingRobin();
	public void asynchronousArthur();
	public void asynchronousGalahad();
	public void asynchronousLancelot();
	public void asynchronousRobin();

}
