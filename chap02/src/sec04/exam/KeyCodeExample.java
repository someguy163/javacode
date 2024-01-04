package sec04.exam;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int KeyCode;
//		93Pg 94Pg
//		KeyCode = System.in.read(); //a 입력
//		System.out.println("keyCode : " + KeyCode);
//
//		KeyCode = System.in.read(); //enter CR = 13
//		System.out.println("keyCode : " + KeyCode);
//		
//		KeyCode = System.in.read(); //enter LF = 10
//		System.out.println("keyCode : " + KeyCode);
		
		while (true) {
			KeyCode = System.in.read();
			System.out.println("keycode : " + KeyCode);
			if (KeyCode ==113) {
				break;
			}
			
		}
		System.out.println("종료");
	}

}
