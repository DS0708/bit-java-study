package person;

public class Student extends Person {
	private String major;
	private int grade;
	
	public Student() {
		this(null,null,0);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return super.toString()+"major=" + major + "\ngrade=" + grade + "\n";
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(String name, String major, int grade) {
		super(name);
		this.major = major;
		this.grade = grade;
	}

}
