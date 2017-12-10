package com.CreationalPatterns.abstractFactoryPattern.impl.ShapeImpl;

import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;

/** 
* @ClassName: Rectangle 
* @Description: TODO
* @author  DELL  
* @date 2017��12��5�� ����2:58:40 
*  
*/

public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see com.CreationalPatterns.factoryPattern.dao.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}

}
