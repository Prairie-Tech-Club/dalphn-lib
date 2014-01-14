package com.weebly.prairiecodingclub.dalphn.engine.world;

import java.util.HashMap;

import org.lwjgl.util.vector.Vector3f;

public class WorldStorage {
	
	public HashMap<Vector2i, Sector> sectors;
	
	private Vector2i searchBuffer;
	
	public WorldStorage(){
		this.sectors = new HashMap<Vector2i, Sector>();
		this.searchBuffer = new Vector2i(0, 0);
	}
	
	public Sector getSector(Vector2i position){
		return sectors.get(position);
	}
	
	public Sector getSector(int x, int z){
		searchBuffer.setCoords(x, z);
		return sectors.get(searchBuffer);
	}
	
	public Sector getSector(Vector3f position){
		searchBuffer.setCoords((int)(position.x/Sector.SECTOR_SIZE), (int)(position.z/Sector.SECTOR_SIZE));
		return sectors.get(searchBuffer);
	}
	
	public float getNode(Vector2i position){
		return getSector(position.getX()/16, position.getZ()/16).data[position.getX()%Sector.SECTOR_SIZE][position.getZ()%Sector.SECTOR_SIZE];
	}
	
	public float getNode(int x, int z){
		return getSector(x/16, z/16).data[x%Sector.SECTOR_SIZE][z%Sector.SECTOR_SIZE];
	}
	
	public float getNode(Vector3f position){
		return getSector((int)(position.x/16), (int)(position.z/16)).data[(int)(position.x%Sector.SECTOR_SIZE)][(int)(position.z%Sector.SECTOR_SIZE)];
	}
	
	public void setNode(Vector2i position, float value){
		getSector(position.getX()/16, position.getZ()/16).data[position.getX()%Sector.SECTOR_SIZE][position.getZ()%Sector.SECTOR_SIZE] = value;
	}
	
	public void setNode(int x, int z, float value){
		getSector(x/16, z/16).data[x%Sector.SECTOR_SIZE][z%Sector.SECTOR_SIZE] = value;
	}
	
	public void setNode(Vector3f position, float value){
		getSector((int)(position.x/16), (int)(position.z/16)).data[(int)(position.x%Sector.SECTOR_SIZE)][(int)(position.z%Sector.SECTOR_SIZE)] = value;
	}

}
