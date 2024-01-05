package Quiz;

import java.util.Scanner;

public class Quiz09_Scanner_if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		점수 입력
		System.out.print("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();

		System.out.print("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();

		System.out.print("수학점수를 입력하세요 : ");
		int math = sc.nextInt();

//		점수 합계
		int sum = math + eng + kor;

//		60미만시 탈락 조건문 실행
		if (math >= 60 && kor >= 60 && eng >= 60) {
//			합계점수 210점 미만일 경우 조건문 실행
			if (sum >= 210) {
				System.out.println("합격");
			}
			else {
				System.out.println("탈락");
			}
		}else {
			System.out.println("탈락");	
		}

	}

}
