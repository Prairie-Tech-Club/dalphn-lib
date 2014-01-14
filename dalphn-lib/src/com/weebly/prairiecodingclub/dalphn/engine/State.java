package com.weebly.prairiecodingclub.dalphn.engine;

public abstract class State {
	
	public Game game;
	
	public State(Game game){
		this.game = game;
	}
	
	public abstract void init();
	
	public abstract void update();
	
	public abstract void cleanup();

}
