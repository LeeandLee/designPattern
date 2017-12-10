package com.CreationalPatterns.abstractFactoryPattern.factory;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;
import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;
import com.CreationalPatterns.abstractFactoryPattern.impl.colorImpl.Blue;
import com.CreationalPatterns.abstractFactoryPattern.impl.colorImpl.Green;
import com.CreationalPatterns.abstractFactoryPattern.impl.colorImpl.Red;

/**
 * @ClassName: ColorFactory
 * @Description: TODO
 * @author DELL
 * @date 2017年12月5日 下午3:26:27
 * 
 */

public class ColorFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory#
	 * getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory#
	 * getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
