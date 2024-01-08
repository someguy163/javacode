package 반복문_for_while_do_While;

public class for문_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=2; x<=9; x++) {
			System.out.println(x+"단");
			for(int y =1; y<=9; y++) {
				System.out.println(x +" x "+ y + " = "+x*y);
			}
			System.out.println();
		}
		
	}

}
