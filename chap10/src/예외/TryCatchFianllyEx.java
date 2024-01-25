package 예외;

public class TryCatchFianllyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz = Class.forName("String");
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다");
			e.printStackTrace();
		}

	}

}
