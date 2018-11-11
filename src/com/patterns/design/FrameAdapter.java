package com.patterns.design;

import com.patterns.art.Shape;

public class FrameAdapter implements Shape{
	
	Frames frame;

	public FrameAdapter(Frames frame) {
		this.frame = frame;
	}

	@Override
	public void draw() {
		frame.build();
	}

	@Override
	public boolean isClosed() {
		return true;
	}
	
	

}
