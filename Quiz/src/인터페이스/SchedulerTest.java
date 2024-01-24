package 인터페이스;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("전화 상담 배분방식을 선택하세요");
		System.out.println("R : 한명씩 차레로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		while (true) {
			String selectMenu = scanner.nextLine();
			switch (selectMenu) {
			case "R" ,"r": {
				Scheduler RoundRobin =new RoundRobin();
				RoundRobin.getNextCall();
				RoundRobin.senCallToAgent();
				break;
			}
			case "L" ,"l": {
				Scheduler LeastJob =new LeastJob();
				LeastJob.getNextCall();
				LeastJob.senCallToAgent();
				break;
			}
			case "P" ,"p": {
				Scheduler PriorityAllocation =new PriorityAllocation();
				PriorityAllocation.getNextCall();
				PriorityAllocation.senCallToAgent();
				break;
			}
			}
		}
	}
}
interface Scheduler{
	void getNextCall();
	void senCallToAgent();
}
class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	@Override
	public void senCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다");

	}

}
class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");

	}

	@Override
	public void senCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상덤원에게 할당합니다");

	}

}
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다");

	}

	@Override
	public void senCallToAgent() {
		System.out.println("업무 Skill이 가장 높은 상담원의 대기열에 앞에 우선 배분합니다");

	}

}
