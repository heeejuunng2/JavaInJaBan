package day08;

import javax.swing.JOptionPane;

/*
 * <�л� ���� ���α׷�>
 * 1. �Ϲ� Ŭ���� : Student
 * 	  - �ʵ�: �̸�,����,����,����,���,���
 * 2. ����Ŭ����
 * 	  1. ����ϱ�
 * 		 - �̸� ���� ���� ���� ���� jop�� �Է¹ޱ�
 * 		 - ���, ��ް��
 * 			(����� 90�̻�A, 80�̻� 90�̸� B, 70�̻� 80�̸�C
 * 			 60�̻� 70�̸� D, 60�̸� F)
 * 	  2. ��޺���
 * 	  3. �հ�Ȯ���ϱ� - ��� 65.5 �̻��̸� �հ�
 * 	  4. �����ϱ�
 */
class Student{
	String name; //�̸�
	int kor, eng, meth; //��,��,��
	double avg; //���
	char grade; //���
}//Student class

public class Work02 { //main class

	public static void main(String[] args) {
		String message="1.����ϱ�\n2.��޺���\n3.�հ�Ȯ���ϱ�\n4.�����ϱ�";
		Student s=null;
		while(true){
			String a=JOptionPane.showInputDialog(message);	
			if(a.equals("1")){//����ϱ�
				s=new Student();
				s.name=JOptionPane.showInputDialog("�̸��Է�:");
				s.kor=Integer.parseInt(JOptionPane.showInputDialog("���������Է�:"));
				s.eng=Integer.parseInt(JOptionPane.showInputDialog("���������Է�:"));
				s.meth=Integer.parseInt(JOptionPane.showInputDialog("���������Է�:"));
				s.avg=(s.kor+s.eng+s.meth)/3.0;
				
				if(s.avg>=90){ //��ް��
					s.grade='A';
				}else if(s.avg>=80){s.grade='B';}
				else if(s.avg>=70){s.grade='C';}
				else if(s.avg>=60){s.grade='D';}
				else s.grade='F';
				
				JOptionPane.showMessageDialog(null, "��ϿϷ�");
			}else if(a.equals("2")){//��޺���
				if(s==null){
					JOptionPane.showMessageDialog(null, "��ϸ�����");
				}
				else {JOptionPane.showMessageDialog
					(null, s.name+"���� �����"+s.grade+"�Դϴ�");}
			}else if(a.equals("3")){//�հ�Ȯ���ϱ�
				if(s==null){
					JOptionPane.showMessageDialog(null, "��ϸ�����");
				}
				else {
					String showMsg=s.name+"����";
					if(s.avg>=65.5){showMsg+="�հ��Դϴ�";}
					else{showMsg+="���հ��Դϴ�";}
					JOptionPane.showMessageDialog(null, showMsg);
				}	
			}else if(a.equals("4")){//�����ϱ�
				JOptionPane.showMessageDialog(null, "����");
				System.exit(0); //���α׷� ����
			}else { //�׿� ���
				JOptionPane.showMessageDialog(null, "�Է¿���");
			}
			
		}//while
		
	} //main method

} //Work02 class
