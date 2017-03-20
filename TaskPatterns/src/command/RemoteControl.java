package command;

import java.util.ArrayList;
import java.util.List;

import command.commands.ICommand;

public class RemoteControl {
	List<ICommand> keyboard = new ArrayList<>();

	public void addCommand(ICommand command) {
		keyboard.add(command);
	}

	public void removeCommand(ICommand command) {
		keyboard.remove(command);
	}

	public void press(int inx) {
		keyboard.get(inx).execute();
	}

	public List<ICommand> getKeyboard() {
		return keyboard;
	}

	@Override
	public String toString() {
		return "RemoteControl [keyboard=" + keyboard + "]";
	}

}
