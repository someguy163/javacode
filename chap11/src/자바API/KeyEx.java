package 자바API;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key key = new Key(1);
		hashMap.put(key, "홍길동");
		
		String value = hashMap.get(key);
		System.out.println(value);
	}

}
class Key{
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	public int hashcode() {
		return number;
	}
	
}
