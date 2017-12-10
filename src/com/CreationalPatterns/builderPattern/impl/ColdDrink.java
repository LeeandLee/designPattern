package com.CreationalPatterns.builderPattern.impl;

import com.CreationalPatterns.builderPattern.dao.Item;
import com.CreationalPatterns.builderPattern.dao.Packing;

/** 
* @ClassName: ColdDrink 
* @Description: TODO
* @author  DELL  
* @date 2017年12月9日 上午11:06:14 
*  
*/

public abstract class ColdDrink implements Item {

	/* (non-Javadoc)
	 * @see com.CreationalPatterns.builderPattern.dao.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.CreationalPatterns.builderPattern.dao.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/* (non-Javadoc)
	 * @see com.CreationalPatterns.builderPattern.dao.Item#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
