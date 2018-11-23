package day1024;

import java.util.TreeSet;

/*
 * int compareTo(T other)
 * : this�� other���� �տ� �ΰ� ������ ���� ��ȯ
 *   this�� other���� �ڿ� �ΰ� ������ ��� ��ȯ
 *   this�� other�� ������ 0��ȯ
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"/"+age+"��";
	}
	
	//���̼����� �������� ����
	//���̰� �������, �̸���
	@Override
	public int compareTo(Person o) {
		if(age==o.age) {
			return name.compareTo(o.name);
			//return o.name.compareTo(name); ->�̸� ��������
			//String�� compareTo()�̿�
		}
		return age-o.age;
	}
}
public class Test03 {//main class
	//Integer, Double, String�� ��� Comparable�������̽���
	//compareTo()�޼ҵ� �������̵�
	
	public static void main(String[] args) {
		Integer i1=45, i2=25, i3=25;
		
		System.out.println(i1.compareTo(i2)); //i1>i2 => 1(���)
		System.out.println(i2.compareTo(i1)); //i2<i1 => -1(����)
		System.out.println(i2.compareTo(i3)); //i2=i3 => 0
		//���ؼ� ���� �� ũ�� �ڷ�, ������ ������, ������ ��������(����)
		//-> �������� ����
		
		//����� ������ �ڷ�, ������ ������ ������, 0�� ������
		
		TreeSet<Person> ts = new TreeSet<>();
		
		ts.add(new Person("ȫ�ڹ�",45));
		ts.add(new Person("���ڹ�",25));
		ts.add(new Person("���ڹ�",30));
		ts.add(new Person("���ڹ�",30));
		
		System.out.println(ts); //���ı��ؾ����� ������
		
	}//end of main method
	
}//end of main class
