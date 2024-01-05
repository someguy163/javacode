package Quiz;

import java.util.Scanner;

public class Quiz06_Scanner_각자릿수더하기 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int first = sc.nextInt();
		
		int result = (first/100);
//		100의 자리 출력하기
//		System.out.println("result : " +result );
		int result2 = ((first/10)%10);
//		10의 자리 출력하기
//		System.out.println("result2 : " +result2 );
		int result3 = first%10;
//		1의 자리 출력하기
//		System.out.println("result3 : " +result3 );
		

		System.out.println("각 자리수의 합 = " +(result + result2 + result3));
		
	
	}

}
