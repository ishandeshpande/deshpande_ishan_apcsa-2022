public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton() {
		name = "";
		size = 0;
	}
	
	public Skeleton(String n, int s) {
		name = n;
		size = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHowBig() {
		return size;
	}
	
	public boolean isBigger(Monster other) {
		if (getHowBig() > other.getHowBig()) return true;
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if (getHowBig() > other.getHowBig()) return false;
		return true;
	}
	
	public boolean namesTheSame(Monster other) {
		if (getName().equals(other.getName())) return true;
		return false;
	}

	public String toString() {
		return "" + name + " " + size;
	}
}