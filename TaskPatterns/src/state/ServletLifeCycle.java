package state;

import state.states.CreateState;
import state.states.DestroyState;
import state.states.ExecuteState;
import state.states.InitializeState;
import state.states.State;

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

	public State getCreateState() {
		return createState;
	}

	public void setCreateState(State createState) {
		this.createState = createState;
	}

	public State getInitState() {
		return initState;
	}

	public void setInitState(State initState) {
		this.initState = initState;
	}

	public State getExecuteState() {
		return executeState;
	}

	public void setExecuteState(State executeState) {
		this.executeState = executeState;
	}

	public State getDestroyState() {
		return destroyState;
	}

	public void setDestroyState(State destroyState) {
		this.destroyState = destroyState;
	}

	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}

}
