package com.CreationalPatterns.abstractFactoryPattern.biz;

import com.CreationalPatterns.abstractFactoryPattern.factory.AbstractFactory;
import com.CreationalPatterns.abstractFactoryPattern.factory.ColorFactory;
import com.CreationalPatterns.abstractFactoryPattern.factory.ShapeFactory;

/**
 * @ClassName: FactoryProducer
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @author DELL
 * @date 2017年12月5日 下午3:28:12
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
