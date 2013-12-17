package com.weebly.prairiecodingclub.dalphn.engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class DisplaySystem {
	
	private Game game;
	
	public DisplaySystem(Game game){
		this.game = game;
	}
	
	public void init(){
		
	}
	
	public void prepare2D(){
		
	}
	
	public void prepare3D(){
		
	}
	
	private void initDisplay(){
		try{
			Display.setDisplayMode(getBestDisplayMode());
			Display.create();
		} catch(Exception e){
			
		}
	}
	
	private void initOpenGL(){
		
	}
	
	private DisplayMode getBestDisplayMode() throws LWJGLException{
		DisplayMode[] modes = Display.getAvailableDisplayModes();
		DisplayMode targetMode = modes[0];
		for(int i=0;i<modes.length;i++){
			if(modes[i].getHeight() > targetMode.getHeight())
				targetMode = modes[i];
			else if(modes[i].getHeight() == targetMode.getHeight() && modes[i].getWidth() > targetMode.getWidth())
				targetMode = modes[i];
		}
		return targetMode;
	}

}
