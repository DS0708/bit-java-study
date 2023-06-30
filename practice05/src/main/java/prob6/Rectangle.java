package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	
	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.width = i;
		this.height = j;
	}


	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.width *= s;
		this.height *= s;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}


}
