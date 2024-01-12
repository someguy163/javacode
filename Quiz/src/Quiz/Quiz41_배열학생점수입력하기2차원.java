package Quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz41_배열학생점수입력하기2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameScore[][] =  {{"고길동","","",""}
		,{"김길동","","",""}
		,{"이길동","","",""}
		,{"박길동","","",""}
		,{"홍길동","","",""}};
		
		int Avg[] = new int[5];
		int rank[] = {1,1,1,1,1};

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean subrun =true;

		int mathScore = 0;
		int korScore = 0;
		int engScore = 0;
		int sum = 0;
		int Score = 0;



		while(run) {
			System.out.println("성적관리 프로그램");
			System.out.println("1 : 성적입력");
			System.out.println("2 : 성적조회");
			System.out.println("3 : 석차조회");
			System.out.println("4 : 프로그램종료");
			int menu = sc.nextInt();

			if (menu==1) {
				for(int i =0; i<nameScore.length; i++) {
					System.out.println(nameScore[i][0]);

					System.out.print("국어점수 : ");
					String kor = sc.next();
					nameScore[i][1] = kor;

					System.out.print("영어점수 : ");
					String eng = sc.next();
					nameScore[i][2] = eng;

					System.out.print("수학점수 : ");
					String math = sc.next();
					nameScore[i][3] = math;
				}
			}

			else if (menu==2) {
				while (subrun) {
					System.out.println("개인별 성적조회");
					System.out.println("과목별 성적조회");
					System.out.println("이전 메뉴 돌아가기");
					System.out.print("선택 > ");
					int subMenu = sc.nextInt();
					if (subMenu==1) {

						System.out.println("검색하려는 학생 이름입력하세요");
						String searchName = sc.next();

						if (searchName.equals("고길동")) {
							for(int j =1; j<4; j++) {
								System.out.println(nameScore[0][j]);
								Score = Integer.parseInt(nameScore[4][j]);
								sum=sum+Score;
							}
							System.out.println("총점 : " + sum);
							System.out.println("평균 : " + sum/3);

						}	
						else if (searchName.equals("김길동")) {
							for(int j =1; j<4; j++) {
								System.out.println(nameScore[1][j]);
								Score = Integer.parseInt(nameScore[4][j]);
								sum=sum+Score;
							}
							System.out.println("총점 : " + sum);
							System.out.println("평균 : " + sum/3);
						}
						else if (searchName.equals("이길동")) {
							for(int j =1; j<4; j++) {
								System.out.println(nameScore[2][j]);
								Score = Integer.parseInt(nameScore[4][j]);
								sum=sum+Score;
							}
							System.out.println("총점 : " + sum);
							System.out.println("평균 : " + sum/3);
						}
						else if (searchName.equals("박길동")) {
							for(int j =1; j<4; j++) {
								System.out.println(nameScore[3][j]);
								Score = Integer.parseInt(nameScore[3][j]);
								sum=sum+Score;
							}
							System.out.println("총점 : " + sum);
							System.out.println("평균 : " + sum/3);
						}
						else if (searchName.equals("홍길동")) {
							for(int j =1; j<4; j++) {
								System.out.println(nameScore[4][j]);
								Score = Integer.parseInt(nameScore[4][j]);
								sum=sum+Score;
							}
							System.out.println("총점 : " + sum);
							System.out.println("평균 : " + sum/3);
						}
					}


					else if (subMenu==2) {
						System.out.println("조회하려는 과목을 선택하세요");
						System.out.println("1 국어점수");
						System.out.println("2 영어점수");
						System.out.println("3 수학점수");
						int study = sc.nextInt();
						if(study==1) {
							for(int i=0; i<nameScore[0].length; i++){
								korScore = Integer.parseInt(nameScore[i][1]);
								sum = sum + korScore;
							}
							System.out.println("국어 점수 총점 : " + sum);
							System.out.println("국어 과목의 평균 : " + sum/3);
						}
						else if (study==2) {
							for(int i=0; i<nameScore[0].length; i++){
								engScore = Integer.parseInt(nameScore[i][2]);
								sum = sum + engScore;
							}
							System.out.println("영어 점수 총점 : " + sum);
							System.out.println("영어 과목의 평균 : " + sum/3);
						}
						else if (study==3) {
							for(int i=0; i<nameScore[0].length; i++){
								mathScore = Integer.parseInt(nameScore[i][3]);
								sum = sum + mathScore;
							}
							System.out.println("수학 점수 총점 : " + sum);
							System.out.println("수학 과목의 평균 : " + sum/3);
						}
					}
					else if (subMenu==3) {
						subrun =false;
					}
				}
			}
			else if (menu ==3) {
				for(int i=1; i<4; i++) {
					int gogil = Integer.parseInt(nameScore[0][i]);
					int kimgil = Integer.parseInt(nameScore[1][i]);
					int leegil = Integer.parseInt(nameScore[2][i]);
					int parkgil = Integer.parseInt(nameScore[3][i]);
					int honggil = Integer.parseInt(nameScore[4][i]);
					Avg[0] = Avg[0] + gogil;
					Avg[1] = Avg[1] + kimgil;
					Avg[2] = Avg[2] + leegil;
					Avg[3] = Avg[3] + parkgil;
					Avg[4] = Avg[4] + honggil;
				}
				
				for(int i=0; i<Avg.length; i++) {
					
				}
				System.out.println("고길동 학생의 성적 : " + Avg[0]);
				System.out.println("김길동 학생의 성적 : " + Avg[1]);
				System.out.println("이길동 학생의 성적 : " + Avg[2]);
				System.out.println("박길동 학생의 성적 : " + Avg[3]);
				System.out.println("홍길동 학생의 성적 : " + Avg[4]);
			}
			else if (menu ==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}

}
