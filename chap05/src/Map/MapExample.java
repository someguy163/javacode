package Map;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("\t 홍길동 : " + map.get("홍길동"));
		System.out.println();
		
//		map객체를 keySet 변수에 모두 담는다
		Set<String> keySet = map.keySet();
		
		Iterator<String> keIterator = keySet.iterator();
		while (keIterator.hasNext()) {
			String key = keIterator.next();
			Integer value = map.get(key);
			System.out.println("\t " + key + " : " + value);			
		}
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> enIterator = entries.iterator();
		

		
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
		

	}

}
