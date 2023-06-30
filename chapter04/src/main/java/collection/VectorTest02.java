package collection;

import java.util.*;

public class VectorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<>();
		
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
		list.remove("eeeeee");
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
