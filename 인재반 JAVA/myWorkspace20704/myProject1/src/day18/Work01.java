package day18;
/*
 * <�������̽�(interface)> 
 *  :�ر׸��� �׷��� �ִ� �⺻���赵 (�߻�Ŭ�������� �� �߻�����)
 * ������
 *  :�޼ҵ��� �̸��� �����ϱ� ���ؼ� (����Ŭ�������� �ϳ��� �׷����� ����)
 *  
 *  (public/default) interface �̸�{
 *  	   //public static final Ÿ�� �����=��;
 *  	   //public abstract Ÿ�� �޼ҵ�(); //�߻�޼ҵ�
 *  	   //public default Ÿ�� �޼ҵ�(){} //����Ʈ �޼ҵ�
 *  	   //public static Ÿ�� �޼ҵ�(){}
 *  }
 *  class D implements A{}
 *  interface B extends E,F{} //�������̽��� �ٸ� �������̽� ��ӹޱ� ����
 *  						  //�������̽����� ���߻��O
 *  						  //Ŭ���������� ���߻�� �ȵ�
 *  class C implements E,F{}  //Ŭ������ ���߱���O
 */
class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("����� Ŵ");
	}
	@Override
	public void turnOff() {
		System.out.println("����� ��");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� ����� ����:"+volume);
	}
} //Audio class

public class Work01 {//main class

	public static void main(String[] args) {
		RemoteControl r=new Audio();
		//�������̽� ���������� ����Ŭ������ ��ü�� �´�(������)
		//RemoteControl[] r2={new Audio()};
		r.turnOn();
		r.setVolume(5);
		r.setMute(false); //����Ʈ �޼ҵ� ȣ��
		RemoteControl.changeBattery();

	}//main method

}//Work01 class
