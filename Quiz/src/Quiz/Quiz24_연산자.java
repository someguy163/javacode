package Quiz;

import java.util.Scanner;


public class Quiz24_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("전공 이수학점 : ");
		int master = sc.nextInt();
		System.out.print("교양 이수학점 : ");
		int sub = sc.nextInt();
		System.out.print("일반 이수학점 : ");
		int nat = sc.nextInt();
		
		int result = master + sub + nat;
		if (result >= 140 && sub >=30 && nat >=30 && master>=70 && sub+nat>=80 ) {
			System.out.println("졸업가능");
		}
		else {
			System.out.println("졸업 불가");
		}
	}

}
