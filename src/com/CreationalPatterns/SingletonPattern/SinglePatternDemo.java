package com.CreationalPatterns.SingletonPattern;

/**
 * @ClassName: SinglePatternDemo
 * @Description: �� singleton ���ȡΨһ�Ķ���
 * @author DELL
 * @date 2017��12��5�� ����3:45:31
 * 
 */

public class SinglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ϸ��Ĺ��캯��
		// ����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
		// SingleObject object = new SingleObject();

		// ��ȡΨһ���õĶ���
		// SingleObject object = SingleObject.getInstance();
		//
		// ��ʾ��Ϣ
		// object.showMessage();

		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}

}
