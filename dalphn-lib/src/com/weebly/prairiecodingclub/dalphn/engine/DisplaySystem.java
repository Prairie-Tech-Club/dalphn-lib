package com.weebly.prairiecodingclub.dalphn.engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;

public class DisplaySystem {
	
	private Game game;
	
	public DisplaySystem(Game game){
		this.game = game;
	}
	
	public void init(){
		initDisplay();
		initOpenGL();
	}
	
	public void update(){
		Display.update();
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	}
	
	public void cleanup(){
		Display.destroy();
	}
	
	public void prepare2D(){
		glDisable(GL_DEPTH_TEST);
		glDisable(GL_LIGHTING);  
		glDisable(GL_COLOR);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}
	
	public void prepare3D(){
		glEnable(GL_DEPTH_TEST);
		glEnable(GL_LIGHTING);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		gluPerspective(80f, (float)((float)Display.getWidth() / (float) Display.getHeight()), 0.005f, 25f);
		glMatrixMode(GL_MODELVIEW);
	}
	
	private void initDisplay(){
		try{
			Display.setDisplayMode(getBestDisplayMode());
			Display.setTitle(game.title);
			Display.create();
		} catch(Exception e){
			game.crash(e);
		}
	}
	
	private void initOpenGL(){
		glEnable(GL_TEXTURE_2D);
		glShadeModel(GL_SMOOTH);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glClearColor(0.0f, 0.0f, 0.0f, 0.0f);           
		glClearDepth(1);
		glViewport(0, 0, Display.getWidth(), Display.getHeight());
		glMatrixMode(GL_MODELVIEW);
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
