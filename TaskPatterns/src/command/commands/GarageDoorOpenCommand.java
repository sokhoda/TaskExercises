package command.commands;

import command.receivers.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
	private GarageDoor gd;

	public GarageDoorOpenCommand(GarageDoor gd) {
		this.gd = gd;
	}

	@Override
	public void execute() {
		System.out.print(this + "::");
		gd.open();
	}

	@Override
	public String toString() {
		return "GarageDoorOpenCommand ";
	}

}
