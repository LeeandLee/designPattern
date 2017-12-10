package com.CreationalPatterns.builderPattern.impl;

import com.CreationalPatterns.builderPattern.dao.Item;
import com.CreationalPatterns.builderPattern.dao.Packing;

/**
 * @ClassName: Burger
 * @Description: TODO
 * @author DELL
 * @date 2017��12��5�� ����5:40:59
 * 
 */

public abstract class Burger implements Item {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.builderPattern.dao.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.builderPattern.dao.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.builderPattern.dao.Item#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
