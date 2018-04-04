//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos = 100;
	private int yPos = 150;
	private int width = 10; 
	private int height = 10;

	private Color color = new Color(0,0,0);

	public Block()
	{
	}
	
	//add other Block constructors - x , y , width, height, color

		public Block(int x){
			setX(x);
		}
	
		public Block(int x, int y){
			setX(x);
			setY(y);
		}
	
		public Block(int x, int y, int w, int h){
			setX(x);
			setY(y);
			setWidth(w);
			setHeight(h);
		}
		
	
		public Block(int x, int y, int w, int h, Color col){
			setX(x);
			setY(y);
			setWidth(w);
			setHeight(h);
			setColor(col);
		}
	

   //add the other set methods
	
	
	public void setX(int x){
		xPos = x;
	}
   public void setY(int y){
	   yPos = y;
   }
   
   public void setPos(int x , int y){
	   xPos = x;
	   yPos = y;
	   
   }
   public void setWidth(int w){
	   width = w;
   }
   public void setHeight(int h){
	   height = h;
   }
   public void setColor(Color col){
	   color = col;
   }
   
   

   public void draw(Graphics window)
   {
	  window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block) obj;
		if (b.getX() == this.getX() && b.getY() == this.getY() && 
				b.getHeight() == this.getHeight() && b.getWidth() == this.getWidth() &&
				b.getColor() == this.getColor()){
			return true;
		}
		return false;
	}   

   //add the other get methods
	public int getX(){return xPos;}
	   public int getY(){return yPos;}
	   public int getWidth(){return width;}
	   public int getHeight(){return height;}
	   public Color getColor(){return color;}
	   

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		String output = " x: " + getX() + "\ty: " + getY() +  "\twidth; " + getWidth() +  "\theight: "  + getHeight()
		+ "\tcolor: " + getColor();    
		
		return output; 
		
	}
}