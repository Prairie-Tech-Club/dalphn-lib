package com.weebly.prairiecodingclub.dalphn.engine.world;

public class Sector {
	
	public static final int SECTOR_SIZE = 64;
	
	public float[][] data;
	
	public Sector(){
		this.data = new float[SECTOR_SIZE][SECTOR_SIZE];
	}

}
