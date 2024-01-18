package login;

import java.util.Scanner;

public class LoginSys {

	
	public static Member[] members = new Member[2];
	public static Scanner scan = new Scanner(System.in);
	public static int session = -1;
	
	public static void main(String[] args) {
		// 로그인 프로그램
//		new Controller();
		Controller.init();
		
	}

}
