package day10;

class Person{
	String name;
	String address;
	String tel;
	int age;
	
	Person(){
		
	}
	
	Person(String name,String address,String tel){
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	
	Person(String name,String address,String tel,int age){
		this(name,address,tel);
		//this() : �ڽ��� �����ڸ� ȣ��
		this.age=age;
	}
	//������ ����
	//��ȯ���� X
	//���� ���� �����ڰ� �ִٸ� �⺻������ �ȸ������
	//���� ���� �����ڰ� ���ٸ� �⺻������ JVM�� �������
}
public class Work03 {//main class

	public static void main(String[] args) {
		Person p=new Person(); //Person() : ������, �ʱ�ȭ ���
// 		p.name="pika";
//		p.address="ansan";
//		p.age=10;
//		p.tel="010-2222-9999";

	}//main method

}//Work03 class
