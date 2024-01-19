package 상속;

public class AirPlane {
	public void land() {
		System.out.println("착륙합니다");
	}
	public void fly() {
		System.out.println("일반비행합니다");
	}
	public void takeOff() {
		System.out.println("이륙합니다");
	}
}
class SuperSonicAirPlane extends AirPlane{
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flymode  =NORMAL;
	
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초 음속 비행입니다");
		}
		else {
			super.fly();
		}
	}
}