package 메소드;

public class 속도계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSpeed car = new CarSpeed();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("달립니다 시속 : " + speed);
	}

}
class CarSpeed {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	void run() {
		for(int i =0; i<=50; i++) {
			speed = i;
			System.out.println("달립니다 시속 : " + speed);
		}
	}
	
}
