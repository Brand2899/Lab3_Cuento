package Model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Elements extends PApplet{
	
	protected PApplet app;
	protected PImage img;
	protected int posX;
	protected int posY;
	
	public Elements(PApplet app) {
		this.app = app;
	}
	
}
