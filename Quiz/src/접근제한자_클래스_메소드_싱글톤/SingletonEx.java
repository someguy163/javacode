package 접근제한자_클래스_메소드_싱글톤;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getInstance();

		s.setNumber(100);
		System.out.println(s.getNumber());

	}

}
class Singleton{
	private static Singleton s = new Singleton();
	private Singleton(){}

	public static Singleton getInstance() {	
		return s;
	}	
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


}
