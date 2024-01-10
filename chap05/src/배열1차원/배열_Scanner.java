package 배열1차원;

import java.util.Iterator;
import java.util.Scanner;


public class 배열_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[3];
//		int[] score = new int[3];
		
		
		System.out.print("국어 점수를 입력하세요 : ");
		score[0] = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		score[1] = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		score[2] = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum/score.length;
		System.out.println("평균 : " + avg);
	}

}
