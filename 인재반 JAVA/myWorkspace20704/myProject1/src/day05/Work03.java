package day05;

import javax.swing.JOptionPane;

/*
 * 인원수를 jop로 입력받아서
 * 인원수 만큼의 이름배열과 전화번호 배열을 만든다
 * 순서대로 이름과 전화번호를 입력한다(1번째, 2번째 ~~)
 * 입력받은 이름과 전화번호를 출력한다
 */
public class Work03 {// main class

	public static void main(String[] args) {
		//String person=JOptionPane.showInputDialog("인원수를 입력하세요");
		int person2=Integer.parseInt(JOptionPane.showInputDialog("인원수를 입력하세요"));
		
		String[] name=new String[person2];
		String[] phonnum=new String[person2];
		
		//입력받은 값으로 배열에 값을 저장
		for(int i=0;i<person2;i++){
			name[i]=JOptionPane.showInputDialog((i+1)+"번째 이름 입력");
			phonnum[i]=JOptionPane.showInputDialog((i+1)+"번째 전화번호 입력");
		}//for
		
		String str="";
		for(int i=0;i<person2;i++){
			str+=name[i]+"님의 전화번호는 "+phonnum[i]+"입니다.\n";
		}//for
		
		JOptionPane.showMessageDialog(null, str);

	}//main method

}//Work03 class
