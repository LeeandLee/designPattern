package com.CreationalPatterns.SingletonPattern;

/**
 * @ClassName: SinglePatternDemo
 * @Description: 从 singleton 类获取唯一的对象。
 * @author DELL
 * @date 2017年12月5日 下午3:45:31
 * 
 */

public class SinglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		// SingleObject object = SingleObject.getInstance();
		//
		// 显示消息
		// object.showMessage();

		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}

}
