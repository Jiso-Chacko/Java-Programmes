package InheritanceDemo;

public class MountainBike extends Bicycle {

	public int seatheight;

	public MountainBike(int startspeed, int startgear,int startheight) {
		super(startspeed, startgear);
		seatheight=startheight;
	}
	

}
