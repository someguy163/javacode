package Quiz;

import java.util.Iterator;
import java.util.Scanner;


public class Quiz27_배열Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
//		Scanner로 배열값 저장하기
		System.out.println("양수 5개를 입력하세요");
		int max=0;
		for(int i = 0; i<score.length; i++) {
//			System.out.println(5-i +"개남았습니다");
			int num = sc.nextInt();
//			Scanner 입력받은거 score[i]에 차례대로 저장
			score[i]=num;
//			가장 큰수 출력하기
			if (max<score[i]) {
				max=score[i];
			}
		}
		
		System.out.println(max);

	}

}
