package com.patterns.drawing;

import com.patterns.art.Shape;

public class Drawing {

	public Drawing() {
		System.out.println();
	}
	
	
	public void drawShapes(Shape s) {
		System.out.println(s.isClosed());
		s.draw();
	}

}
