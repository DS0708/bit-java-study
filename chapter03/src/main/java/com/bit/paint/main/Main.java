package com.bit.paint.main;

import com.bit.paint.i.Drawable;
import com.bit.paint.point.ColorPoint;
import com.bit.paint.point.Point;
import com.bit.paint.shape.Circle;
import com.bit.paint.shape.Rectangle;
import com.bit.paint.shape.Shape;
import com.bit.paint.shape.Triangle;
import com.bit.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point2 = new Point(220,30);
		Point point = new Point();
		point.setX(100); 		//before learning contructor
		point.setY(50);
		draw(point2);
		draw(point);
		point.draw(false);
		
		Point point3 = new ColorPoint(200,100,"red");		//upcasting, implicitly allowed.
//		ColorPoint p3 = new ColorPoint(200,100,"red");		//same with above code
//		Point point3 = p3;
		
		
		draw(point3);
		point3.draw(false);
		
		((ColorPoint)point3).setColor("blue");			//Downcasting, must explicitly declare. Because Point class don't have color.
		draw(point3);
		
		ColorPoint point4 = (ColorPoint)point3;
		
		
		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Circle circle = new Circle();
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		gt.draw();
		
		//instanceof test
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Object);
//		System.out.println(circle instanceof Point);		//error
//		System.out.println(circle instanceof Rectangle);	//error	: instanceof는 class계층구조의 상위와 하위에만 사용될 수 있음. ->동일한 계층은 안
		
		//interface는 클래스 계층구조와 상관없이 instanceof 사용 가능.
		System.out.println(circle instanceof Runnable);
		System.out.println(circle instanceof Drawable);
		
	}
	
	private static void draw(Drawable draw) {
		draw.draw();
	}
	
	

//    private static void drawShape(Shape shape) {
//		// TODO Auto-generated method stub
//		shape.draw();
//	}

//	private static void drawRectangle(Rectangle rectangle) {
//		// TODO Auto-generated method stub
//    	rectangle.draw();
//	}

//	private static void drawClolorPoint(ColorPoint point) {
//		// TODO Auto-generated method stub
//		point.show();
//	}

//	private static void drawPoint(Point point) {
//		// TODO Auto-generated method stub
//		point.show(true);
//	}

}
