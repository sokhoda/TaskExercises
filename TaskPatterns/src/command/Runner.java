package command;

import java.util.Scanner;

import command.commands.GarageDoorCloseCommand;
import command.commands.GarageDoorOpenCommand;
import command.commands.GarageLightOffCommand;
import command.commands.GarageLightOnCommand;
import command.receivers.GarageDoor;
import command.receivers.GarageLight;

public class Runner {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		GarageDoor gDoor = new GarageDoor(0);
		GarageLight gLight = new GarageLight(0);

		rc.addCommand(new GarageDoorCloseCommand(gDoor));
		rc.addCommand(new GarageDoorOpenCommand(gDoor));
		rc.addCommand(new GarageLightOnCommand(gLight));
		rc.addCommand(new GarageLightOffCommand(gLight));

		System.out.println(rc);
		Scanner scan = new Scanner(System.in);
		int inx = 0;
		while ((inx = scan.nextInt()) != -1) {
			if (inx < rc.getKeyboard().size()) {
				rc.press(inx);
			} else {
				System.out.println("Not valid button");
			}
		}
		System.out.println("EXIT EXECUTION");
	}
}
