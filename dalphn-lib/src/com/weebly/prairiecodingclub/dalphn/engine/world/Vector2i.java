package com.weebly.prairiecodingclub.dalphn.engine.world;

public class Vector2i {
	
	private int x;
	private int z;
	
	public Vector2i(int x, int z){
		this.x = x;
		this.z = z;
	}
	
	public void setCoords(int x, int z){
		this.x = x;
		this.z = z;
	}
	
	public int getX(){
		return x;
	}
	
	public int getZ(){
		return z;
	}

}
