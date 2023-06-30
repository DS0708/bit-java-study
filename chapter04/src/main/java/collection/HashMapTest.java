package collection;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String, Integer> m = new HashMap<>();
			
			m.put("one", 1);	//auto boxing		int -> Integer
			m.put("two", 2);
			m.put("three", 3);
			
			int i = m.get("one");	//auto unboxing
			int j = m.get("two");
			System.out.println(i + ":" + j);
			
			m.put("three", 33333);		//값이 바뀐다.
			System.out.println(m.get("three"));
			
			
			System.out.println("===========");
			
			//순회
			for (String key : m.keySet()) {
				System.out.println(m.get(key));
			}
			
			
			System.out.println("===========");
			Set<String> s = m.keySet();
			for(String key : s) {
				System.out.println(m.get(key));
			}
	}

}
