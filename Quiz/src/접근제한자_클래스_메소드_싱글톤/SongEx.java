package 접근제한자_클래스_메소드_싱글톤;

public class SongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
	}

}
class Song{
	String title;
	String artist;
	int year;
	String country;



	public Song() {
		this("title","artist",0000,"country");
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	
	}

	public void show() {
		
		
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
//		
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}

}