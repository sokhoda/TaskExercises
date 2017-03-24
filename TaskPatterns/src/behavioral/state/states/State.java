package behavioral.state.states;

import behavioral.state.ExecResult;
import behavioral.state.ServletLifeCycle;
import lombok.Data;

@Data
public abstract class State {
	protected ExecResult execResult;

	public abstract void nextState(ServletLifeCycle context);
	public abstract void doSomething();

	public void setRandExecResult(State state) {
		execResult = ExecResult.getRandRes();
		System.out.println(state + ".execRes:" + state.getExecResult());
	}

	@Override
	public String toString() {
		return "State [execResult=" + execResult + "]";
	}

}
