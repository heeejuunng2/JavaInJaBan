package day0907;

import javax.swing.JOptionPane;

/*
 * exit�� �Է¹��� ������ jop�� ���ڿ��� ��� �Է� ����
 * 1. �Է¹��� ���ڿ��� �ܾ�� ���
 * 2. a�� ���� ���
 * 3. ���� ������ ���ڼ� ���
 *    ==> replace(" ",""):���� �����
 */
public class Work02 {//main class
	
	public static void main(String[] args) {
		String input;
		String str=""; //�Է��� ���ڿ��� �����Ų ���ڿ�
		
		while(true){
			input=JOptionPane.showInputDialog("�ƹ��ų� �Է�(����:Exit)");
			if(input.equalsIgnoreCase("exit")){
				JOptionPane.showMessageDialog(null, "�����մϴ�");
				break;
			}
			str+=input+"\n";
		}//while
		str.trim();
		JOptionPane.showMessageDialog(null, "<�Է��� ���ڿ�>\n"+str);
		
		//�Է¹��� ���ڿ��� �ܾ� �� ���
		String[] strArr = str.split(" |\n"); //���� �Ǵ� ����
		JOptionPane.showMessageDialog(null, "�ܾ��: "+strArr.length+"��");
		
		//a�� ���� ���
		int count=0;
		char[] chs=str.toCharArray();
		for(char c:chs){
			if(c=='A'||c=='a'){
				count++;
			}
		}
		JOptionPane.showMessageDialog(null, "a�Ǵ� A�� ������ :"+count+"��");
		
		//���� ������ ���ڼ� ���
		str=str.replace(" ", "");
		str=str.replace("\n","");
		JOptionPane.showMessageDialog(null, "���ڼ�: "+str.length()+"��");
		
	}//end of main method
	
}//end of main class
