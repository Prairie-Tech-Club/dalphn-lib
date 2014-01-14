package com.weebly.prairiecodingclub.dalphn.engine.entities;

public class EntityLivingStats {
	
	public int maxHealth;
	
	public int maxHunger;
	
	public int maxEnergy;
	
	public int health;
	
	public int hunger;
	
	public int energy;
	
	public EntityLivingStats(int maxHealth, int maxHunger, int maxEnergy){
		this.maxHealth = maxHealth;
		this.health = maxHealth;
		this.maxHunger = maxHunger;
		this.hunger = maxHunger;
		this.maxEnergy = maxEnergy;
		this.energy = maxEnergy;
	}

}
