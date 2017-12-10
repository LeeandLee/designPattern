package com.CreationalPatterns.PrototypePattern.impl;

/**
 * @ClassName: Square
 * @Description: TODO
 * @author DELL
 * @date 2017年12月9日 下午1:58:42
 * 
 */

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.PrototypePattern.impl.Shape#draw()
	 */
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square ::draw() method.");
	}

}
