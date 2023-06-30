package collection;

import java.util.*;

public class VectorTest01 {				//이제 안쓴다 쓰지말 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>(); 
		
		v.addElement("duly");
		v.addElement("micol");
		v.addElement("douner");
		
		for(int i=0; i < v.size(); i++) {
//			String s = v.elementAt(i);
//			System.out.println(s);
			System.out.println(v.get(i));
		}
		
		List<String> lv = new Vector<>();
		lv.add("ds");
		lv.add("sm");
		//lv.addElement("dd");
		
		System.out.println(lv);
		System.out.println(v);
		
		List<String> mylv = new MyVector();
		mylv.add("apple");
		mylv.add("banana");
		System.out.println(mylv);
		
	}

}
