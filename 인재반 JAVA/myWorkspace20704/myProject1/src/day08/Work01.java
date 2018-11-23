package day08;
/*
 * ��ü���� ���α׷���(OOP)
 * 1. Ŭ���� ==> ���赵
 * 	  - ����Ŭ����(���θ޼ҵ�O) ; ���α׷�
 * 	  - �Ϲ�Ŭ����(���θ޼ҵ�X) ; ��ü�� ���� ���赵
 * 
 * 	  ==> �������(==�ʵ�), �޼��� //�̰ſܿ��� Ŭ������ �ü� ����
 * 
 * 2. ��ü(==�ν��Ͻ�) ==> ��
 * 	  - ��ü ���� : new class��(); //��ü ���� ��, �ּҸ� �˷���
 * 	  - �޸��� ��(heap)������ ������ �ǰ�, �� ������ ���� ����X, �ݵ�� �ּҷθ� ����
 * 
 * 3. ���۷��� ����(==��������) ==> ������(���ּ� ����)
 * 	  - Ŭ������ ������; (Person p; ) //�� �ּҷ� ã�ư��� Person��ü�� �ν���!
 * 	  - �޸��� ����(steak)������ ������ �ȴ�
 */
class Person{
	//�������(�ʵ�)
	String name;//�̸�
	int age;//����
	boolean hasPhone;//�޴�������
	
	//�޼���
	//��ȯ�������� �޼����(�Ű���������){
	//      �޼��� ����
	//}
	void show(){
		System.out.println("�̸�: "+name+"\n����: "
						+age+"\n�ڵ��� ����: "+hasPhone);
	}
}//Person class

public class Work01 { //main class

	public static void main(String[] args) {
		Person p1=null; //���۷��� ������ ����, �ʱ�ȭ�� �ݵ�� null
		p1=new Person(); //��ü�� �����ؼ�, ��ü�� �ּҸ� p1�� ����

		System.out.println(p1);
		//Ŭ������@��ü�� �ؽ��ڵ�(16����)
		//�ؽ��ڵ�(hasecode): ��ü�� �ּҰ��� �̿��ؼ� ��ü�� ��ġ�� �˷��ִ� ��
		p1.show();
		//�ʱ�ȭ���� ���� ��������� �⺻��
		//��ġ��: 0, String: null, boolean: false
		Person p2 = new Person(); //���۷��������� ����� �ʱ�ȭ�� ���ÿ�
		//p1��p2��ü�� ��������� ���� �߰�
		p1.name="��ī��";
		p1.age=10;
		p1.hasPhone=true;
		p1.show();
		
		p2.name="����";
		p2.age=7;
		p2.hasPhone=false;
		p2.show();
	} //main method

} //Work01 class
