package 메소드;

import java.util.Scanner;

public class 로그인_로그아웃 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberSerivce member1 = new MemberSerivce();
		Scanner  sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 : ");
		String Password = sc.nextLine();


		member1.login(id, Password);

		boolean resultLogin = member1.login(id, Password);

		if (resultLogin) {
			System.out.println("로그인되었습니다");
			member1.logout(id);
		}
		else {
			System.out.println("Id또는 Password가 올바르지 않습니다");	
		}
		
		
		


	}

}

class MemberSerivce{
	String  Id ;
	String Password;


	public MemberSerivce() {
	}

	boolean login(String Id, String Password){
		if (Id.equals("hong") && Password.equals("12345")) {
			return true;			
		}
		return false;
	}

	public void logout(String id) {
		System.out.println(id+" 로그아웃되었습니다");
	}

}
