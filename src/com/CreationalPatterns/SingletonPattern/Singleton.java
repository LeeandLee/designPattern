package com.CreationalPatterns.SingletonPattern;

/**
 * @ClassName: Singleton_IsLazyNotSafe
 * @Description:
 * @author DELL
 * @date 2017��12��5�� ����4:31:30
 * 
 */

public class Singleton {

	private Singleton() {
	};

	// 1������ʽ���̲߳���ȫ
	// �Ƿ� Lazy��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ���
	// ���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м���synchronized�� �����ϸ��������������㵥��ģʽ��
	// ���ַ�ʽ lazy loading�����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
	// private static Singleton instance;
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }

	// 2������ʽ���̰߳�ȫ
	// �Ƿ� Lazy ��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ���
	// ���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
	// �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
	// ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
	// getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
	// private static Singleton instance;
	// public static synchronized Singleton getInstance(){
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }

	// 3������ʽ
	// �Ƿ� Lazy ��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ���
	// ���������ַ�ʽ�Ƚϳ��ã������ײ�����������
	// �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
	// ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
	// ������ classloder ���Ʊ����˶��̵߳�ͬ�����⣬������instance
	// ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������
	// ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����
	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

	// 4��˫����/˫��У������DCL���� double-checked locking��
	// JDK �汾��JDK1.5 ��
	// �Ƿ� Lazy ��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ��ϸ���
	// ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
	// getInstance() �����ܶ�Ӧ�ó���ܹؼ���
	// private volatile static Singleton singleton;
	//
	// public static Singleton getInstance() {
	// if (singleton == null) {
	// synchronized (Singleton.class) {
	// if (singleton == null) {
	// singleton = new Singleton();
	// }
	// }
	// }
	// return singleton;
	// }
	//
	// 5���Ǽ�ʽ/��̬�ڲ���
	// �Ƿ� Lazy ��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ�һ��
	// ���������ַ�ʽ�ܴﵽ˫������ʽһ���Ĺ�Ч����ʵ�ָ��򵥡��Ծ�̬��ʹ���ӳٳ�ʼ����Ӧʹ�����ַ�ʽ������˫������ʽ�����ַ�ʽֻ�����ھ�̬��������˫������ʽ����ʵ������Ҫ�ӳٳ�ʼ��ʱʹ�á�
	// ���ַ�ʽͬ�������� classloder ��������֤��ʼ�� instance ʱֻ��һ���̣߳������� 3 �ַ�ʽ��ͬ���ǣ��� 3 �ַ�ʽֻҪ
	// Singleton �౻װ���ˣ���ô instance �ͻᱻʵ������û�дﵽ lazy loading Ч�����������ַ�ʽ�� Singleton
	// �౻װ���ˣ�instance ��һ������ʼ������Ϊ SingletonHolder ��û�б�����ʹ�ã�ֻ����ʾͨ������ getInstance
	// ����ʱ���Ż���ʾװ�� SingletonHolder �࣬�Ӷ�ʵ���� instance������һ�£����ʵ���� instance
	// ��������Դ�������������ӳټ��أ�����һ���棬�ֲ�ϣ���� Singleton �����ʱ��ʵ��������Ϊ����ȷ�� Singleton
	// �໹�����������ĵط�������ʹ�ôӶ������أ���ô���ʱ��ʵ���� instance ��Ȼ�ǲ����ʵġ����ʱ�����ַ�ʽ��ȵ� 3 �ַ�ʽ���Եúܺ���
	// private static class SingletonHolder {
	// private static final Singleton INSTANCE = new Singleton();
	// }
	//
	// public static final Singleton getInstance() {
	// return SingletonHolder.INSTANCE;
	// }

	// 6��ö��
	// JDK �汾��JDK1.5 ��
	// �Ƿ� Lazy ��ʼ������
	// �Ƿ���̰߳�ȫ����
	// ʵ���Ѷȣ���
	// ����������ʵ�ַ�ʽ��û�б��㷺���ã�������ʵ�ֵ���ģʽ����ѷ�����������࣬�Զ�֧�����л����ƣ����Է�ֹ���ʵ������
	// ���ַ�ʽ�� Effective Java ���� Josh Bloch
	// �ᳫ�ķ�ʽ���������ܱ�����߳�ͬ�����⣬���һ��Զ�֧�����л����ƣ���ֹ�����л����´����µĶ��󣬾��Է�ֹ���ʵ���������������� JDK1.5
	// ֮��ż��� enum ���ԣ������ַ�ʽд�������˸о����裬��ʵ�ʹ����У�Ҳ�����á�
	// ����ͨ�� reflection attack ������˽�й��췽����
	// public enum Singleton {
	// INSTANCE;
	// public void whateverMethod() {
	// }
	// }

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
