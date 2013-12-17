package com.weebly.prairiecodingclub.dalphn.engine;

import java.util.ArrayList;
import java.util.HashMap;

public class TimerSystem {
	
	private HashMap<String, Timer> timerMap = new HashMap<String, Timer>();
	private ArrayList<Timer> timerList = new ArrayList<Timer>();
	
	public TimerSystem(){
		addTimer(new Timer("systemTimer", 1.d));
	}
	
	public void update(){
		for(int i=0;i<timerList.size();i++){
			timerList.get(i).update();
		}
	}
	
	public void addTimer(Timer timer){
		timerMap.put(timer.getName(), timer);
		timerList.add(timer);
	}
	
	public Timer getTimer(String name){
		return timerMap.get(name);
	}
	
	public void removeTimer(String name){
		timerMap.remove(name);
		
		int i = searchListForName(name);
		if(i > 0)
			timerList.remove(i);
	}
	
	private int searchListForName(String name){
		for(int i=0;i<timerList.size();i++){
			if(timerList.get(i).getName() == name)
				return i;
		}
		return -1;
	}

}
