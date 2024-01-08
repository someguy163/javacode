package 반복문_for_while_do_While;

import java.io.InterruptedIOException;

public class for문_1부터100까지더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
//		1부터100까지 더하기
//		for(int i = 1; i<=100; i++) {
//			sum = sum +i;
//		}
//		System.out.println(sum);
		
		int i;
//		i 전역변수 선언
		for(i =1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 " + (i-1) +"까지 합은 : " + sum );
	}

}
