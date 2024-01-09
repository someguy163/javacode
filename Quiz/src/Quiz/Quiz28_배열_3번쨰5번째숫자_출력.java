package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz28_배열_3번쨰5번째숫자_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i =0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		System.out.println(score[2]);
		System.out.println(score[4]);
		System.out.println(score[9]);
	}

}
