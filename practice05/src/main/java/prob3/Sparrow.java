package prob3;

public class Sparrow extends Bird {
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "짹짹";
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(
				"참새("+super.getName()+")가 날아다닙니다."
				);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println(
				"참새("+super.getName()+")가 소리내어 웁니다."
				);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 "+super.toString();
	}
	

}
