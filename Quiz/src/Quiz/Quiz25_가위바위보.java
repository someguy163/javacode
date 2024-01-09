package Quiz;

import java.util.Scanner;



public class Quiz25_가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("r : 주먹 , p : 보자기 s : 가위");
			System.out.print("철수 : ");
			String man = sc.nextLine();
			System.out.print("영희 : ");
			String girl = sc.nextLine();

			if ((man.equals("p") && girl.equals("r")) || (man.equals("r") && girl.equals("s")) || (man.equals("s") && girl.equals("p"))) {
				System.out.println("철수 숭");
			}
			else if ((man.equals("p") && girl.equals("s")) || (man.equals("r")&& girl.equals("p")) || (man.equals("s") && girl.equals("r"))) {
				System.out.println("영희 승");
			}
			else if (man.equals(girl)) {
				run = false;
				System.out.println("무승부");
			}
		}
	}

}
