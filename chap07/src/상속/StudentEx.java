package 상속;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studenNo : " + student.studentNo);
	}

}
