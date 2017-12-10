package com.CreationalPatterns.factoryPattern.biz;

import com.CreationalPatterns.factoryPattern.dao.Shape;
import com.CreationalPatterns.factoryPattern.impl.Circle;
import com.CreationalPatterns.factoryPattern.impl.Rectangle;
import com.CreationalPatterns.factoryPattern.impl.Square;

/**
 * @ClassName: ShapeFactory
 * @Description: 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author DELL
 * @date 2017年12月5日 下午3:02:54
 * 
 */

public class ShapeFactory {
	// 使用getShape方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
