package 추상;

public class PhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone smartphone = new Smartphone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetsearch();
		smartphone.turnOff();
		
	}

}
abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
}
class Smartphone extends Phone{

	public Smartphone(String owner) {
		super(owner);
	}
	public void internetsearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
}

