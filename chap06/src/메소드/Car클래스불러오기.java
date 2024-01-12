package 메소드;

public class Car클래스불러오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		
//		1번
		if (gasState) {
			System.out.println("출발합니다");
			car.run();
		}
//		위의 1번 if문이 끝나면 gasState의 값은 false로 된다
//		gas = 0 이다
		
//		2번
		if (car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가없습니다");
		}
		else {
			System.out.println("가스를 주입하세요");
		}
	}

}
