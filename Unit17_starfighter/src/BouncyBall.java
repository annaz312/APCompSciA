import java.awt.Color;
import java.awt.Graphics;
/**
 * Bouncy ball class - extension of Unit 17.
 * New bouncy ball object is created when an alien is destroyed. 
 * Bounces around the screen. If the ship touches one the game stops.
 * 
 * @author me
 */
public class BouncyBall extends MovingThing{
	/** General speed of ball */
	private int speed;
	
	/** vertical speed*/
	private int xSpeed;
	/** horizontal speed*/
	private int ySpeed;
	
	
	/**
	 * default constructor, sets position and speed to 0
	 */
	public BouncyBall()
	{
		this(0,0,0);
	}

	/**
	 * public constructor, sets position and speed to 0
	 * @param starting x position
	 * @param starting y position
	 */
	public BouncyBall(int x, int y)
	{
		super(x,y);
	}

	
	/**
	 * constructor takes in the x and y position and speed of bouncy ball.
	 * @param x starting x position
	 * @param y starting y position
	 * @param s speed of ball
	 * A random number is generated to determine of the ball initially travels to the right or left.
	 */	
	public BouncyBall(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
		
		if(Math.random() < 0.5){setXSpeed(-1*s);}
		else {setXSpeed(s);}
		
		setYSpeed(s);
	}
	
	/**
	 Sets speed instance variable to the given speed
	 @param s desired speed of ball
	 */
	public void setSpeed(int s){
		speed = s;
	}
	
	/**
	 Sets xSpeed instance variable to the given vertical speed
	 @param xSpe desired vertical speed of ball
	 */
	public void setXSpeed(int xSpe){
		xSpeed = xSpe;
	}
	
	/**
	 Sets ySpeed instance variable to the given horizontal speed
	 @param ySpe desired horizontal speed of ball
	 */
	public void setYSpeed(int ySpe){
		ySpeed = ySpe;
	}
	
	/**
	 *returns ball speed
	 * @return general speed of the ball
	 */
	
	public int getSpeed()
	{
	   return speed;
	}
	
	/**
	displays the ball on the screen
	 @param window 
	 */
	public void draw( Graphics window )
	{
		 window.setColor(Color.RED);
		   window.fillRect(getX(), getY(), 25, 25);
	}
	
	
	/**
	 * Moves the ball by updating the x and y positions using the speed. 
	 * This method also makes sure that the balls stay within the boundaries of the screen.
	 */
	
	public void ballMove(){
		int xp=getX();
		int yp=getY();
		
		xp += xSpeed;
		yp += ySpeed;
		
		setPos(xp,yp);
		
		if (xp < 0 || xp > 800){
			xSpeed = xSpeed * -1;
		}
		if (yp < 0 || yp > 600){
			ySpeed = ySpeed * -1;
		}
	}
}
