package day18;
/*
 * <API(Application Programming Interface)>
 *  -���̺귯��(library)
 *  -�⺻���� �����Ǵ� ���(���α׷� ���߿� ���� ���Ǵ� Ŭ���� �� �������̽� ����)
 *  
 * <java.lang ��Ű��>
 *  : String , Object, ����Ŭ����(Integer,Boolean, ....)
 *    Math, System Ŭ����
 * 1. Object Ŭ����
 *   :��� Ŭ������ �θ� (��� Ŭ������ Object Ŭ������ �ڽ��� )
 */
class Person{
	String name;
	String ssn; //�ֹε�Ϲ�ȣ
	
	Person(){
		this("����?","����");
	}
	Person(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	@Override
	public String toString() {  //��ü�� ǥ���ϴ� �Ѹ���!!
		//���۷��������� ����ϸ� toString()�� �����̵ȴ�
		return "�̸�:"+name+"/�ֹι�ȣ:"+ssn;
	}
	@Override
	public boolean equals(Object obj) {
		//�� ��ü�� �� �ٸ� ��üobj�� "�ּ�"�� ������ true
		// ���� ������ false �ּҴ� �� �ٸ��Ƿ� ������ �� false����
		//�ֹ� ��Ϲ�ȣ�� ������ true������ �ϱ�
		if(this==obj) return true; //�̷����� X
		if(obj instanceof Person){
			Person p=(Person)obj;
			return ssn.equals(p.ssn);
		}
		return false;
	}
	@Override
	public int hashCode() {	//��ü�� hash�ڵ带 �˷��ش�
		//hashCode? ��ü�� ������ȣ(���۷��� ��� ������)
		return super.hashCode();
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Person p=new Person();
		Person p3=new Person();
		System.out.println(p.equals(p3));
		Person p4=new Person("�̸�","123");
		System.out.println(p.equals(p4));
		System.out.println(p);
		
		Object[] o = {new Person(),"ABC",3,'a',true};
		
		for(Object obj:o){
			System.out.println(obj);
		}
		
		Person p2=new Person();
		System.out.println(p.equals(p2));
		
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}//main method

}//Work02 class
