package com.weebly.prairiecodingclub.dalphn.library.graphics.gui;

public class GuiElementText extends GuiElement
{
	public String text;
	public String textPath; // textPath overrides text if not ""
	public String font;
	public String fontPath; // fontPath overrides font if not ""
	public int size; // in pixels
	public int color; // R * 1 + G * 256 + B * 65 536 + A * 16 777 216
	public byte format; // 0=normal, 1=bold, 2=italics, 3=bold italics
	public byte alignment; // 0=left, 1=center, 2=right
	public float rotation; // degrees clockwise
	
	public void init()
	{
		
	}
	
	public void update()
	{
		
	}
	
	public void draw()
	{
		
	}
	
	public void cleanup()
	{
		
	}
}
