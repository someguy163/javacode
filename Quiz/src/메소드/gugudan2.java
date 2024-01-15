package 메소드;

import java.util.Scanner;

public class gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Gugudan gugudan = new Gugudan();
		System.out.println("한개의 숫자만 입력하세요");
		int first = sc.nextInt(); 
		gugudan.play(first);
		System.out.println("2개의 숫자를 입력하세요");
		int second = sc.nextInt();
		gugudan.play(first,second);

		
	}

}
class Gugudan{

	void play(int x , int y) {
		//		x가 y보다 클경우
		if (x<y) {
			for(int i=x; i<=y; i++) {
				System.out.println(i+"단");
				System.out.println();
				for(int j =1; j<=9; j++) {
					System.out.println(i + " x " + j + " = " + i*j);
				}
			}
		}
		else if (x>y) {
			//			x가 y보다 작을경우
			for(int i=y; i<=x; i++) {
				System.out.println(i+"단");
				System.out.println();
				for(int j =1; j<=9; j++) {
					System.out.println(i + " x " + j + " = " + i*j);
				}
			}
		}
		else {
			//			x랑 y가 같은경우
			for(int j =1; j<=9; j++) {
				System.out.println(x + " x " + j + " = " + x*j);
			}
		}

	}
	void play(int x) {
		for(int j =1; j<=9; j++) {
			System.out.println(x + " x " + j + " = " + x*j);
		}
	}
}
