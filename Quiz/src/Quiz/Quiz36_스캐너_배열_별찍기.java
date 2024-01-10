package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz36_스캐너_배열_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int star[] = new int[3];

		System.out.println("3개의 값을 입력하세요 ");
		for(int i=0; i<star.length; i++) {
			int num = sc.nextInt();
			star[i]=num;
		}
		for(int i =0; i<star.length; i++) {
			System.out.print(star[i] + " : ");
			for(int j=0; j<star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}

	}

}
