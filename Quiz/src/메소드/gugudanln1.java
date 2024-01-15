package 메소드;

import java.util.Scanner;

public class gugudanln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan1 gugudan1 = new gugudan1();
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력할까요? ");
		int dan = sc.nextInt();
		
		gugudan1.play(dan);
		
	}

}
class gugudan1 {
	void play(int dan) {
		System.out.println(dan + " 단");
		for(int i =1; i<10; i++) {
			System.out.println(dan + " x " + i +" = " + dan*i);
		}
	}
}

