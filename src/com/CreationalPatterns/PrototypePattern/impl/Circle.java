package com.CreationalPatterns.PrototypePattern.impl;

/**
 * @ClassName: Circle
 * @Description: TODO
 * @author DELL
 * @date 2017年12月9日 下午2:00:03
 * 
 */

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.PrototypePattern.impl.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle ::draw() method.");
	}

}
