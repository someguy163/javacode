package LoginEx;

public class View{
	static int checkSession =0;
	static int menu() {
		System.out.println("학사 정보 관리 시스템");
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		int menuSelect = LoginEx.sc.nextInt();
		return menuSelect; 
	}

	static Member CreateMember() {
		Member newMember = null;
		System.out.println("회원가입을 진행합니다");
		System.out.println("ID를 입력하세요");
		String Member_Id = LoginEx.sc.next();
		System.out.println("암호를 입력하세요");
		String Member_passWord = LoginEx.sc.next();
		System.out.println("이름을 입력하세요");
		String Member_Name = LoginEx.sc.next();
		System.out.println("1. 선생님 | 2. 학생");
		String Member_SubjectNum = LoginEx.sc.next();
		if (Member_SubjectNum.equals("1")) {
			System.out.println("담당과목을 입력하세요");
			String Member_Position = LoginEx.sc.next();
			newMember = new Teacher(Member_Name, Member_Id, Member_passWord, Member_Position,Member_SubjectNum);
			System.out.println(newMember.Name);
			checkSession++;
		}
		else if (Member_SubjectNum.equals("2")) {
			System.out.println("전공을 입력하세요");
			String Member_Position = LoginEx.sc.next();
			newMember = new Student(Member_Name, Member_Id, Member_passWord, Member_Position,Member_SubjectNum);
			System.out.println(newMember.Name);
			checkSession++;
		}
		return newMember;
	}
	static String[] Login() {
		String Login[] = new String[2];
		System.out.println("로그인 절차를 진행합니다");
		System.out.println("ID를 입력하세요");
		Login[0] = LoginEx.sc.next();
		System.out.println("PassWord를 입력하세요");
		Login[1] = LoginEx.sc.next();
		return Login;
	}
	static String ExitProgram() {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.println(" Y | N");
		String ExitResult = LoginEx.sc.next();
		return ExitResult;
	}
}
