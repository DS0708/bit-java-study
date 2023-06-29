package com.bit.paint.point;

public class ColorPoint extends Point {
	private String color;

	
	public ColorPoint(String color) {
		this(0,0,color);
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public ColorPoint() {
		this(null);
	}
	
	
	public String getColor() {
		return color;
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		super.setY(y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void draw() {
		System.out.println("point[x=" + getX() + ", y="+getY()+", color="+this.color+"] is drawn.");
	}
	@Override
	public void draw(boolean visible) {
		if(visible) this.draw();
		else System.out.println("point[x=" + getX() + ", y="+ getY() +", color="+this.color+"] is deleted.");
		
	}
}
