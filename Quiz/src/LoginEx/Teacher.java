package LoginEx;

public class Teacher extends Member implements Task{
	String subject;


	public Teacher(String name, String id, String passWord, String position, String subject) {
		super(name, id, passWord, position);
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("강의를 합니다");

	}

	@Override
	public void test() {
		System.out.println("채점을 합니다");

	}
}
