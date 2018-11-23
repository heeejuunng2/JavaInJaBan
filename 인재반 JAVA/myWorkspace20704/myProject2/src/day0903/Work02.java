package day0903;
/*
 * <Quiz>
 * ���� S���� ��ǰ���ߺ� �������̴�.
 * 1. ��� ������ǰ�� ���ԵǾ�� �ϴ� ���� �κ�(Controllable)�� �ʿ�
 *   1)��� ������ǰ���� ������ �¿���(turnOn, turnOff)�ϴ� ����� ������,
 *     ����Ʈ(light) �� �ʱ�ȭ(reset)����� �� �� �ִ�.
 *   2)����Ʈ �� �ʱ�ȭ ����� �̸� ������ ���Ƽ� �ʿ��� �� ����� �� �־�� �Ѵ�.
 *   3)����Ʈ ����� �ڽ�Ŭ�������� �������̵� �� �� �ִ�.
 *   
 * 2. ���� ���� �κ�(RemoteControllable)�� ����κ� �ܿ� ���� ����� �߰��� �ʿ��ϴ�
 *    1)�������� ������ �¿���(remoteOn,remoteOff)�ϴ� ���
 */
interface Controllable{
	void turnOn();
	
	void turnOff();
	
	default void light() { //�������̵� O
		System.out.println("���� ���´�");
	}
	
	static void reset() {//�������̵� X
		System.out.println("�ʱ�ȭ");
	}
}
interface Potable{ //��� ���� �׷����� ���� ���� �����ص� ����
	void inMyBag();
}
interface RemoteControllable extends Controllable{
	void remoteOn();
	
	void remoteOff();
	
}
class Computer implements Controllable{
	@Override
	public void turnOn() {
		System.out.println("��ǻ�� ���� ON");
	}
	@Override
	public void turnOff() {
		System.out.println("��ǻ�� ���� OFF");
	}
	@Override
	public void light() {
		System.out.println("�Ķ��� ���� ��¦�δ�");
	}
}
class Dryer implements Controllable, Potable{
	@Override
	public void turnOn() {
		System.out.println("����̱� ���� Ŵ");
	}
	@Override
	public void turnOff() {
		System.out.println("����̱� ���� ��");
	}
	void dry() {
		System.out.println("�Ӹ��� ������ ������");
	}
	@Override
	public void inMyBag() {
		System.out.println("�޴� ����");
	}
}
class Tv implements RemoteControllable{
	@Override
	public void turnOn() {
		System.out.println("TV����Ŵ");
	}
	@Override
	public void turnOff() {
		System.out.println("TVzxxxx������");
	}
	@Override
	public void remoteOn() {
		System.out.println("TV�������� Ŵ");
	}
	@Override
	public void remoteOff() {
		System.out.println("TV�������� ��");
	}
	void changeChannel() {
		System.out.println("Ƽ�� ä�� ����");
	}
}
class Notebook extends Computer implements Potable{
	@Override
	public void turnOn() {
		System.out.println("��Ʈ�� ���� ON");
	}
	@Override
	public void turnOff() {
		System.out.println("��Ʈ�� ���� OFF");
	}
	void search() {
		System.out.println("��Ʈ������ �˻�");
	}
	@Override
	public void inMyBag() {
		System.out.println("�޴� ����");
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Controllable[] c = {new Tv(), new Computer(), new Notebook(),
							new Dryer()};
		//Ȯ�� for�� �̿��Ͽ� �޴밡���� ������ǰ�� inMyBagȣ��,
		//�׷��� ������ turnOn()�޼ҵ� ȣ��
		for(Controllable control:c) {
			if(control instanceof Potable) {
				((Potable) control).inMyBag();
			}else {
				control.turnOn();
			}
		}
		
	}//end of main method

}//end of Work02 class
