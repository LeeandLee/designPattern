package com.CreationalPatterns.PrototypePattern.impl;

/**
 * @ClassName: Shape
 * @Description: TODO
 * @author DELL
 * @date 2017年12月9日 上午11:44:28
 * 
 */

public abstract class Shape implements Cloneable {
	private String id;
	protected String type;

	abstract void draw();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}
}
