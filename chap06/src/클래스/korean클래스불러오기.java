package 클래스;

public class korean클래스불러오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박주형", "111111-1111111");
		System.out.println(k1.name);
		System.out.println(k1.ssn);

		Korean k2 = new Korean("김자바", "123456-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
