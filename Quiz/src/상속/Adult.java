package 상속;

public class Adult extends Person{
	
		void set() {
			this.age=30;
			this.name="홍길동";
			this.height=190;
			this.setWeight(80);
			System.out.println("Adult");
			System.out.println("나이 : " + age);
			System.out.println("이름 : " + name);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + getWeight());
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adult adult = new Adult();

//		adult.age=30;
//		adult.name="홍길동";
//		adult.setWeight(99);
//		adult.height=175;
		
		adult.set();
			
//		System.out.println();
//		
//		System.out.println("Person");
//		System.out.println("나이 : " + person.age);
//		System.out.println("이름 : " + person.name);
//		System.out.println("키 : " + person.height);
//		System.out.println("몸무게 : " + person.getWeight());
	}

}
class Person{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

}


