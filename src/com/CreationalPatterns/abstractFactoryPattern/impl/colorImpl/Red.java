package com.CreationalPatterns.abstractFactoryPattern.impl.colorImpl;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;

/**
 * @ClassName: Red
 * @Description: TODO
 * @author DELL
 * @date 2017年12月5日 下午3:18:36
 * 
 */

public class Red implements Color {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.abstractFactoryPattern.dao.Color#fill()
	 */
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Inside Red::fill() metnod.");
	}

}
