package 자바API;

public class 문자열순서수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldstr = "자바는 객체지향언어 입니다 . 자바는 풍부한 API를 지원합니다";
		String newstr = oldstr.replace("자바", "java");
		
		System.out.println(newstr);

	}

}
