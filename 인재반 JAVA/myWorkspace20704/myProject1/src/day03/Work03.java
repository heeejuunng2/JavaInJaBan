package day03;

import javax.swing.JOptionPane;

/*
 * 무한루프
 * : 중간에 멈추는 조건이 반드시 들어가고 break를 이용한다
 * 
 * while(true){
 * 	 //무한반복
 * }
 */
public class Work03 {//main class

	public static void main(String[] args) {
		while(true){
		String menu="-------------------------------\n"+
					"1. 입력	 2. 삭제	 3. 종료\n"+
					"-------------------------------\n";
		String input=JOptionPane.showInputDialog(menu);
		if(input.equals("1"))
			JOptionPane.showMessageDialog(null, "입력완료");
		else if(input.equals("2"))
			JOptionPane.showMessageDialog(null, "삭제완료");
		else if(input.equals("3"))
			break;
		else 
			JOptionPane.showMessageDialog(null, "잘못입력하셨습니다");
		}//end of while
				
		

	}//end of main method

}//end of Work03 class
