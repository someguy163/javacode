package Quiz;

import java.util.Scanner;

public class Quiz12_Switch문_작성방법다르게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 : ");
		int season = sc.nextInt();
		
		switch (season) {
		case 3 ,4 ,5: {
			System.out.println(season + "월은 봄입니다");
			break;
		}
		case 6 ,7 , 8 :{
			System.out.println(season + "월은 여름입니다");
			break;
		}
		case 9 , 10 , 11:{
			System.out.println(season + "월은 가을입니다");
			break;
		}
		case 12 , 1 ,2 :{
			System.out.println(season + "월은 겨울입니다");
			break;
		}
			
		}
	}

}
