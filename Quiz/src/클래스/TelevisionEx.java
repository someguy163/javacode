package 클래스;

public class TelevisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television television = new Television(7, 9 , true);
		
		System.out.println("나의 텔레비전 채널은 " + television.channel + " 볼륨은 : " + television.volume + " 현재상태는 : " + television.onOff);
		Television television1 = new Television(9, 12 , true);
		System.out.println("나의 텔레비전 채널은 " + television1.channel + " 볼륨은 : " + television1.volume + " 현재상태는 : " + television1.onOff);
	}

}

