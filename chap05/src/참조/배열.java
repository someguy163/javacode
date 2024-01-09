package 참조;

import java.util.Iterator;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] score;
//		score = new int[]  {83,90,87};
		
		int score[] = {83,90,87};
		
		System.out.println("scores[0] " +score[0]);
		System.out.println("scores[1] " +score[1]);
		System.out.println("scores[2] " +score[2]);
		
		int sum =0;
		
		for(int i =0; i<score.length; i++) {
			sum = sum+score[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum/score.length;
		System.out.println("평균 : " + avg);
		
	}

}
