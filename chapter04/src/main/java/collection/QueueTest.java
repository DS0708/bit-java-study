package collection;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		q.offer("duly");
		q.offer("micol");
		q.offer("douner");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		
		
		System.out.println("-------------");
		q.offer("duly");
		q.offer("micol");
		q.offer("douner");
		
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q.poll());
		
	}

}
