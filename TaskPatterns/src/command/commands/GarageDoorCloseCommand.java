package command.commands;

import command.receivers.GarageDoor;

public class GarageDoorCloseCommand implements ICommand {
	private GarageDoor gd;

	public GarageDoorCloseCommand(GarageDoor gd) {
		this.gd = gd;
	}

	@Override
	public void execute() {
		System.out.print(this + "::");
		gd.close();
	}

	@Override
	public String toString() {
		return "GarageDoorCloseCommand ";
	}

}
