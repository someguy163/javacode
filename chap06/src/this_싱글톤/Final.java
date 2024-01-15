package this_싱글톤;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("123456789", "박주형");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
//		person.nation = "dd";
		
//		final로 지정된것은 값을 절대로 바꿀수없다
	}

}
class Person{
	final String nation ="Korea";
	final String ssn;
	String name;
	
	public Person(String ssn , String name ) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
