package day08;

import javax.swing.JOptionPane;

/*
 * 1. �Ϲ�Ŭ���� : Address
 * 	  -�ʵ�: �̸�, ����ó
 * 2. ����Ŭ����
 * 	  -�����Է� :��ü �����ؼ� ��������� ���� �ش�
 * 		(Address a= null;
 * 		 a=new Address();
 * 	  -�������� :������ ��ü�� ��������� ���� ���
 * 	  -�������� :������ ��ü�� ���ش� (a=null;)
 * 	  -���� :���α׷� ����
 */
class Address{
	String name;
	String phone;
}//Address class
public class Work03 { //main class
	public static void main(String[] args) { 
		Address a=null;
		while(true){
			String s=JOptionPane.showInputDialog("1.�����Է�\n2.��������\n3.��������\n4.����");
			if(s.equals("1")){
				a=new Address();
				a.name=JOptionPane.showInputDialog("�̸��Է�");
				a.phone=JOptionPane.showInputDialog("��ȭ��ȣ �Է�:");}
			if(s.equals("2")){
				if(a==null){JOptionPane.showMessageDialog(null, "����ʿ�");
				continue;
				}else{
					JOptionPane.showMessageDialog(null, a.name+"���� ��ȭ��ȣ��"+a.phone+"�Դϴ�");
				}
			}	
			if(s.equals("3")){
				a=null;
			}
			if(s.equals("4")){
				System.exit(0);
			}
		}
		

	}//main method

}//Work03 class
