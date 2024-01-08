package Quiz;

import java.util.Scanner;

public class Quiz14_for_팩토리얼계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		n ~ 1 까지 팩토리얼 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 1;
		for(int i = num; i>=1; i--) {
			result=result*i;
		}
		System.out.println(result);
		System.out.println("-------------");
	}

}
