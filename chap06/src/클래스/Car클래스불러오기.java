package 클래스;

public class Car클래스불러오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car("white");
//		
//		System.out.println("제작회사 : "+car.company);
//		System.out.println("모델명 : "+car.model);
//		System.out.println("색깔 : "+car.color);
//		System.out.println("최고속도 : "+car.maxSpeed);
//		System.out.println("현재속도 : "+car.speed);
//		
////		변경
//		car.speed=10;
//		System.out.println("변경된 속도 : "+car.speed);
		
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
//		model
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3= new Car("자가용","빨강");
//		model , color 
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시","검정",200);
//		model , color, maxSpeed
		System.out.println("car3.company : " + car4.company);
		System.out.println("car3.model : " + car4.model);
		System.out.println("car3.color : " + car4.color);
		System.out.println("car3.color : " + car4.maxSpeed);
		System.out.println();
		
	}

}
