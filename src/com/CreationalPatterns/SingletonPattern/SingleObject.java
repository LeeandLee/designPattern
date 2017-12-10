package com.CreationalPatterns.SingletonPattern;

/**
 * @ClassName: SingleObject
 * @Description: ����һ�� Singleton �ࡣ
 * @author DELL
 * @date 2017��12��5�� ����3:43:06
 * 
 */

public class SingleObject {
	// ���� SingleObject ��һ������
	private static SingleObject instance = new SingleObject();

	// �ù��캯��Ϊ private����������Ͳ��ᱻʵ����
	private SingleObject() {
	}

	// ��ȡΨһ���õĶ���
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
