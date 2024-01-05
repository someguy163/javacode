package Quiz;

import java.util.Scanner;

public class Quiz08_Scanner_if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		학생성적에 따라서 A,B,C,D,F 분리하고 
//		+ , 0 , - 로 분리하기
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
//		1. if문 2개돌리기
		
		//		if (score >= 90) {
		//			System.out.print("A");
		//		}
		//		else if (score >= 80) {
		//			System.out.print("B");
		//		}
		//		else if (score >= 70) {
		//			System.out.print("C");
		//		}
		//		else if (score >= 70) {
		//			System.out.print("D");
		//		}
		//		else {
		//			System.out.print("F");
		//		}
		//		
		//		int result = score%10;
		//		
		//		if ( result >= 7) {
		//			System.out.print("+");
		//		}
		//		else if (result >= 4) {
		//			System.out.println("0");
		//		}
		//		else {
		//			System.out.println("-");
		//		}

//		2.삼항연산자 사용하기
		
		int result = score%10;
				
		 if (score == 100) {
			System.out.println("A+");
		}else if (score >= 90) {
			char x = 'A';
			System.out.print("A");
			char total = (score%10 >=7) ? '+' : (score %10 >= 4) ? 'o' : '-' ;
			System.out.println(total);
		}
		else if (score >= 80) {
			char x = 'B';
			System.out.print("B");
			char total = (score%10 >=7) ? '+' : (score %10 >= 4) ? 'o' : '-' ;
			System.out.println(total);
		}
		else if (score >= 70) {
			char x = 'C';
			System.out.print("C");
			char total = (score%10 >=7) ? '+' : (score %10 >= 4) ? 'o' : '-' ;
			System.out.println(total);
		}
		else if (score >= 70) {
			char x = 'D';
			System.out.print("D");
			char total = (score%10 >=7) ? '+' : (score %10 >= 4) ? 'o' : '-' ;
			System.out.println(total);
		}
		else {
			System.out.print("F");
			char x = 'E';
			char total = (score%10 >=7) ? '+' : (score %10 >= 4) ? 'o' : '-' ;
			System.out.println(total);
		}
//		
	}

}
