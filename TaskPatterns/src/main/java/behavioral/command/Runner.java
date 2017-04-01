package behavioral.command;

import java.util.Scanner;

import behavioral.command.commands.GarageDoorCloseCommand;
import behavioral.command.commands.GarageDoorOpenCommand;
import behavioral.command.commands.GarageLightOffCommand;
import behavioral.command.commands.GarageLightOnCommand;
import behavioral.command.receivers.GarageDoor;
import behavioral.command.receivers.GarageLight;

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
