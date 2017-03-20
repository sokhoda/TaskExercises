package state.states;

import state.ExecResult;
import state.ServletLifeCycle;

public abstract class State {
	protected ExecResult execResult;

	public State() {
	}

	public abstract void nextState(ServletLifeCycle context);

	public abstract void doSomething();

	public ExecResult getExecResult() {
		return execResult;
	}

	public void setExecResult(ExecResult execResult) {
		this.execResult = execResult;
	}

	public void setRandExecResult(State state) {
		execResult = ExecResult.getRandRes();
		System.out.println(state + ".execRes:" + state.getExecResult());
	}

	@Override
	public String toString() {
		return "State [execResult=" + execResult + "]";
	}

}
