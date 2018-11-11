package com.patterns.drawing;

import com.patterns.art.Shape;

public class Drawing {

	public Drawing() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void drawShapes(Shape s) {
		System.out.println(s.isClosed());
		s.draw();
	}

}
