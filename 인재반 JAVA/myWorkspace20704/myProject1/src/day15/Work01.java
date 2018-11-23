package day15;

import javax.swing.JOptionPane;

class Student{
	
	String name;
	int score;
	
	void input(){
		//jop�� �̸��� ������ �Է¹޾Ƽ� name�� score�� ����
		name=JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		score=Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ���"));
	}
	String view(){
		//��ü�� ������ String���� ��ȯ
		return "�̸�: "+name+"�� ������:"+score+"�Դϴ�\n";
	}
	
}//Student class

public class Work01 {//main class

	public static void main(String[] args) {
		//Student�迭 5ĭ sarr
		Student[] sarr=new Student[5];
		int count=0;
		
		while(true){
			String msg="1.�л����(5��)\n"+"2.�л��˻�\n"+
						"3.�л����� ����\n4.�����ϱ�";
			String input=JOptionPane.showInputDialog(msg);
			if(input.equals("1")){
				//Student�� ��ü����
				//input �޼��� ȣ��
				for(int i=0;i<sarr.length;i++){
					sarr[i]=new Student();
					sarr[i].input();
					count++;
				}
				JOptionPane.showMessageDialog(null, "��ϿϷ�");
			}else if(input.equals("2")){
				boolean check=false;
				if(count==0){
					JOptionPane.showMessageDialog(null, "����� �ʿ��մϴ�");
					continue;
				}else{
					String search=JOptionPane.showInputDialog("ã���л� �̸�:");
					for(Student s:sarr){
						if(s.name.equals(search)){
							check=true;
							JOptionPane.showMessageDialog(null, s.view());
							break;
						}		
					}
					if(check==false){
						JOptionPane.showMessageDialog(null, "ã�� �л� ����");
					}
				}
			}else if(input.equals("3")){
				String str="";
				if(count==0){
					JOptionPane.showMessageDialog(null, "����� �ʿ��մϴ�");
					continue;
					}
				else {
					for(Student tmp:sarr){
						str+=tmp.view();
					}	
					JOptionPane.showMessageDialog(null, str);
				}
			}else if(input.equals("4")){
				JOptionPane.showMessageDialog(null, "����");
				System.exit(0);
			}else{
				JOptionPane.showMessageDialog(null, "�߸��Է�");
				continue;
			}
		}//while
		
	}//main method

}//Work01 class
