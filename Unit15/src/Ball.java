//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}

	
	public Ball(int x, int y, int w, int h){
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	 public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {
		   super(x,y,wid,ht);
		   xSpeed = xSpd;
			ySpeed = ySpd;
		   

	   }
	

	public Ball(int x, int y, int w, int h, Color col){
		super(x,y,w,h,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	

	public Ball(int x, int y, int w, int h, Color col, int xSp, int ySp){
		super(x,y,w,h,col);
		setXSpeed(xSp);
		setYSpeed(ySp);
	}

   //add the set methods
	public void setXSpeed(int speed){
		xSpeed = speed;
	}
	public void setYSpeed(int speed){
		ySpeed = speed;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  this.draw(window,Color.WHITE);

      setX(getX()+xSpeed);
      setY(getY()+ySpeed);

	 //draw the ball at its new location
     this.draw(window);
      
   }
   
	public boolean equals(Object obj)
	{
	//CHECK
		if (this == (obj)){return true;}


		return false;
	}   

   //add the get methods
	public int getXSpeed(){return xSpeed;}
	public int getYSpeed(){return ySpeed;}
	
	//collidable methods
	public boolean didCollideLeft(Object obj){
		Block thing = (Block) obj;
	
		int ballX = this.getX();
		int ballY = this.getY();
		int thingX = thing.getX();
		int thingY = thing.getY();
		
		if (ballX <= thingX + thing.getWidth() + Math.abs(this.xSpeed) 
		&& (ballY >= thingY && ballY <= thingY + thing.getHeight() 
		|| ballY + this.getHeight() >= thingY && ballY + this.getHeight() <
		thingY + thing.getHeight())) {			
			return true;
		} else{
			return false;
		}
	}
	
	public boolean didCollideRight(Object obj){
		Block thing = (Block) obj;
		
		int ballX = this.getX();
		int ballY = this.getY();
		int ballWidth = this.getWidth();
		int ballHeight = this.getHeight();
				
		int thingX = thing.getX();
		int thingY = thing.getY();
		
		
		if (ballX + ballWidth >= thingX - Math.abs(this.xSpeed) 
		&& (ballY >= thingY && ballY <= thingY + ballHeight 
		|| ballY + ballHeight >= thingY && ballY + ballHeight <
		thingY + thing.getHeight())){
			
			return true;
		}
		else{return false;}
		
	}
	public boolean didCollideTop(Object obj){
		// For now we use integers representing boundary y-coordinates
		int top = (Integer)obj;
		if(this.getY() <=top) return true;
		else return false;
		
	}
	public boolean didCollideBottom(Object obj){
		int bottom=(Integer)obj;
		if(this.getY()+this.getHeight() >= bottom) return true;
		else return false;
	}
	
   //add a toString() method
	public String toString(){
		String output =  super.toString() + "\tx speed : " + getXSpeed() + "\ty speed: " + getYSpeed();
		
		return output;
	}
}