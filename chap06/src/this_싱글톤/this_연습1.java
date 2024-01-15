package this_싱글톤;

public class this_연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1 = new Car1("포르쉐");
		Car1 car2 = new Car1("벤츠");
		
		car1.run();
		System.out.println();
		car2.run();

	}

}
class Car1 {

	String model;
	int speed;
	
	public Car1(String model) {
		this.model = model;

	}

	 void setSpeed(int speed) {
		this.speed = speed;
	}
	 void run() {
		for(int i =10; i<=50; i++) {
			this.setSpeed(i);
			System.out.println(this.model + " 가 달립니다 시속 : " + this.speed);
		}
	}


}
