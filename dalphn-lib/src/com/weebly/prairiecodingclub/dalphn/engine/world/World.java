package com.weebly.prairiecodingclub.dalphn.engine.world;

import com.weebly.prairiecodingclub.dalphn.engine.State;

public class World {
	
	public State state;
	
	public String name;
	
	public WorldSettings settings;
	
	public WorldStorage storage;
	public WorldProvider provider;
	public WorldRenderer renderer;
	public WorldSaver saver;
	
	public World(State state, String name, WorldSettings settings){
		this.state = state;
		this.name = name;
	}
	
	public void init(){
		
	}
	
	public void update(){
		
	}
	
	public void cleanup(){
		
	}
	
}
