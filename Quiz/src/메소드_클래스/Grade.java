package 메소드_클래스;

public class Grade{
	private int math;
	private int science;
	private int english;
	int Avg =0;

	public Grade() {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	
	int average() {
		this.math = math;
		this.science = science;
		this.english = english;
		
		Avg = (math+science+english)/3;
		return Avg;
	}
	
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}

	
	
	
}