package day03;

import javax.swing.JOptionPane;

/*
 * <Quiz01>
 * 1. 30���� 1000������ �� ��, ¦���� ������ ����Ͻÿ�(jop�̿�)
 * 2. 1���� 1000������ �� ��, 11�� 17�� ��������� ���
 *  
 */
public class Work01 { //main class

	public static void main(String[] args) {
		//1.
		int sum=0;
		for(int i=30;i<1000;i++){
			if(i%2==0){
				sum=sum+i;
			}//end of if
		}//end of for
		JOptionPane.showMessageDialog(null, sum);
		
		String result="";//����� �����Ͽ� �ϳ��� ���ڿ��� ������ ����
		for(int i=1;i<1000;i++){
			if(i%11==0&&i%17==0){
				result+=i+"\n"; //result=result+i+"\n";
			}//end of if
		}//end of for
		JOptionPane.showMessageDialog(null, result);
		

	}//end of main method 

}//end of Work01 class

// if���� ��� ���� else if�� �������� �� �ڴ� ���� ����
// �� else�� ���� ���߿� ���� if��¦

