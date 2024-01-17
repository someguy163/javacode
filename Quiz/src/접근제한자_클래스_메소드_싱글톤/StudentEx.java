package 접근제한자_클래스_메소드_싱글톤;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("고길동", 3, 17, 92, 63, 74);
		student.info();
	}

}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int result=0;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		result = kor + eng + math;
		return result;
	}
	public float getAverage() {
		float avg = Math.round(getTotal()/3.0f*10)/10.0f;
		return avg;
	}
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("반 : " + ban);
		System.out.println("번호 : " + no);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + getTotal());
		System.out.println("평균 : " + getAverage());
	}
	
}