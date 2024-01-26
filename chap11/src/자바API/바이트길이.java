package 자바API;

import java.io.UnsupportedEncodingException;

public class 바이트길이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요";
		
		byte byte1[] = str.getBytes();
		System.out.println("byte length : " + byte1.length);
		String str1 = new String(byte1);
		System.out.println("byte -> String : " + str);
		
		try {
			byte byte2[] = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + byte2.length);
			String str2 = new String(byte2, "EUC-KR");
			System.out.println("byte2 -> String : " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
