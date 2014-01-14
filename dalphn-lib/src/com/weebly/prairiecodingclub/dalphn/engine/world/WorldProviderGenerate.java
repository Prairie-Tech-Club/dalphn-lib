package com.weebly.prairiecodingclub.dalphn.engine.world;

public class WorldProviderGenerate {
	
	public World world;
	
	public WorldProviderGenerate(World world){
		this.world = world;
	}
	
	public Sector provideSector(Vector2i position){
		//TODO: Must write framework for custom world generators
		return null;
	}

}
