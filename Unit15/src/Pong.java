import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	
	private boolean univCollide = false;


	public Pong() {

		ball = new SpeedUpBall(400, 300, 20, 20, Color.BLUE, 2, 2);
		
		leftPaddle = new Paddle(20, 200, 20, 80, Color.ORANGE, 5);
		rightPaddle = new Paddle(750, 200, 20, 80, Color.ORANGE, 5);


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
	   boolean didCollide = false;
	   Graphics2D twoDGraph = (Graphics2D)window;
	   
	   if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
	   
	   Graphics graphToBack = back.createGraphics();
	   
	   ball.moveAndDraw(graphToBack);
	   leftPaddle.draw(graphToBack);
	   rightPaddle.draw(graphToBack);
	   
	   if(!(ball.getX()<=780)) {
		   ball.setXSpeed(0);
		   ball.setYSpeed(0);
		   if(!univCollide) {
				leftScore++;
		}
			didCollide = true;
		}
		
		if(!(ball.getX()>=10)) {
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if(!univCollide) {
				rightScore++;
			}
			didCollide = true;
		}
		
		if(ball.getY() <= 0 || ball.getY()+ball.getHeight() >= 600) {
			didCollide = true;
		}

		if(ball.getY() <= 0 && ball.getYSpeed() < 0) {
			  ball.setYSpeed(-1*ball.getYSpeed());
			}
		else if(ball.getY()+ball.getHeight() >= 600 && ball.getYSpeed() > 0) {
			  ball.setYSpeed(-1*ball.getYSpeed());
			}

		if(ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-1*ball.getXSpeed());
			didCollide = true;
		}
		
		if(ball.didCollideTop(leftPaddle)) {
			ball.setYSpeed(-1*ball.getYSpeed());
			didCollide = true;
		}
		
		if(ball.didCollideBottom(leftPaddle)) {
			ball.setYSpeed(-1*ball.getYSpeed());
			didCollide = true;
		}
			
		if(ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-1*ball.getXSpeed());
			didCollide = true;
		}
		
		if(ball.didCollideTop(rightPaddle)) {
			ball.setYSpeed(-1*ball.getYSpeed());
			didCollide = true;
		}
		
		if(ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(-1*ball.getYSpeed());
			didCollide = true;
		}	
		
		if(didCollide) {
			univCollide = true;
		}
		else {
			univCollide = false;
		}
		
		if(univCollide) {
			ball.onCollide();
		}

		if(keys[0] == true && leftPaddle.getY() >= leftPaddle.getSpeed())
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && leftPaddle.getY() + leftPaddle.getHeight() <= 565 - leftPaddle.getSpeed())
		{
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true && rightPaddle.getY() >= rightPaddle.getSpeed())
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true && rightPaddle.getY() + rightPaddle.getHeight() <= 565 - rightPaddle.getSpeed())
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		
		
		
		twoDGraph.drawImage(back, null, 0, 0);
		
		twoDGraph.setColor(Color.RED);
		twoDGraph.drawString(String.format("Left Score: %d", leftScore), 400, 550);
		twoDGraph.drawString(String.format("Right Score: %d", rightScore), 400, 560);
		
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true) {
   		   Thread.currentThread().sleep(8);
            repaint();
        }
      }catch(Exception e)
      {
      }
  	}	
}