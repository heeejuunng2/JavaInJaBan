package day18;

public interface RemoteControl {
	//���
	int MAX_VOLUME=10; //�տ� public static final ������ �ڹ� �����Ϸ��� ����
	int MIN_VOLUME=0;
	//�߻� �޼ҵ�
	void turnOn(); //public abstract ����
	void turnOff();
	void setVolume(int volume);
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó��");
		}else{
			System.out.println("���� ����");
		}
	}
	//Ŭ���� �޼ҵ�
	static void changeBattery(){
		System.out.println("������ ��ü��");
	}
}
