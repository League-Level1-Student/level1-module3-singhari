package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x;
    int y;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	
    	background(0,0,255);
    	fill(0,200,50);
    	ellipse(x,y,20,20);
    }
    public void outOfFrame() {
    	if(x > WIDTH || x < 0 || y > HEIGHT || y < 0) {
    		if(x > WIDTH || x < 0) {
    			x = 20;
    		}
    		else {
    			y = 20;
    		}
    	}
    }
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y--;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y++;
            	
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            	x++;
            	
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            	x--;
            	
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
