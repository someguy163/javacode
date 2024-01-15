package this_싱글톤;

import 메소드.double_계산;

public class static_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatior cal = new Calculatior();
		double result = Calculatior.pi;
		int result1 = Calculatior.plus();
//		int result2 = Calculatior.plus(10, 5);
		
//		System.out.println("result : " + result1);
		System.out.println("result1 : " + result1);
//		System.out.println("result2 : " + result2);
		
//		double result4 = Calculatior.plus(10, 5);
//		System.out.println("result2 : " + result4);
	}

}
class Calculatior{
	int x;
	int y;
	
	static double pi = 3.141592;
	
	static int plus() {
		Calculatior calculatior = new Calculatior();
		calculatior.x =10;
		calculatior.y =10;
		return  calculatior.x+ calculatior.y;
	}
	static int minus(int x , int y) {
		return x-y;
	}
}
