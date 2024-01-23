package 추상;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new CalcMethod();
		int score[]= {1,2,3,4,5};
		System.out.println("add : " + calculator.add(2, 3));
		System.out.println("subtract : " + calculator.subtract(2, 3));
		System.out.println("average : " + calculator.average(score));
		

	}

}
abstract class Calculator{
	public abstract int add(int a , int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);	
}
class CalcMethod extends Calculator{

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public double average(int[] a) {
		double result =0.0;
		for(int i =0; i<a.length; i++) {
			result = result + a[i];
		}
		return result / a.length;
	}

}
