package 쓰레드;

import java.util.Iterator;

public class 쓰레드이름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		System.out.println("작업 쓰레드 이름 : " + threadA.getName());
		threadA.start();
		System.out.println("작업 쓰레드 이름 : " + threadB.getName());
		threadB.start();
	}

}
class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
		{
	}
}
class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
