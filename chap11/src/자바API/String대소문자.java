package 자바API;

public class String대소문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		String lowerstr = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		
		System.out.println(lowerstr.equals(lowerstr2));
				
	}

}
