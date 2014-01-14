package com.weebly.prairiecodingclub.dalphn.engine.entities;


public abstract class Script {
	
	protected Entity entity;
	
	public String name;
	
	public Script(Entity entity, String name){
		this.entity = entity;
		this.name = name;
	}
	
	public abstract void run();

}
