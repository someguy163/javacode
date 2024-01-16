package 메소드;

import java.util.Iterator;
import java.util.Scanner;

public class 배열입력받아_최댓값출력_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[13];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("값을 입력하세요");
		for(int scores : score) {
			score[i] = sc.nextInt();
			i++;
		}
		maxResult(score);
	}
	static void maxResult(int[] arr) {
		int max = 0;
		for(int i =0; i<arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("최댓값은 : " + max);
	}

}
