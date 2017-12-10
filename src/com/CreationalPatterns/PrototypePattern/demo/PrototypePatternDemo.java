package com.CreationalPatterns.PrototypePattern.demo;

import com.CreationalPatterns.PrototypePattern.impl.Shape;
import com.CreationalPatterns.PrototypePattern.vo.ShapeCache;

/**
 * @ClassName: PrototypePatternDemo
 * @Description: PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 * @author DELL
 * @date 2017年12月9日 下午2:09:32
 * 
 */

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape:" + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape:" + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape:" + clonedShape3.getType());
	}
}
