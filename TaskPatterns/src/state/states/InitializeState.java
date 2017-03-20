package state.states;

import state.ExecResult;
import state.ServletLifeCycle;

public class InitializeState extends State {
	static ExecResult res = null;

	public InitializeState() {
	}

	@Override
	public void nextState(ServletLifeCycle context) {
		String message = "Not valid ExecResult value";
		setRandExecResult(this);
		switch (getExecResult()) {
		case SUCCESS:
			message = "Hopping to ExecuteState";
			context.setCurState(context.getExecuteState());
			break;
		case FAIL:
			message = "Staying in " + this;
		}
		System.out.println(message);
		doSomething();
		System.out.println("Now I'm in " + context.getCurState());
		context.getCurState().nextState(context);
	}

	@Override
	public void doSomething() {
		System.out.println("Cannot do in " + this + "!\n");
	}

	@Override
	public String toString() {
		return "InitializeState";
	}

}
