package login;

public class Controller {
	public Controller(){
		init();
}

//private void init() {
	public static void init() {//메인의 시작점
	boolean run = true;
	
	while(run) {
		int selectNum = View.menu();  //static으로 한정되 메서드 바로 사용 가능
		
		switch(selectNum) {
		case 1://회원가입
			Member member = View.signUp();
			
			int chk =-1;
			
			for(int i=0; i<LoginSys.members.length;i++) {
				if(LoginSys.members[i]==null) {
					LoginSys.members[i] = member;
					chk = i;
					
					break;
				}
				
			}
			if(chk == -1) {
				View.deadline();
			}
			break;
		case 2://로그인
			String[] account = View.LogIn();
			int idx = -1;
			for(int i =0; i<LoginSys.members.length;i++) {
				if(LoginSys.members[i] == null) {
					continue;
				}else if(LoginSys.members[i].getUserId().equals(account[0])&&(LoginSys.members[i].getUserPassword().equals(account[1]))) {
					idx = i;
					LoginSys.session = i;
					System.out.println((1+i)+"번째 회원");
					View.success(i);
					//System.out.println("로그인 완료");
				}
			}
			if( idx== -1) {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("아이디 또는 비밀번호를 다시 확인해 주세요.");
			}
			break;
		case 3://프로그램 종료
			run = View.programExit();
			break;
		case 4://회원조회
			for(int i=0; i<LoginSys.members.length;i++) {
				if (LoginSys.members[i] == null) {
					break;
				}
				LoginSys.members[i].prt();
			}
			break;	
		default://
			View.userfault();
			break;
		}
	}
	
}

}
