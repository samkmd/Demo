package com.patterns.art;

public class Rectangle implements Shape{

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}

	@Override
	public boolean isClosed() {
		
		return true;
	}

}
