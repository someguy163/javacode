package 접근제한자_클래스_메소드_싱글톤;

import java.util.Scanner;

public class LoginSysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
			view.menu();
	}
	public static Scanner sc = new Scanner(System.in);
	public static Member members[] = new Member[100];
}
class Member{
	private String Id;
	private String PassWord;
	private String PhoneNum;
	private String name;
	
	

	public Member() {
		super();
	}

	public Member(String id, String passWord, String phoneNum, String name) {
		this.Id = id;
		this.PassWord = passWord;
		this.PhoneNum = phoneNum;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	이름 전화번호 출력하는 메소드
	void prt() {
		System.out.println("이름 : " +getName());
		System.out.println("전화번호 : " + getPhoneNum());
	}

}
class View{
//	Member members[];

	
	
	public View() {
//		this.members = new Member[100];
//		for(int i=0; i<members.length; i++) {
//			members[i] = new Member();
//		}
	}
	boolean Run = true;
	int checkInd = 0;
	
	int signUpCount =0;
	public void menu() {
		while (Run) {
			System.out.println("MIT 사이트에 오신 것을 환영합니다");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			System.out.println("선택 >> ");
			int selectMenu = LoginSysEx.sc.nextInt();
			switch (selectMenu) {
			case 1: {
				signUp();
				break;
			}
			case 2: {
				Login();
				break;
			}
			case 3: {
				programExit();
				break;
			}

			}
		}



	}
	public void userfault() {

	}
	public void signUp() {
		if (signUpCount<=100) {
			System.out.println("회원가입을 합니다");
			System.out.println("아이디를 입력하세요");
			String id = LoginSysEx.sc.next();
//			LoginSysEx.members[signUpCount].setId(id);
			System.out.println("비밀번호를 입력하세요");
			String password = LoginSysEx.sc.next();
//			members[signUpCount].setPassWord(password);
			System.out.println("이름을 입력하세요");
			String name = LoginSysEx.sc.next();
//			members[signUpCount].setName(name);
			System.out.println("전화번호를 입력하세요");
			String phone = LoginSysEx.sc.next();
//			members[signUpCount].setPhoneNum(phone);
			System.out.println(signUpCount);
			Member member = new Member(id,password,phone,name);
			signUpCount++;
		}else {
			deadline();
		}

	}
	public void Login() {
		String account[] = new String[2];
		System.out.println("로그인 합니다");
		System.out.println("아이디를 입력하세요");
		account[0] = LoginSysEx.sc.next();
		System.out.println("비밀먼호를 입력하세요");
		account[1] = LoginSysEx.sc.next();
		for(int i =0; i<=signUpCount; i++) {
				if (LoginSysEx.members[i].getId().equals(account[0]) || LoginSysEx.members[i].getPassWord() == account[1]) {
					
				}
					else {
					System.out.println("아이디와 비밀번호가 맞지 않습니다");
					System.out.println("다시 로그인해주세요");
					break;
				}
			

		}

	}
	public void success() {
		System.out.println(checkInd+"번째 회원");
		System.out.println("로그인에 성공했습니다");
		System.out.println("사용자 이름 : " + LoginSysEx.members[checkInd].getName());
		System.out.println("사용자 폰번호 : " + LoginSysEx.members[checkInd].getPhoneNum());
	}
	public void deadline() {
		System.out.println("회원가입이 100명이 넘었습니다");
		System.out.println("나중에 다시 찾아와주세요");
	}
	public void programExit() {
		System.out.println("프로그램을 종료합니다");
		boolean Run = false;
	}
	public void userFault() {

	}

}
 class Controller{
	View view = new View();
}

