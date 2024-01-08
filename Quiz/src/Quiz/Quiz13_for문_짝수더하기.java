package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz13_for문_짝수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 20까지 짝수합
		int sum = 0;
		for(int i=0; i<=20; i=i+2) {
			sum=sum+i;
		}
		System.out.print("1부터 20까지 짝수의 합은 : " +sum);
		System.out.println();
		System.out.println("-------------");
	
	}

}
