import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class Alien extends MovingThing {
    private int speed;
    private Image image;

    public Alien() {
        this(0, 0, 30, 30, 3);
    }

    public Alien(int x, int y) {
        this(x, y, 30, 30, 3);
    }

    public Alien(int x, int y, int s) {
        this(x, y, 30, 30, s);
    }

    public Alien(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
        	image = ImageIO.read(new File("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit17/src/alien.JPG"));
        } catch (Exception e) {
            System.out.println("lol");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public void move(String direction) {

        if(getX() > 750 || getX() < 50)
            speed = -speed;

        setX(getX() + speed);
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public boolean isBetween(int x, int y, int z){
        return x >= y && x <= z;
    }

    public boolean isColliding(Ammo a){
        int ay = a.getY() + a.getSpeed();
        int ax = a.getX() - this.getSpeed();
        if(isBetween(ay, getY(), getY() + getHeight()) || isBetween(ay + a.getHeight(), getY(), getY() + getHeight())){
            if(isBetween(ax, getX(), getX() + getWidth()) || isBetween(ax, getX(), getX() + getWidth())){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "";
    }
}