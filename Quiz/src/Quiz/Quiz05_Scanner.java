package Quiz;

import java.util.Scanner;

public class Quiz05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		두번째 실수가 0이거나 0.0인경우 결과값을 무한대로 출력해라
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫번째 수 : ");
		double first = sc.nextDouble();
		System.out.print("두번째 수 : ");
		double second = sc.nextDouble();
		System.out.println("----------");
		double result1 = first/second;
		String result2="무한대";
		
		String result = (second ==0 || second==0.0) ? result2 : String.valueOf(result1);
//		String result = (second ==0 && second==0.0) ? result2 : String.valueOf(result1);
		
		System.out.println("결과 : " + result);
		
		
		 
	}

}
