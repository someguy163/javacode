package 메소드;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOn();
		
		
		double result = cal.divide(5, 6);
		System.out.println(result);
		
		 cal.plus(8, 6);
//		 System.out.println(result);
		
		cal.powerOff();
	}

}
