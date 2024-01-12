package 메소드;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam01 exam01 = new Exam01();
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하세요");
		System.out.print(">");
		int a = sc.nextInt();
		System.out.print(">");
		int b = sc.nextInt();
		
		exam01.maxNumber(a, b);
	}

}
class Exam01{
	public void maxNumber(int a, int b) {
		if (a>b) {
			System.out.println(a+" 와 " + b + "중에 큰수는 ==> " + a + "입니다");
		}
		else if (a<b) {
			System.out.println(a+" 와 " + b + "중에 큰수는 ==> " + b + "입니다");
		}
		else {
			System.out.println("두 수가 같습니다");
		}
	}
}

