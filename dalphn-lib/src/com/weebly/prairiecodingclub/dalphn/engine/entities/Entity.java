package com.weebly.prairiecodingclub.dalphn.engine.entities;

import java.util.ArrayList;
import java.util.HashMap;

import com.weebly.prairiecodingclub.dalphn.engine.State;

@SuppressWarnings("rawtypes")
public class Entity {
	
	public State state;
	
	private HashMap<String, Attribute> attributes = new HashMap<String, Attribute>();
	private ArrayList<Script> scripts = new ArrayList<Script>();
	
	public Entity(State state){
		this.state = state;
	}
	
	public void update(){
		for(int i=0;i<scripts.size();i++){
			scripts.get(i).run();
		}
	}
	
	public void addAttribute(String name, Attribute value){
		attributes.put(name, value);
	}
	
	public Attribute getAttribute(String name){
		return attributes.get(name);
	}

}
