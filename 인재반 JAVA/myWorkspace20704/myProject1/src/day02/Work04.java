package day02;

import javax.swing.JOptionPane;

/*
 * jop를 이용하여 5단 출력
 */
public class Work04 {

	public static void main(String[] args) {
		String result=""; //결과 저장할 변수
		for(int i=1;i<=9;i++) {
			result +="5*"+i+"="+5*i+"\n";
		}//end of for
		JOptionPane.showMessageDialog(null, result);

	}//end of main

}//end of class 
