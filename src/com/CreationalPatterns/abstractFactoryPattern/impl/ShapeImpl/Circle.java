package com.CreationalPatterns.abstractFactoryPattern.impl.ShapeImpl;

import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;

/**
 * @ClassName: Circle
 * @Description: TODO
 * @author DELL
 * @date 2017年12月5日 下午3:01:55
 * 
 */

public class Circle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.factoryPattern.dao.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

}
