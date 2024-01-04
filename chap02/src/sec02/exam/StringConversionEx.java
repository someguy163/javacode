package sec02.exam;

import java.util.Scanner;

public class StringConversionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		
		int str = 1;
		String value = String.valueOf(str);
		System.out.println("value : " + value);
		
		String str1 =String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		
		System.out.println("입력하세요");
//		Scanner sc = new Scanner(System.in);
//		int date = sc.nextInt();
//		System.out.println("date : "+date);
//		
	}

}
