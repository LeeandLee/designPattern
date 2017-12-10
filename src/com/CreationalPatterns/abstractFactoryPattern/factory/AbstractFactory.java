package com.CreationalPatterns.abstractFactoryPattern.factory;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;
import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;

/**
 * @ClassName: AbstractFactory
 * @Description: Ϊ Color �� Shape ���󴴽�����������ȡ������
 * @author DELL
 * @date 2017��12��5�� ����3:22:27
 * 
 */

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);

}
