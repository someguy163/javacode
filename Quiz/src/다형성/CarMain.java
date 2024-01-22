package 다형성;

import java.util.Iterator;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recar recar = new Recar();
		Car[] cars = new Car[2];
		cars[0] = new Ferrari();
		cars[1] = new Maserati();
		
		for(int i =0; i<cars.length; i++) {
			recar.drive(cars[i]);
		}
	}

}
class Car{
	public void run() {
		System.out.println("자동차가 달린다");
	}
}
class Ferrari extends Car{
	public void run() {
		System.out.println("Ferrari가 달린다");
	}
}
class Maserati extends Car{
	public void run() {
		System.out.println("Maserati가 달린다");
	}
}
class Recar{
	public void drive(Car car) {
		car.run();
	}
}


