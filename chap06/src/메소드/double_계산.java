package 메소드;

public class double_계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cal cal1 = new cal();
		cal1.excute();
	}

}
class cal{
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	double avg(int x,int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}

	void excute() {
		double result = avg(7,10);
		System.out.println("실행 결과 : " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
