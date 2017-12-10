package com.CreationalPatterns.abstractFactoryPattern.demo;

import com.CreationalPatterns.abstractFactoryPattern.biz.FactoryProducer;
import com.CreationalPatterns.abstractFactoryPattern.dao.Color;
import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;
import com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory;

/**
 * @ClassName: AbstractFactoryPatternDemo
 * @Description: TODO
 * @author DELL
 * @date 2017��12��5�� ����3:31:10
 * 
 */

public class AbstractFactoryPatternDemo {

	/**
	 * @Title: main @Description: ʹ�� FactoryProducer ����ȡ
	 *         AbstractFactory��ͨ������������Ϣ����ȡʵ����Ķ��� @param @param args
	 *         �趨�ļ� @return void �������� @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// ��ȡ��״Ϊ Circle �Ķ���
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����
		shape1.draw();

		// ��ȡ��״Ϊ Rectangle �Ķ���
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ��״Ϊ Square �Ķ���
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();

		// ��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// ��ȡ��ɫΪ Red �Ķ���
		Color color1 = colorFactory.getColor("RED");

		// ���� Red �� fill ����
		color1.fill();

		// ��ȡ��ɫΪ Green �Ķ���
		Color color2 = colorFactory.getColor("Green");

		// ���� Green �� fill ����
		color2.fill();

		// ��ȡ��ɫΪ Blue �Ķ���
		Color color3 = colorFactory.getColor("BLUE");

		// ���� Blue �� fill ����
		color3.fill();
	}

}
