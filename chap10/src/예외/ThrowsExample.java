package 예외;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			finclass();
		} catch (ClassNotFoundException e) {
		}System.out.println("클래스가 존재하지 않습니다");

	}

	public static void finclass()throws ClassNotFoundException{
		Class class1 = Class.forName("java.lang.String2");
	}
}
