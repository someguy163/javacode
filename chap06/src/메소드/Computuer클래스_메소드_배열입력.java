package 메소드;

public class Computuer클래스_메소드_배열입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		int values1[]= {1,2,3,4,5};
		int result1 = com.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		int result3 = com.sum2(1,2,3,4,5);
		System.out.println("result3 : " + result3);
	}

}
