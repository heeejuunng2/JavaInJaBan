package day12;
/*
 * �ڽĻ����� ȣ��(��ü ����)=>�θ������ ȣ��=>
 * �θ�ü ����=>�ڽ��� ������� ����
 */
class Student extends Person{
	//Work01 Ŭ������ Person class ��ӹ��� 
	String hakbun;
	
	Student(){
		super("�����",19,"01000000000"); //�θ������ ������
		//"�����",19,"01000000000"�̰� ���� �Ű������ִ� ������ ��������
		//"�����",19,"01000000000"�ȵ��� �⺻������ ������
	}
}

public class Work04 {//main class

	public static void main(String[] args) {
		Student s=new Student(); 
		//�θ������ ȣ���, 
		//�׷��� Person�� ���ô��� �⺻�����ڰ� ���� ���� �⺻������ ����������
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.phone);
		System.out.println(s.hakbun);
	}//main method

}//Work04 class
