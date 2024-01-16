package 메소드_클래스;

public class Tv {
	String brand;
	int year;
	int inch;
	
	void show() {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 Tv");
	}

	public Tv(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
}
