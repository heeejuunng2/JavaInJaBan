package day0903;
/*
 * �߻�Ŭ������ ��ü ���� X ����Ŭ������ ��ӹ޾ƾ����� ��ü���� ����
      1)�߻�Ŭ������ ���� �� �ִ°� :
      �ʵ�, ������, (static�Ⱥ�����)�ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ�, "�߻�޼ҵ�"
      �������̽��� �߻�Ŭ�������� �� �߻�����
      2)�������̽��� ���� �� �ִ°�:
      ��� ,Ŭ���� �޼ҵ�(�������̵�X),�߻�޼ҵ�(�������̵�O)
		,����Ʈ�޼ҵ�(�������̵� �ص��ǰ� ���ص���)
	-> �ΰ��� �θ�� ��� ���� ����, �ΰ��� �������̽� ������ ������ 
	    �ϳ��� Ŭ������ ����,��� ���ÿ� ����, �������̽��� ���߻�� ����
 */
/*
 * �߻�ȭ(Ŭ�������� �������� ã�� �θ� ����� �۾�)
 *   <-> ��üȭ(������� �ڽ�Ŭ���� ����)
 *   
 *   �θ� ����� : Ŭ����,�߻�Ŭ����,�������̽�
 */
interface Vehicle{ //������ ��� ����ֵ� ��ü��������� �ȵ�
	//->�߻�Ŭ����or�������̽��� �� ��
	//�ʵ�(����) �����Ƿ� �������̽�
	void move(); //public abstract ����, �߻�޼ҵ�� �ٵ� ����, �ݵ�� �������̵� �ؾ���
					//���������� ������ Ư¡
		
	default void stop() {
		System.out.println("���ߴ�");
	}
	static void info() {
		System.out.println("Ż���Դϴ�");
	}
	
}
abstract class Car implements Vehicle{ //������ ��� ����ֵ� ��ü��������� �ȵ�
	int speed;
	String color;
	
	abstract void parking();//�ڵ����� ������ �ִ� Ư¡
	
	//-> �߻�޼��带 �������̵� ���� �ʰ� ���� Ŭ������ �̷� �� ����
}
class Truck extends Car{
	double ton;
	
	@Override
	public void move() {
		System.out.println("Ʈ���� �����δ�");
	}
	
	@Override
	void parking() {
		System.out.println("Ʈ���� ������");
	}
	
	void load() {
		System.out.println("���� �ƴ�");
	}
	void unload() {
		System.out.println("���� ������");
	}
}

public class Work01 {//main class

	public static void main(String[] args) {
		//�������̽� or �߻�Ŭ���� = ����Ŭ���� or �ڽ�Ŭ������ ��ü
		Vehicle h = new Truck();
		h.move(); //�������̵� �� ���� ���
		h.stop(); 
		//load()�޼ҵ� ����
		((Truck)h).load();
		//parking()�޼ҵ� ����
		((Car)h).parking();
		//info()�޼ҵ� ����
		Vehicle.info();
		
	}//end of main method

}//end of Work01 class
