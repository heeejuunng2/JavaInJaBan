package day0827;
/*
 * ����� ����: 1. Ŭ���� ���� 2. ������
 * ������ : �θ�Ÿ�� ������������ �ڽ� ��ü�� �� �� �ִ�.
 * Pokemon p = new Pikachu();
 * (Pikachu)p ->�ٿ� ĳ��Ʈ(�θ� �ڽ�����)
 * ��� Ŭ������ ����: Object class
 * �������̵�(�������̵�): �θ��� �޼��带 ���� �����ϴ� ��
 * �����ε�(�����ε�): ���ο� �޼��带 ����°�  
 */
class Person{
	String name;
	int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() { //Ŭ������ �����ϴ� ��
		return "�̸�: "+name+" /����: "+age;
	}
}

class Student extends Person{
	int hakbun;
	
	Student(){
		
	}
	Student(String name, int age, int hakbun){
		super(name, age);
		this.hakbun=hakbun;
	}
	
	@Override
	public String toString() {
		return super.toString()+" /�й�: "+hakbun;
	}
}

class FrStudent extends Student{ //�ܱ��� �л�
	String nation; //����
	
	FrStudent(){
		super(); //�θ��� ������ ȣ��
	}
	FrStudent(String name, int age, int hakbun,String nation){
		//��� ���� �ʵ�� �θ��� �����ڷ� �ʱ�ȭ�Ѵ�
		super(name, age, hakbun);
		this.nation=nation;
	}
	@Override
		public String toString() {
			return super.toString()+" / ����: "+nation;
		}
}



public class Work01 {//main class

	public static void main(String[] args) {
		Person p= new Person();
		System.out.println(p.toString());
		System.out.println(p);
		
		FrStudent f = new FrStudent("Ǫ��",10,20100,"�̱�");
		System.out.println(f.toString());
		
		Person[] parr= {new Person("������",8),
				     new Student("�Ḹ��",15,20200),
				     new FrStudent("Ǫ��",1,20100,"�Ϻ�")};
		//for()(�迭����Ÿ���� �ӽú��� ����: �迭��)
		for(Person p2:parr) {
			System.out.println(p2.toString());
		}
		
		Object[] object= {new Person("������",8),
			     new Student("�Ḹ��",15,20200),
			     new FrStudent("Ǫ��",1,20100,"�Ϻ�")};
		for(Object o:object) {
			System.out.println(o.toString());
		}
		
	}//end of main method

}//end of Work01(main) class
