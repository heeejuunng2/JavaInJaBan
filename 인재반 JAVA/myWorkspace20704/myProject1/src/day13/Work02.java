package day13;
/*
 * <�������� �Ѱ���>
 * :�θ�κ��� �������� �ʵ�,�޼ҵ�(�������̵�����)�� ����� �� �ִ�
 *  (�ڽ��� ���� ������ ����� ���X)
 *  
 * <��ĳ��Ʈ�� �ٿ�ĳ��Ʈ>
 * 1. ��ĳ��Ʈ :�ڽ�Ÿ���� �θ�Ÿ������ �ٲ�(�ڵ�����ȯ)
 * 2. �ٿ�ĳ��Ʈ :�θ�Ÿ���� �ڽ�Ÿ������ �ٲ�(��������ȯ)
 */
class Car{
	String color;
	int door;
	void drive(){
		System.out.println("drive!!");
	}
	void stop(){
		System.out.println("stop!!");
	}
	public void siren() {
		// TODO Auto-generated method stub
		
	}
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}
class Ambulance extends Car{
	String siren;
	
	public void sound(){
		System.out.println("Siren!!");
	}
	@Override
	void drive() {
		System.out.println("Ambulance drive");
	}
	@Override
	void stop() {
		System.out.println("Ambulance stop");
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Car car=new Ambulance();
		Ambulance amb=new Ambulance();
		//Quiz>
		//car���������� Ambulance��ü�� ���� siren�� ���!!
		System.out.println(((Ambulance)car).siren);
		((Ambulance)car).sound();
		//���� ��ü������ ���������� Ÿ�Կ� ���� ������ �� �ִ�
		//�ʵ�� �޼��尡 �޶�����
		//car.siren;
		//car.sound;
		
		//�θ��� �޼��带 �������̵� �� ���, �θ�Ÿ���� ����������
		//���� �ϴ��� �������̵� �� ������ ����ȴ�
		car.drive();
		car.stop();
		
		Car car2=null;
		Ambulance amb2=new Ambulance();
		
		car2=amb2; //��ĳ��Ʈ(�θ�<-�ڽ�)
		amb2=(Ambulance)car2; //�ٿ�ĳ��Ʈ(�ڽ�<-�θ�)
	}//main method

}//Work02 class
