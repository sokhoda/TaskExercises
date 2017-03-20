package state.states;

import state.ExecResult;
import state.ServletLifeCycle;

public class ExecuteState extends State {
	static ExecResult res = null;

	public ExecuteState() {
	}

	@Override
	public void nextState(ServletLifeCycle context) {
		String message = "Not valid ExecResult value";

		setRandExecResult(this);

		switch (getExecResult()) {
		case SUCCESS:
			message = "Hopping to DestroyState";
			context.setCurState(context.getDestroyState());
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
		System.out.println("Ok! I'm doing in " + this + "!\n");
	}

	@Override
	public String toString() {
		return "ExecuteState";
	}

}
