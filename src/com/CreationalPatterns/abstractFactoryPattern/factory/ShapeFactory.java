package com.CreationalPatterns.abstractFactoryPattern.factory;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;
import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;
import com.CreationalPatterns.abstractFactoryPattern.impl.ShapeImpl.Circle;
import com.CreationalPatterns.abstractFactoryPattern.impl.ShapeImpl.Rectangle;
import com.CreationalPatterns.abstractFactoryPattern.impl.ShapeImpl.Square;

/**
 * @ClassName: ShapeFactory
 * @Description: 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * @author DELL
 * @date 2017年12月5日 下午3:24:26
 * 
 */

public class ShapeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory#
	 * getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
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
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
