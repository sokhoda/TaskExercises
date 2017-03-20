package command.commands;

import command.receivers.GarageLight;

public class GarageLightOnCommand implements ICommand {
	private GarageLight gl;

	public GarageLightOnCommand(GarageLight gl) {
		this.gl = gl;
	}

	@Override
	public void execute() {
		System.out.print(this + "::");
		gl.switchOn();
	}

	@Override
	public String toString() {
		return "GarageLightOnCommand ";
	}
}
