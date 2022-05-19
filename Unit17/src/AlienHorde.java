import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
    private List<Alien> aliens;

    public AlienHorde(int size) {
        aliens = new ArrayList<Alien>();
    }

    public void add(Alien al) {
        aliens.add(al);
    }

    public void generateHorde(int x, int y, int w, int h, int s) {
		int xPos = x;
		for (int i = 0; i < aliens.size(); i++) {
			aliens.add(new Alien(x, y, w, h, s));
			if (x >= 600) {
				x = xPos;
				y = y + 10 + h;
			} else {
				x = x + w + 10;
			}
		}
	}
    public void drawEmAll(Graphics window) {
        for (int i = 0; i < aliens.size(); i++)
            aliens.get(i).draw(window);
    }

    public void moveEmAll() {
        for (int i = 0; i < aliens.size(); i++)
            aliens.get(i).move("");
    }

    public void removeDeadOnes(List<Ammo> shots) {
        for(int i = 0; i < shots.size(); i++)
        {
            for(int j = aliens.size() - 1; j >= 0; j--)
            {
                if(aliens.get(j).isColliding(shots.get(i))){
                    aliens.remove(j);
                }
            }
        }
    }
    
    public boolean endGame(Ship s) {
		if (aliens.size() > 0) {
			for (int i = 0; i < aliens.size(); i++) {
				if (s.didCollide(aliens.get(i))) {
					return true;
				}
				else if((aliens.get(aliens.size() - 1).getY()>=600))
				{
					return true;
				}
			}
		}
		return false;
	}

    public String toString() {
        return "";
    }
}