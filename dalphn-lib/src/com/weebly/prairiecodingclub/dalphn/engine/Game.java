package com.weebly.prairiecodingclub.dalphn.engine;

public class Game {
	
	public TimerSystem timers;
	
	public DisplaySystem displaySystem;
	
	public Resources resources;
	
	public State state;
	
	public String title;
	public String version;
	
	public boolean running = true;
	
	public Game(String title, String version){
		this.timers = new TimerSystem();
		this.displaySystem = new DisplaySystem(this);
		this.resources = new Resources();
		this.state = new StateStartup(this);
		this.title = title;
		this.version = version;
	}
	
	public void init(){
		displaySystem.init();
		state.init();
	}
	
	public void run(){
		while(running){
			displaySystem.update();
			timers.update();
		}
		
		cleanup();
	}
	
	public void crash(Exception e){
		e.printStackTrace();
		cleanup();
		System.exit(1);
	}
	
	public void cleanup(){
		state.cleanup();
		displaySystem.cleanup();
	}

}
