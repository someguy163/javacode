package sec04.exam;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		91Pg
		int value = 123;
		System.out.printf("상품의 가격 : %d원 \n",value);
//		원본 출력
		System.out.printf("상품의 가격 : %6d원 \n",value);
//		6자리만들고 남는자리수 공백
		System.out.printf("상품의 가격 : %6d원 \n",value);
//		6자리만들고 앞에서부터 입력후 뒷자리 공백
		System.out.printf("상품의 가격 : %06d원 \n",value);
//		6자리만들고 공백0으로 출력
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f \n",10, area);
//		소수점 2째자리 까지 출력
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n" ,1,name,job);
		System.out.println("d");
	}

}
