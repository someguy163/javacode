package 인터페이스;

public class RemoteControllerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RemoteController remoteController = new Television();
//		remoteController.turnOn();
//		remoteController.turnOff();
//		remoteController.setVolume(11);
//		Searchable searchable = new Television();
//		searchable.search("sss");
//		System.out.println("-----------");
//		RemoteController audioController = new Audio();
//		audioController.turnOn();
//		audioController.turnOff();
//		audioController.setVolume(9);
		
		
//		Television television = new Television();
//		RemoteController rc = television;
//		Searchable searchable = television;
		
		Myclass myclass = new Myclass();
		myclass.rc.turnOn();
		myclass.rc.turnOff();
		
		System.out.println("-----------");
		Myclass myclass2 = new Myclass(new Audio());
		
		System.out.println("-----------");
		Myclass myclass3 = new Myclass();
		myclass.methodA();
		
		System.out.println("-----------");
		Myclass myclass4 = new Myclass();
		myclass.methodB(new Television());
		
		
	}

}
interface RemoteController{
	public int MAX_VOLUME =10;
	public int MIN_VOLUME =0;

	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
class Television implements RemoteController,Searchable{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		}
		else if (volume<RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	
	}

	@Override
	public void search(String url) {
		System.out.println("URL을 검색합니다 : " + url);
	}

}
class Audio implements RemoteController{

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		}
		else if (volume<RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}
	
}
interface Searchable{
	void search(String url);
}
class Myclass{
	RemoteController rc = new Television();
	public Myclass() {
	}
	public Myclass(RemoteController rc) {
		super();
		this.rc = rc;
		rc.setVolume(5);
	}
	void methodA() {
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteController rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
}