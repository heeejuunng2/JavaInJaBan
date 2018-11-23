package day03;
//맞출때까지 5단 구구단 문제를 계속 내기(무한루프)

import javax.swing.JOptionPane;

public class Work04 { //main class
	public static void main(String[] args) {
		while(true){
		int rand=(int)(Math.random()*9)+1;//1~9
		String ans=JOptionPane.showInputDialog("5*"+rand+"=?");
		int answer=Integer.parseInt(ans); //정수변환
		if(answer==5*rand){
			JOptionPane.showMessageDialog(null, "정답");
			break;}//end of if
		else
			JOptionPane.showMessageDialog(null, "땡!"); }//end of while
		JOptionPane.showMessageDialog(null, "종료합니다");
	}//end of main method
	
}//end of Work04 class
