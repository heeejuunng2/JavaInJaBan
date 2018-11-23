package day12;

class Parent{
	String name="kildong";
	int age;
	
	void method(){
		System.out.println("parent");
	}
	
	void show1(){
		System.out.println(name);
	}
}

class Child extends Parent{
	String name="kilsoon";
	
	@Override
	void method() {
		super.method();
		System.out.println(this.name); //kilsoon
		System.out.println(super.name); //kildong
		this.show1();//==super.show1();
		this.show2();//!=super.show2();
	}
	void show2(){
		System.out.println(name);
	}
}

public class Work03 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.name); //kilsoon
		//System.out.println(this.name); //Work03�� ��ü�� ������
		//�̶��� this�� Work03�� ��ü�ּ��̴�
		//��ü ������ �ȵ����Ƿ�  �����߻�

	}

}
