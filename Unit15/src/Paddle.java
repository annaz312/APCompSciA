//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;


   //add the other Paddle constructors

   public Paddle()
   {
		super(10,10);
      speed =5;
   }
   
   public Paddle(int x, int y){
	   super(x,y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int spd){
	   super(x,y);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int w, int h){
	   super(x,y, w, h);
	   speed = 5;
   }
   public Paddle(int x, int y, int w, int h, int spd){
	   super(x,y, w, h);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int w, int h,  Color col, int spd){
	   super(x,y, w, h, col);
	   speed = spd;
   }
   
  
   public void setSpeed(int spd){
	   speed = spd;
   }
   

   public void moveUpAndDraw(Graphics window)
   {
	   this.draw(window, Color.WHITE);
	   setY(this.getY() - speed);
	   this.draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   this.draw(window, Color.WHITE);
	   setY(this.getY() + speed);
	   this.draw(window);
   }

   public int getSpeed(){
	   return speed;
   }
   
   
   public String toString(){
	   String output = super.toString() + "/tspeed: " + speed;
	   
	   return output;
   }
}