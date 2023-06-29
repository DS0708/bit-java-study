package com.bit.paint.point;

import com.bit.paint.i.Drawable;

public class Point implements Drawable{
	private int x;
	private int y;
	
	@Override
	public void draw() {
		draw(true);
	}
	
	public void draw(boolean visible) {
		if(!visible) {
			System.out.println("point[x=" + x + ", y="+y+"] is deleted.");
		}else {
			System.out.println("point[x=" + x + ", y="+y+"] is drawn.");
		}
		
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
