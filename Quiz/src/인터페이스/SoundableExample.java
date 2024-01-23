package 인터페이스;

public class SoundableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsound(new Dog());
		printsound(new Cat());
	}
	private static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
interface Soundable{
	String sound();
}
class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}

}
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야용";
	}

}