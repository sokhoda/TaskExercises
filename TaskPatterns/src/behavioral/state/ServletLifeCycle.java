package behavioral.state;

import behavioral.state.states.CreateState;
import behavioral.state.states.DestroyState;
import behavioral.state.states.ExecuteState;
import behavioral.state.states.InitializeState;
import behavioral.state.states.State;
import lombok.Data;

@Data
public class ServletLifeCycle {
	private State createState;
	private State initState;
	private State executeState;
	private State destroyState;
	private State curState;

	public ServletLifeCycle() {
		this.createState = new CreateState();
		this.initState = new InitializeState();
		this.executeState = new ExecuteState();
		this.destroyState = new DestroyState();
		this.curState = createState;
	}

	public void nextState() {
		curState.nextState(this);
	}
}
