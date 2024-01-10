package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz37_배열로_금액나누기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit[] = {50000,10000,5000,1000,500,100,50,10,1};

		Scanner sc = new Scanner(System.in);

		int result = 0;
		while (true) {
			System.out.println("금액을 입력하세요");
			int money = sc.nextInt();
			if (money !=-1) {
				for(int i=0; i<unit.length; i++) {
					System.out.println(unit[i]+"원 : "+ (money/unit[i]));
					money = money % unit[i];
				}
			}
			else {
				System.out.println("종료되었습니다");
				break;
			}

		}

	}

}
