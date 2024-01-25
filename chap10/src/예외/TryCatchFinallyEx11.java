package 예외;

public class TryCatchFinallyEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
//		try {
//			data1 = args[0];
//			data2 = args[1];  
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행매개값의 수가 부족합니다");
//			return;
//		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(value1 + " + " + value2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변경할수없습니다");
			e.printStackTrace();
		}
		finally {
			System.out.println("다시 실행하세요");
			
		}
	}

}
