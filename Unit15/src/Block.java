import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {


	}
	
	public Block(int x, int y) {
		setPos(x, y);
		setColor(Color.BLACK);
		setWidth(10);
		setHeight(10);
	}
	
	public Block(int x, int y, int width, int height) {
		this(x, y);
		setWidth(width);
		setHeight(height);
		
	}
	
	public Block(int x, int y, int width, int height, Color color) {
		this(x, y, width, height);
		setColor(color);
	}
	
	public void setPos( int x, int y) {
		xPos = x;
		yPos = y;
	}
	
    public void setX( int x ) {
    	xPos = x;
    }
    
    public void setY( int y ) {
    	yPos = y;
    }
    
    public void setHeight(int h) {
    	height = h;
    }
    
    public void setWidth(int w) {
    	width = w;
    }

   public void setColor(Color col)
   {
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
		if(obj == this) {
			return true;
		}
		return false;
	}   
	
	 public int getX() {
	    	return xPos;
	 }
	 
	 public int getY() {
	    	return yPos;
	 }
	 
	 public int getWidth() {
		 return width;
	 }
	 
	 public int getHeight() {
		 return height;
	 }
	 
	 public Color getColor() {
		 return color;
	 }
    
	 public String toString() {
		 return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color.toString();
	 }
}