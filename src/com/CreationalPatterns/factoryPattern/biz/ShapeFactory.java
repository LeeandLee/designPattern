package com.CreationalPatterns.factoryPattern.biz;

import com.CreationalPatterns.factoryPattern.dao.Shape;
import com.CreationalPatterns.factoryPattern.impl.Circle;
import com.CreationalPatterns.factoryPattern.impl.Rectangle;
import com.CreationalPatterns.factoryPattern.impl.Square;

/**
 * @ClassName: ShapeFactory
 * @Description: ����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
 * @author DELL
 * @date 2017��12��5�� ����3:02:54
 * 
 */

public class ShapeFactory {
	// ʹ��getShape������ȡ��״���͵Ķ���
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
