package View;

import processing.core.PApplet;
import processing.core.PImage;
import Controller.Controller;

public class Main extends PApplet {
	
	private int screen;
	private PImage fondo1;
	private PImage fondo2;
	private PImage fondo3;
	private Controller cont;
	
	public void settings() {
		size(700,500);
	}
	
	public void setup() {
		screen = 0;
		fondo1 = loadImage("../png/pantalla_inicio.png");
		fondo2 = loadImage("../png/fondo.png");
		fondo3 = loadImage("../png/pantalla_fin.png");
		
		
	}
	
	public void draw() {
		switch(screen) {
		case 0:
			
			image(fondo1, 0, 0);
			
			break;
		
		case 1:
			
			image(fondo2, 0, 0);
			
			break;
			
		case 2:
			
			image(fondo3, 0, 0);
			
			break;
		}
	}
	
	public void mousePressed() {
		switch(screen) {
		
		case 0:
			
			if(mouseX > 128 && mouseX < 572 && mouseY > 293 && mouseY < 439) {
				screen = 1;
			}
			
			break;
			
		case 1:
			
			
			
			break;
			
		case 2:
			
			
			
			break;
		}
	}
	
	
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
}
