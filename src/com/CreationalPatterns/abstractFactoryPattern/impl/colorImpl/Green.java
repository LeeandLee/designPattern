package com.CreationalPatterns.abstractFactoryPattern.impl.colorImpl;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;

/**
 * @ClassName: Green
 * @Description: TODO
 * @author DELL
 * @date 2017年12月5日 下午3:20:27
 * 
 */

public class Green implements Color {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.abstractFactoryPattern.dao.Color#fill()
	 */
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Inside Green::fill() method.");
	}

}
