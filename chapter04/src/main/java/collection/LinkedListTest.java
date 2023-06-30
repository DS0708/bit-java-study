package collection;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		
		list.add("duly");
		list.add("micol");
		list.add("douner");
		list.add("eeeeee");
		
		//순회 1		Traditional method
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Deletion
		list.remove(2);
		list.remove("eeeeeef");			//같은 것이 없으면 아무일도 일어나지 않는다.
		System.out.println("==============");
		
		//순회 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==============");
		
		//순회 3
		for(String i:list) {
			System.out.println(i);
		}
	}

}
