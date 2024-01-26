package 자바API;

public class 문자열자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "980228-1234567";
		
		String fristnum = ssn.substring(0,6);
		System.out.println(fristnum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
