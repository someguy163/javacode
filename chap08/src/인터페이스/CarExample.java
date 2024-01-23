package 인터페이스;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.frontLeftTire = new KumhoTire();
		car.run();
		

		car.frontRightTire = new HankookTire();
		car.run();
	}

}
class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
interface Tire{
	public void roll();
}
class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다");

	}

}
class HankookTire implements Tire{
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다");

	}
}
