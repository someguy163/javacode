package Quiz;

import java.util.Scanner;

public class Quiz19_for_구구단_원하는단과_배수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("출력하고자 하는 단을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("출력하고자 하는 데이터를 입력하세요");
		int num2 = sc.nextInt();


		for(int j =0; j<=9; j=j+num2) {
			if (j!=0) {
				System.out.println(num1+" x " +j + " = " + num1*j );	
			}
		}
		System.out.println();
	}
}


