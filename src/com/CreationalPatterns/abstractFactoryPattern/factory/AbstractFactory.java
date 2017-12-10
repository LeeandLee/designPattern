package com.CreationalPatterns.abstractFactoryPattern.factory;

import com.CreationalPatterns.abstractFactoryPattern.dao.Color;
import com.CreationalPatterns.abstractFactoryPattern.dao.Shape;

/**
 * @ClassName: AbstractFactory
 * @Description: 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @author DELL
 * @date 2017年12月5日 下午3:22:27
 * 
 */

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);

}
