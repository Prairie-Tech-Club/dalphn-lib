package com.weebly.prairiecodingclub.dalphn.engine;

public class StateStartup extends State {
	
	public StateStartup(Game game){
		super(game);
	}
	
	public void init(){
		
	}
	
	public void update(){
		try {
			game.resources.load();
		} catch (Exception e) {
			game.crash(e);
		}
	}
	
	public void cleanup(){
		
	}

}
