package InheritanceDemo;

public class Bicycle {
	
	protected int gear;
	protected int speed;
	
	public Bicycle(int startspeed,int startgear) {  // This is a constructor
		
		gear=startgear;
		speed=startspeed;
	}
	
	public void setGear(int newvalue) {
		
		gear=newvalue;
	}
	
	public void applyBreak(int decrement) {
		
		speed-=decrement;
	}
	
	public void speedup(int increment) {
		
		speed+=increment;
	}

}
