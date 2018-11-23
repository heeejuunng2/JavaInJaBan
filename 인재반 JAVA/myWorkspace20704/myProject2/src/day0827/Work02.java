package day0827;
/*
 * 1. Animal Ŭ���� : �θ�Ŭ����
 *    1)�ʵ�: body(String)
 *    2)toString �������̵�
 *        : "����" return
 *    
 * 2. Birds Ŭ���� : �ڽ�Ŭ����
 *    1)�ʵ�: wing(String)
 *    2)toString �������̵�
 *        : "����" return
 */
class Animal{
	String body="��";
	
	void move() {
		System.out.println("�����̴�");
	}
	
	void animal() {
		System.out.println("only animal's method");
	}
	
	static void info() {//��� �Ұ���
		System.out.println("Animal's static mehtod");
	}
	
	@Override
	public String toString() {
		return "����";
	}
}
class Birds extends Animal{
	String wing="����";
	
	@Override
	void move() { //��ӹ��� �޼ҵ�
		System.out.println("����");
	}
	
	void birds() {
		System.out.println("only birds' method");
	}
	
	static void info() {//�θ��� info �޼���� ������
		System.out.println("Birds' static mehtod");
	}
	
	@Override
	public String toString() {
		return "����";
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		Animal animal = new Animal();
		animal.animal();
		animal.move();
		Animal.info();
		System.out.println(animal.body);
		System.out.println("*******************");
		//�������� instanceof Ŭ������
		//���������� ������ ����Ű�� ��üŸ���� �˷��ִ� ������
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Birds);
		System.out.println("*******************");
		
		animal = new Birds(); 
		//Ÿ���� animal�� ���� Birds���� ���� �Ұ���
		//��ӵȰ� ���� ����
		animal.move();
		System.out.println(animal.body);
		Birds.info();
		
		//animal���������� birds()�޼ҵ� ����
		((Birds)animal).birds();
		//animal���������� wing�ʵ� ����
		System.out.println(((Birds)animal).wing);
		System.out.println("*******************");
		System.out.println(animal instanceof Animal); //true
		System.out.println(animal instanceof Birds); //true
		System.out.println("*******************");
		
		Object[] objects= {new Animal(), new Birds()};
		
		for(Object o:objects) {
			System.out.println(o);
			//o.move(); ObjectŬ������ move()�� ��� �ȵ�
			
		}
		
		Animal[] animals = {new Animal(),new Birds()};
		for(Animal a:animals) {
			System.out.println(a);
			a.move();
		}
	}//end of main method

}//end of Work02 class
