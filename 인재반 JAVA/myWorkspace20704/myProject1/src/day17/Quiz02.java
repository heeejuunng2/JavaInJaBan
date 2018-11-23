package day17;
/*
 * Hardware �߻� Ŭ���� �����
 * 1. run() �߻�޼ҵ� ����
 * 2. connect() �߻�޼ҵ� ����
 * 
 * Hardware�� ���� Ŭ����
 * 1. Mouse
 *    :connect() �� �� "���콺 �����!" sysout
 *    :run() �� �� "���콺 �����Ͱ� �����δ�!" sysout
 * 2. Keyboard
 *    :connect() �� �� "���� Ű���� ĥ �� �ֽ��ϴ�!" sysout
 *    :run() �� �� "Ÿ���� �� .." sysout
 */
abstract class Hardware{
	abstract void run();
	abstract void connect(); 
}

class Mouse extends Hardware{
	@Override
	void connect() {
		System.out.println("���콺 �����!");
	}
	@Override
	void run() {
		System.out.println("���콺 �����Ͱ� �����δ�!");
	}
}

class Keyboard extends Hardware{
	@Override
	void connect() {
		System.out.println("���� Ű���� ĥ �� �ֽ��ϴ�!");
	}
	@Override
	void run() {
		System.out.println("Ÿ���� �� ..");
	}
}

public class Quiz02 {//main class

	public static void main(String[] args) {
		//��ü �迭 ���弼��
		//�迭���ҷ� Mouse�� Keyboard ��ü�� ��������
		Hardware[] hard = new Hardware[] {new Mouse(), new Keyboard()};
		//Ȯ�� for�� �̿��Ͽ� run()�� connect()ȣ���غ�����
		for(Hardware h:hard){
			h.connect();
			h.run();
		}
		//Hardware Ŭ������ ��ü�� �����غ�����
		//�׷��� run()�� ȣ���غ�����
		Hardware h1=new Hardware(){
			@Override
			void connect() {	};
			@Override
			void run() {	};
		};
		h1.run();
		
	}//main method

}//Quiz02 class
