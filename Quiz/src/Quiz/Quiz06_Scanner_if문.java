package Quiz;

import java.util.Scanner;

public class Quiz06_Scanner_if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력해주세요 : ");
		float height = sc.nextFloat()/100;

		System.out.print("몸무게를 입력해주세요 : ");
		float weight = sc.nextFloat();
		
		float result = weight/(height * height);
		if (result<=18.5) {
			System.out.println("저체중 입니다.");
		}
		else if (result<25) {
			System.out.println("정상 입니다.");
		}
		else if (result<30) {
			System.out.println("과체중 입니다.");
		}
		else if (result<40) {
			System.out.println("비만 입니다.");
		}
		else {
			System.out.println("고도비만 입니다.");
		}
		
	}

}
