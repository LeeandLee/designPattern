package com.CreationalPatterns.factoryPattern.Demo;

import com.CreationalPatterns.factoryPattern.biz.ShapeFactory;
import com.CreationalPatterns.factoryPattern.dao.Shape;

/**
 * @ClassName: FactoryPatternDemo
 * @Description: ʹ�øù�����ͨ������������Ϣ����ȡʵ����Ķ���
 * @author DELL
 * @date 2017��12��5�� ����3:07:22
 * 
 */

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

		// ��ȡ Circle �Ķ��󣬲��������� draw ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ Rectangle �Ķ��󣬲��������� draw ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ Square �Ķ��󣬲��������� draw ����
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();
	}

}
