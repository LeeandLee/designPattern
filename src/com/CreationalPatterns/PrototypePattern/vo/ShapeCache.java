package com.CreationalPatterns.PrototypePattern.vo;

import java.util.Hashtable;

import com.CreationalPatterns.PrototypePattern.impl.Circle;
import com.CreationalPatterns.PrototypePattern.impl.Rectangle;
import com.CreationalPatterns.PrototypePattern.impl.Shape;
import com.CreationalPatterns.PrototypePattern.impl.Square;

/**
 * @ClassName: ShapeCache
 * @Description: ����һ���࣬�����ݿ��ȡʵ���࣬�������Ǵ洢��һ�� Hashtable �С�
 * @author DELL
 * @date 2017��12��9�� ����2:01:47
 * 
 */

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// ��ÿ����״���������ݿ��ѯ������������״
	// shapeMap.put(shapeKey,shape);
	// ���磬����Ҫ���������״
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}

}
