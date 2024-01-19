package 상속;

public class ComputuerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		int r=10;

		System.out.println("원 면적 : " +calculator.areaCircle(r));
		
		System.out.println("원 면적 : " +computer.areaCircle(r));
	}

}
