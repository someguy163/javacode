package 로그인_인터페이스;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static Member[] members = new Member[100];
	
	public static void main(String[] args) {
		new Controller();
	}
}
