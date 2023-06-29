package person;

public class Person {
	private String name;
	
	public Person() {
//		System.out.println("Call Person's constructor.");
		this(null);
	}
	
	@Override
	public String toString() {
		return "name=" + name + "\n";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
