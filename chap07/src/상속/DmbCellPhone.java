package 상속;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(int channel) {
		super("자바","검정");
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel +"번으로 바꿉니다");
	}
	void turnOff() {
		System.out.println("DMB 방송수신을 멈춥니다");
	}
}
