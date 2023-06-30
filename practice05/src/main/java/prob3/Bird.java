package prob3;

import prob4.Soundable;

public abstract class Bird implements Soundable{
	protected String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void fly();
	public abstract void sing();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 "+this.name+" 입니다.";
	}

//	@Override
//	public String sound() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}