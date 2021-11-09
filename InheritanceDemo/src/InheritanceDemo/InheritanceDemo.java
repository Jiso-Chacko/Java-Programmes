package InheritanceDemo;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		MountainBike ob=new MountainBike(20, 1, 10);
		System.out.println("Gear is:"+ ob.gear);
		System.out.println("Seat height is :"+ob.seatheight);
		System.out.println("Bike speed is:"+ob.speed);
		
		ob.applyBreak(1);
		System.out.println("Speed of bike after applying break:"+ob.speed);
	}

	
}
