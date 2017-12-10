package com.CreationalPatterns.PrototypePattern.impl;

/**
 * @ClassName: Rectangle
 * @Description: TODO
 * @author DELL
 * @date 2017年12月9日 下午1:54:54
 * 
 */

public class Rectangle extends Shape {

	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
		type = "Rectangle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}

}
