package Quiz;

import java.util.Iterator;

public class Quiz30_로또번호_중복값제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 방법
////		크기 45 배열 선언
//		int lotto[] = new int[45];
//		
////		배열크기에 맞게 출력
//		for(int i =0; i<lotto.length; i++) {
////			랜덤변수 발생
//			int randnum = (int) (Math.random()*45+1);
////			랜덤변수를 lotto배열에 차례대로 저장
//			lotto[i] = randnum;
////			반복문을 한번더 돌려 중복값 제거
////			원리는 j라는 변수를 선언해서 i까지 반복시킨다
//			for(int j =0; j<i; j++) {
////				만약 lotto[i]와 lotto[j]의 값이 같으면
////				i를 하나빼라
//				if (lotto[i] == lotto[j]) {
//					i--;
//				}
//			}
//		}
//		for(int i=0; i<=5; i++) {
//			System.out.println("ball["+i+"] : "+lotto[i]);
//		}
		
		
//		2. 방법
		int ball[] = new int[45];
		int i , n , tmp;
		
		for(i=0; i<ball.length; i++ ) {
			ball[i]=i+1;
		}
		
		for(i=0; i<6; i++) {
			n = (int) (Math.random()*45);
			ball[i] = ball[n];
			for(int j=0; j<i; j++) {
				if (ball[i] == ball[j]) {
					i--;
					break;
				}
			}

			
		}
		for(i=0; i<6; i++) {
			System.out.println(ball[i]);	
		}
	}

}
