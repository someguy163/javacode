package 클래스;

public class Car {
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;



	public Car() {
	}

	//	public Car(String model) {
	//		this.model = model;
	//		
	//	}
	//	
	//	public Car(String model, String color) {
	//		this.model = model;
	//		this.color = color;
	//	}
	//	
	//	public Car(String model,String color, int maxSpeed) {
	//		this.model = model;
	//		this.color = color;
	//		this.maxSpeed = maxSpeed;
	//	}

	public Car(String model) {
		this(model,null,0);

	}

	public Car(String model, String color) {
		this(model,color,0);
	}


	public Car(String model,String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}




}
