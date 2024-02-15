package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet{
	int x;
	int y;
	int speed;
	int size;
	int width;
	int height;
	
	
	public Car(){
		
	}

    @Override
    public void draw() {
    	
    }
	void display()
	  {
	    fill(0,255,0);
	    rect(x , y,  size, 50);
	  }
}
