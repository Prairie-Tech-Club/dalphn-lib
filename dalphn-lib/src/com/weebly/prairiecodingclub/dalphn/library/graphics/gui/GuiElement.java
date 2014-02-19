package com.weebly.prairiecodingclub.dalphn.library.graphics.gui;

public abstract class GuiElement
{
	public short xPos; //
	public short yPos; // screen position of element (elements' origins are their top left corner by default)
					   // x increases to the right, y increases downwards.
	
	public abstract void init();
	
	public abstract void update();
	
	public abstract void draw();
	
	public abstract void cleanup();
	
}
