package sec01.exam;

public class Switch_break없는예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random()*4)+8;
		System.out.println("현재시간 : " +time);
		switch (time) {
		case 8: {
			System.out.println("출근합니다");
		}
		case 9: {
			System.out.println("회의를 갑니다");
		}
		case 10: {
			System.out.println("업무를 봅니다.");
		}
		default:
			System.out.println("외근을 갑니다");
		}
	}

}
