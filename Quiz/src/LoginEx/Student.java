package LoginEx;

public class Student extends Member implements Task{
	String subject;


	public Student(String name, String id, String passWord, String position, String subject) {
		super(name, id, passWord, position);
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("공부를 합니다");

	}

	@Override
	public void test() {
		System.out.println("시험을 봅니다");

	}
}
