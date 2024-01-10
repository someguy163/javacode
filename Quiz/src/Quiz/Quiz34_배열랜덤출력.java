package Quiz;

import java.util.Iterator;

public class Quiz34_배열랜덤출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int number[] = new int[3];
		
		
		for(int i =0; i<ballArr.length; i++) {
			int random = (int) (Math.random()*ballArr.length);
			int tmp =0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[random];
			ballArr[random] = tmp;
		}
		System.arraycopy(ballArr, 0, number, 0, 3);
		for(int i =0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
		
//		for(int i =0; i<3; i++) {
//			int random[] = {(int) (Math.random()*10-1)};
//			for(int j=0; j<i; j++) {
//				if (random[i]==random[j]) {
//					i--;
//				}
//			}
//			System.out.println(ballArr[i]);
//	}


	}

}
