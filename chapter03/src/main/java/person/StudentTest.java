package person;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor call order
//		Person p = new Student();		//Call Parent's constructor first, and then child's constructor.
//		Student s = new Student();
//		Person p2 = new Person();
		
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1;					//Upcasting
		p1.setName("Duly");
		
		Student s2 = (Student)p1;		//Downcasting
		s2.setMajor("Computer Science");
		
		System.out.println(s1.toString());
	}

}
