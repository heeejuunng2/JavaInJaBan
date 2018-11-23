package day0917;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * �ټ��� ������(��ü)�� ������ �ΰ� �ʿ��Ҷ����� ������ ����ϴ� ���
 *  ==> ������ �迭�� ���������, ���� ������ ����
 *  ==> �ذ�å: �÷��� �����ӿ�ũ
 *  
 *  <Collection Framework>
 *  �÷���: ������ ������ ���� <=> �迭
 *  �����ӿ�ũ: ������� �̸� ���ص� ���̺귯��(���)
 *   ==> �뷮�� �����͸� ���� ���Ѿ��� ȿ�������� ó��
 *  <�÷��� ����> => java.util
 *  1. List �������̽�: �ε����� ����, �ߺ����� ����
 *  2. Set �������̽�: �ε���X, �ߺ�����X
 *  3. Map �������̽�: 
 */
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+" /"+age+"��";
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		List list = new ArrayList();
		ArrayList list1 = new ArrayList(10);
		
		//1. �����߰� : boolean add(Object element)
		list.add(1); //list.add(Integer(1));
		list.add("ABC");
		list.add(new Date()); //���� ��¥�� �ð� ��ü
		list.add('A'); //list.add(Character ('A'));
		Person p = new Person("��ī��", 10);
		list.add(p);
		System.out.println(list); //list.toString();
		
		//2. ���һ��� : void add(int index,Object element)
		//���ϴ� ��ġ�� ���� ����
		list.add(3, new Person("������",12));
		System.out.println(list);
		
		//3. ���Ұ��� : int size()
		System.out.println(list.size()+"��");
		
		//4. boolean isEmpty()
		System.out.println("isEmpty? "+list.isEmpty());
		
		//5. ���Ұ�������: Object get(int index)
		Object o = list.get(1);
		System.out.println(o);
		
		//6. ���� ���� : Object set(int index, Object newElement)
		Object o2 = list.set(2, "�޷ո޷�");
		System.out.println(list);
		
		//7. ���һ���: Object remove(int index)
		//           boolean remove(Object element) ���� ��������
		list.remove(2);
		System.out.println(list);
		list.remove((Integer)1); //=list.remove(0);
		System.out.println(list);
		System.out.println(list.remove("�ƹ����"));
		//"�ƹ����" ��� ������ �������� �����Ƿ� ���� ����
		
		//8. ���Ұ˻�: boolean contains(Object element)
		System.out.println(list.contains("ġŲ"));
		
		//9. �迭�� ����� : Object[] toArray() :Object�迭�� �������
		Object[] arr = list.toArray();
		System.out.println(arr[1]);
		
		//10. int indexOf(Object element) : ������ �ε��� ��ȯ
		System.out.println(list.indexOf(p));
		
		//11. clear() : ���� ��� ����
		list.clear();
		System.out.println(list);
		
	}//end of main method

}//end of mian class
