package 상속;

public class Car {
	public int Speed;
	
	public void speeUp() {
		Speed +=1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		Speed = 0;
	}
}
class SportsCar extends Car{
	
	@Override
	public void speeUp() {
		Speed +=10;
	}
//	public final void stop() {
//		System.out.println("차를 멈춤");
//		Speed = 0;
//	}
}
