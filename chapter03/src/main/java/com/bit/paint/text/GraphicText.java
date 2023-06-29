package com.bit.paint.text;

import com.bit.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	
	public GraphicText(String text) {
		super();
		this.text = text;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("'"+text+"'를 그렸습니다.");
	}

}
