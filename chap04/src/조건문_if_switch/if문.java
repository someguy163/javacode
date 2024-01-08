package 조건문_if_switch;

import java.util.Scanner;

public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score = 93;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();

		if (score>=90) {
			System.out.println("점수가 100 ~ 90점입니다");
			System.out.println("등급은 A입니다");
		}
		else if (score >= 80) {
			System.out.println("점수가 89 ~ 80점입니다");
			System.out.println("등급은 B입니다");

		}
		else if (score >= 70) {
			System.out.println("점수가 79 ~ 70점입니다");
			System.out.println("등급은 C입니다");
		}
		else if (score >= 60) {
			System.out.println("점수가 69 ~ 60점입니다");
			System.out.println("등급은 D입니다");
		}
		else {
			System.out.println("60점보다 낮습니다");
			System.out.println("등급은 F입니다");
			
		}
		System.out.println("점수는 :  "+score);
	}

}
