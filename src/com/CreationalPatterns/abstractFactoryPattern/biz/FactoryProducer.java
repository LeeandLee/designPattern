package com.CreationalPatterns.abstractFactoryPattern.biz;

import com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory;
import com.CreationalPatterns.abstractFactoryPattern.factory.ColorFactory;
import com.CreationalPatterns.abstractFactoryPattern.factory.ShapeFactory;

/**
 * @ClassName: FactoryProducer
 * @Description: ����һ������������/�������࣬ͨ��������״����ɫ��Ϣ����ȡ������
 * @author DELL
 * @date 2017��12��5�� ����3:28:12
 * 
 */

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}

}
