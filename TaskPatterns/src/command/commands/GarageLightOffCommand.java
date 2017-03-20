package command.commands;

import command.receivers.GarageLight;

public class GarageLightOffCommand implements ICommand {
	private GarageLight gl;

	public GarageLightOffCommand(GarageLight gl) {
		this.gl = gl;
	}

	@Override
	public void execute() {
		System.out.print(this + "::");
		gl.switchOff();
	}

	@Override
	public String toString() {
		return "GarageLightOffCommand ";
	}

}
