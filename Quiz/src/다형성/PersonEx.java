package 다형성;

public class PersonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProFessor proFessor = new ProFessor();
		proFessor.setPhone("010-111-2222");
		System.out.println("Professor : "+proFessor.getPhone());
		
		Person person = (ProFessor) proFessor;
		person.setPhone("010-222-1111");
		System.out.println("Professor : "+person.getPhone());

	}

}
class Person{
	private String phone;
	
	public Person() {
		super();
	}

	public Person(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
class ProFessor extends Person{

	public ProFessor() {
		super();
	}
	
}
