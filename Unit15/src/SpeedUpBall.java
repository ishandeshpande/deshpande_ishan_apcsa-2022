import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {
	private boolean hasSpedUp = false;

   public SpeedUpBall() {
	   super();

   }

   public SpeedUpBall(int x, int y) {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
	   super(x, y, 20, 20, Color.BLUE, xSpd, ySpd );
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
	   super(x, y, wid, ht, Color.BLUE, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
	   	super(x, y, wid, ht, col, xSpd, ySpd);
   }
   
   @Override
   public void moveAndDraw(Graphics window) {
	   super.moveAndDraw(window);
   }
   
   public void onCollide() {
          setXSpeed((int)(1.5*getXSpeed()));
          setYSpeed((int)(1.5*getYSpeed()));  
   }
}