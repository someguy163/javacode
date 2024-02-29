package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Selvlet/JSP");
		set.add("java");
		set.add("IBATIS");
		
		int size = set.size();
		System.out.println("set 사이즈 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());

		}
		System.out.println("----------------");
		
		set.remove("JDBC");
		set.remove("IBATIS");
		
		int i=0;
		for(String setlist:set) {
			System.out.println("\t" + setlist);
		}
		
		
	}

}
