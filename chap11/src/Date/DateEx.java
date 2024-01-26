package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
//		String strNow = now.toString();
		System.out.println(now);
//		System.out.println(strNow);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 aa dd일 hh시 mm분 ss초");
		String strNow2 = simpleDateFormat.format(now);
		System.out.println(strNow2);
		
	}

}
