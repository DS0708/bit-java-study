package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	
	public RectTriangle(int i, int j) {
		// TODO Auto-generated constructor stub
		this.width = i;
		this.height = j;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+Math.sqrt(width*width+height*height);
	}
	
	

}
