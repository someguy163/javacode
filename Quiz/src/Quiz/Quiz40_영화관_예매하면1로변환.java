package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz40_영화관_예매하면1로변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sit[] = {0,0,0,0,0,0,0};
		int sum =0;
		int count=0;


		while (run) {
			System.out.println("MIT영화관");
			System.out.println("1. 좌석선택");
			System.out.println("2. 종료");	
			int menu =sc.nextInt();

			switch (menu) {
			case 1: {
				System.out.println("[0 ~ 6] 좌석을 선택해주세요");
				int reservation = sc.nextInt();
				if (sit[reservation]==1) {
					System.out.println("해당 좌석은 이미 예약되었습니다");
					System.out.println("-------------------------");
				}
				//				010011.. 예약 좌석 보여주기
				sit[reservation] = 1;
				for(int sits : sit) {
					System.out.print(sits);
				}
				System.out.println();
				break;
			}
			case 2:{
				run = false;
				break;
			}
			}

			// 			종료후 예매값 계산
		}
		for(int result : sit) {
			if (result == 1) {
				count++;
			}
		}
		System.out.println("매출액 : " + 12000*count);

	}

}
