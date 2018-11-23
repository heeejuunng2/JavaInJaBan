package day1010.generic;

import day1010.Fruit;

/*
 * <���׸�(generic)> : jdk1.5
 * - Ŭ����, �������̽�, �޼��带 �����Ҷ� ���
 * �̸��ڿ� <>���̰�, <>���̿� Ÿ�Ժ����� ���
 * (T(Type), List�÷���<E>, Map<K,V>)
 * - ������ Ÿ���� ����Ÿ��O, �����ڷ���X
 *   <int> X, <Integer> O , <Person> O
 *   ** ���׸� ����� ����
 *      1) ����ȯ�� ��� �ڵ尡 ����
 *      2) ����ȯ�� ��� ���α׷� ������ ���
 *      3) �������Ҷ� Ÿ���� �����ϱ� ������ ������ �̸� ����
 *   ** ���׸��� �Ѱ�
 *      - static ������� Ÿ�Ժ��� ��� X
 */

//day1010�� BoxŬ������ ���׸� Ŭ������ �����غ���
class Box<T>{
	private T object; //��� ������ ��ü�� ������ �ִ�
	//static T num; ���׸��� static�� ���ϼ� ����

	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
	
}//end of Box class

public class BoxEx01 {//main calss

	public static void main(String[] args) {
		Box<String> boxs = new Box<String>();
		boxs.setObject("�ǰ���");
		//boxs.setObject(new Fruit("�ٳ���")); ����
		
		Box<Fruit> boxf = new Box<>(); //jdk1.7���� ������ ������
		boxf.setObject(new Fruit("������"));
		
		//"�ڽ��� ����: ������" ���
		System.out.println("�ڽ��� ����:"+boxf.getObject().name);
		
	}//end of main method

}//end of main class
