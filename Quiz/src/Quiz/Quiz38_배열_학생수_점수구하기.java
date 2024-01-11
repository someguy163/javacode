package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz38_배열_학생수_점수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int result =0;
		int top =score[0];
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			if (menu==1) {
				System.out.println("학생수 : "+score.length);
			}
			else if (menu==2) {
				for(int i =0; i<score.length; i++) {
					System.out.print("score["+i+"] : ");
					score[i] = sc.nextInt();
				}
			}
			else if (menu==3) {
				for(int i =0; i<score.length; i++) {
					System.out.println("score["+i+"] : " + score[i]);
				}

			}
			else if (menu==4) {
				for(int i =0; i<score.length; i++) {
					result = result + score[i];
					//				System.out.println("총점 : " + result);
					
						if (top< score[i]) {
							top=score[i];
						}
					}
				System.out.println("최고 점수 : " + top);
				System.out.println("평쥰 점수 : " + result/score.length);
			}
			else if (menu==5) {
				System.out.println("프로그램 종료");
				run=false;
			}
		}
	}

}


