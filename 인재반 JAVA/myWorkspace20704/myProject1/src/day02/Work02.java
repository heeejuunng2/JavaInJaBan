package day02;
/*
 * Scanner�� �̿��Ͽ� ����(2~9)�� �Է¹ް�
 *  (Scanner��� ġ�� ctrl+space���� import
 *   -> Scanner sc = new Scanner(System.in);
 *  �� ������ �������� ���
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Work02 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("���?");
//		int i=sc.nextInt();
//		
//		for(int j=1;j<10;j++)
//			System.out.println(i+"*"+j+"="+i*j);
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("���?"));
		String result=""; //����� ������ ����  �߿�!!!
		for(int j=1;j<10;j++)
			result += i+"*"+j+"="+i*j+"\n";
		JOptionPane.showMessageDialog(null, result);
		// String result="";
		//i=1 result=""+3*1=3+�ٹٲ�
		//i=2 result=""+3*1=3+�ٹٲ�+3*2=6+�ٹٲ�
		//i=3 result=""+3*1=3+�ٹٲ�+3*2=6+�ٹٲ�+3*3=9+�ٹٲ�
		

	}

}
