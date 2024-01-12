package 메소드;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void plus(int x , int y) {
		int result = x + y;
		System.out.println(result);
	}
	double divide(int x , int y) {
		double result = (double)x / (double) y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
