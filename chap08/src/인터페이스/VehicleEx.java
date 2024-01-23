package 인터페이스;

public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
//		driver.drive(new Taxi());
//		driver.drive(new Bus());
		
		Vehicle vehicle = new Bus();
//		vehicle.run();
//		vehicle.checkFare();
//		안된다 이유는 ? Vehicle 타입으로 선언되어있어서 Vehicle안에있는 메소드만 사용가능하다
//		사용하고 싶으면
		
//		아래와 같이 작성하면된
		Bus bus = new Bus();
//		bus.run();
//		bus.checkFare();
		driver.drive(new Bus());
	}

}
interface Vehicle{
	public void run();
}
class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
		
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
	
}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
		
	}
}
class Driver{
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus= (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
