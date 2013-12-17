package com.weebly.prairiecodingclub.dalphn.engine;

public class Timer {
	
	private String name;
	
	private double systemTime;
	private double time;
	
	private double speed;
	
	public Timer(String name, double speed){
		this.name = name;
		this.speed = speed;
		
		double nanoTime = System.nanoTime();
		systemTime = nanoTime/1000000;
		time = nanoTime/1000000;
	}
	
	public void update(){
		double nanoTime = System.nanoTime();
		double milliTime = nanoTime/1000000;
		
		double elapsedTime = milliTime - systemTime;
		time += elapsedTime * speed;
		
		systemTime = milliTime;
	}
	
	public String getName(){
		return name;
	}
	
	public double getTime(){
		return time;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
	}

}
