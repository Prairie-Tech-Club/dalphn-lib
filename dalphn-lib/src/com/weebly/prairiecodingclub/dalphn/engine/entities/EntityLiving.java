package com.weebly.prairiecodingclub.dalphn.engine.entities;

import org.lwjgl.util.vector.Vector3f;

import com.weebly.prairiecodingclub.dalphn.engine.State;

public class EntityLiving extends EntityPhysical {

	public EntityLiving(State state, Vector3f position, Vector3f focus, EntityLivingStats stats) {
		super(state, position);
		addAttribute("focusPoint", new Attribute<Vector3f>(focus));
		addAttribute("stats", new Attribute<EntityLivingStats>(stats));
	}

}
