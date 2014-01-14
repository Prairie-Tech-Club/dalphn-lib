package com.weebly.prairiecodingclub.dalphn.engine.entities;

import org.lwjgl.util.vector.Vector3f;

import com.weebly.prairiecodingclub.dalphn.engine.State;

public class EntityPhysical extends Entity {
	
	public EntityPhysical(State state, Vector3f position){
		//TODO: Add attributes and scripts for physics and rendering
		super(state);
		addAttribute("position", new Attribute<Vector3f>(position));
	}

}
