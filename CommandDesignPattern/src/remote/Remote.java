package remote;

import java.util.Stack;

import command.Command;

public class Remote {

	private Stack<Command> prevCommands;
	private Command command;


	public Remote() {
		super();
		this.prevCommands = new Stack<>();
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
   public void pressButton() {
	   prevCommands.add(command);
	   command.execute();
   }
   
   public void undo() {
	   Command prevCmd = prevCommands.pop();
	   prevCmd.execute();
   }
	
}
