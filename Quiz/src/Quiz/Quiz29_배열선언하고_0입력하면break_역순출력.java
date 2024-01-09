package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz29_배열선언하고_0입력하면break_역순출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int score[] = new int[100];
		int cnt=0;
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			if(score[i]==0) {
				System.out.println("종료");
				break;
			}
			cnt++;
			
		}
		System.out.println("마지막 입력부터 출력");

		for(int i=cnt; i>=0; i--) {
			if (score[i]!=0) {
				System.out.println(score[i]);	
			}
			
		}
		
	}

}
