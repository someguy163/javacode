package login;

public class View {
	public static int menu(){
		System.out.println("MIT 사이트에 오신 것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.println("4. 회원조회");
		System.out.print("선택>");
		int selectNum = LoginSys.scan.nextInt();
		return selectNum;
	}
	
	public static void userfault() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해주세요.");
	}
	
	public static Member signUp() {
		System.out.println("회원 가입을 합니다.");
		
		System.out.println("아이디를 입력하세요");
		String id = LoginSys.scan.next();
		
		System.out.println("비밀번호를 입력하세요");
		String password = LoginSys.scan.next();		
		System.out.println("이름을 입력하세요");
		String name = LoginSys.scan.next();
		
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = LoginSys.scan.next();
		
		Member member = new Member(id,password,name,phoneNumber);
		return member;
	}
	
	public static String[] LogIn() {
		String account[] = new String[2];
		
		System.out.println("로그인합니다.");
		System.out.println("아이디를 입력하세요");
		account[0] = LoginSys.scan.next();
		
		System.out.println("비밀번호를 입력하세요");
		account[1] = LoginSys.scan.next();
		
		return account;
	}
	
	public static void success(int i) {
		System.out.println("로그인에 성공했습니다.");
		LoginSys.members[i].prt();  // LoginSys클래스에서 생성해 놓은 Member클래스 객체
	}
	
	public static void deadline() {
		System.out.println("회원가입이 마감되었습니다.");
		System.out.println("나중에 다시 찾아와 주십시오");
	}
	
	public static boolean programExit() {
		do {
			String endCode = LoginSys.scan.nextLine();
			if(endCode.equals("y") || endCode.equals("Y")) {
				System.out.println("프로그램을 종료합니다.");
				return false;
				
			}else if(endCode.equals("n") || endCode.equals("N")){
				System.out.println("프로그램을 종료하지 않겠습니다. 되돌아갑니다.");
				return true;
			}else { 
				System.out.println("^^");	
			}
			System.out.println("종료하시겠습니까? (y/n)");
		}while(true);
	}
}
