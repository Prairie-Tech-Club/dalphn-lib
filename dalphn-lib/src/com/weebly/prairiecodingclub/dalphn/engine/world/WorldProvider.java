package com.weebly.prairiecodingclub.dalphn.engine.world;

public class WorldProvider {
	
	public World world;
	
	private WorldProviderLoad loader;
	private WorldProviderGenerate generator;
	
	public WorldProvider(World world){
		this.world = world;
		this.loader = new WorldProviderLoad(world);
		this.generator = new WorldProviderGenerate(world);
	}
	
	public Sector provideSector(Vector2i position){
		if(useLoader(position))
			return loader.provideSector(position);
		return generator.provideSector(position);
	}
	
	private boolean useLoader(Vector2i position){
		if(!doesSectorExist(position) && world.settings.useGenerator)
			return false;
		return true;
	}
	
	private boolean doesSectorExist(Vector2i position){
		//Can't write until file format is complete
		return false;
	}

}
