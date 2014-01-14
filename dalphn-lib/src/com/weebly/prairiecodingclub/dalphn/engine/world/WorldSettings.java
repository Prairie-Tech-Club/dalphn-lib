package com.weebly.prairiecodingclub.dalphn.engine.world;

import org.lwjgl.util.vector.Vector3f;

public class WorldSettings {
	
	public Vector3f spawn;
	
	public boolean useGenerator;
	
	public WorldSettings(Vector3f spawn, boolean useGenerator){
		this.spawn = spawn;
		this.useGenerator = useGenerator;
	}

}
