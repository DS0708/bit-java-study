package collection;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();
		
		s.add("duly");
		s.add("micol");
		s.add("douner");
		s.add("douner");
		
		String s1 = new String("duly");
		
		s.add(s1);			//add할때도 값으로 비교함.
		
		System.out.println(s.size());
		System.out.println(s.contains("duly"));
		System.out.println(s.contains("touch"));
		System.out.println(s.contains(s1));		//값으로 비교함.
		
		System.out.println("===================");
		
		//Deletion도 값으로 비교해서 delete.
		s.remove("micol");
		//순회
		for(String i : s) {
			System.out.println(i);
		}
		
	}

}
