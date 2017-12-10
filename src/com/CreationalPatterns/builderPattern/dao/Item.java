package com.CreationalPatterns.builderPattern.dao;

/**
 * @ClassName: Item
 * @Description: TODO
 * @author DELL
 * @date 2017年12月5日 下午5:38:03
 * 
 */

public interface Item {
	public String name();

	public Packing packing();

	public float price();

}
