package com.CreationalPatterns.builderPattern.impl;

import com.CreationalPatterns.builderPattern.dao.Packing;

/**
 * @ClassName: Bottle
 * @Description: TODO
 * @author DELL
 * @date 2017��12��5�� ����5:39:56
 * 
 */

public class Bottle implements Packing {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.CreationalPatterns.builderPattern.dao.Packing#pack()
	 */
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Bottle";
	}

}
