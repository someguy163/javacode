package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz18_for별찍기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		 
		for(int i = 1; i<=num; i++) {
			for(int x=num; x>i; x--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
