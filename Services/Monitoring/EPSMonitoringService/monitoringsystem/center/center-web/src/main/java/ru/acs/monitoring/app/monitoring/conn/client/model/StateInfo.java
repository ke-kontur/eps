package ru.acs.monitoring.app.monitoring.conn.client.model;

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BeanModelTag;

import ru.acs.fts.webconsole.monitoring.common.client.data.State;

public class StateInfo implements Serializable, BeanModelTag{	
	
	public StateInfo() {}

	public StateInfo(State state) {
		super();
		this.state = state;
	}

	public StateInfo(State state, boolean stateChanged) {
		super();
		this.state = state;
		this.stateChanged = stateChanged;
	}
	private State state;
	
	private boolean stateChanged = false;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isStateChanged() {
		return stateChanged;
	}

	public void setStateChanged(boolean stateChanged) {
		this.stateChanged = stateChanged;
	}	
}
