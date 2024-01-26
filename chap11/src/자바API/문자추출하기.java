package 자바API;

public class 문자추출하기 {

	public static void main(String[] args) {

		String ssn = "010624-1230123";

		char sex = ssn.charAt(7);

		switch (sex) {
		case '1','3': {
			System.out.println("남자입니다");
			break;
		}
		case '2','4':{
			System.out.println("여자입니다");
			break;
		}
		}
	}

}
