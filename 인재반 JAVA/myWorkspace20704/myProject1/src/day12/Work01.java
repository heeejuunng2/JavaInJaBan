package day12;
/*
 * <���(inheritance)>
 * - extends
 * - ����Ŭ������ 'Ȯ��' �Ͽ� �� Ŭ������ ����°�
 *   (���� Ŭ���� ��Ȱ��+ ���� �߰��ϰ� ���� ���)
 *   ==> �ʵ�(�������) & �޼ҵ尡 ���(�����ڴ� ���X)
 * -����� ����
 *  -Ŭ������ �ۼ��Ⱓ�� �پ��
 *  -������ Ȯ�强
 * ex) ���Ŭ����==>�л� Ŭ����==>����л� Ŭ����==>���л� Ŭ����
 * 
 * Person class: �̸� ���� ����ó
 * Employee class: �̸� ���� ����ó �μ� ����
 * Customer class: �̸� ���� ����ó ����Ʈ �̸���
 * 
 * -�θ�Ŭ����=����Ŭ����=����Ŭ����=����Ŭ����
 * -�ڽ�Ŭ����=����Ŭ����=����Ŭ����=Ȯ��Ŭ����
 * <�������̵�> : �θ�Ŭ������ �޼ҵ� "����"�� �ڼ�����!!!
 * 			   <����Ÿ�� ����X,�Ű������߰�X,����X>
 * <�����ε�> : �޼ҵ带 ���� �ڻ�����(�޼ҵ��̸� �Ȱ���, �Ű����� �ٸ���)
 */
class Person{
	String name;
	int age;
	String phone;
	
	Person(){
		
	}
	Person(String name,int age,String phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
	
	String showInfo(){
		return "�̸�: "+name+"\n����: "+age+"\n����ó: "+phone;
	}
}//Person class

class Employee extends Person{
	String department;
	int salary;
	
	@Override
	String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n�μ�: "+department+"\n����: "+salary;
	}
}//Employee class

class Customer extends Person{
	int point;
	String email;
	
	@Override
	String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n����Ʈ: "+point+"\n�̸���: "+email;
	}
}//Customer class

public class Work01 {//main class

	public static void main(String[] args) {
		Employee e=null;
		e=new Employee();
		e.name="GGG";
		e.age=10;
		e.phone="01080209447";
		System.out.println(e.showInfo());
		Person p=null;
		p=new Person();
		

	}//main class

}//Work01 class
