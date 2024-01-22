package 다형성_Driver;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가달립니다.");
	}
}
