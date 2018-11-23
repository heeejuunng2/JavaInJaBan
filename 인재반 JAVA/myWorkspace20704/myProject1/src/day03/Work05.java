package day03;

import javax.swing.JOptionPane;
//5문제 맞출때까지 구구단 문제 내기
public class Work05 {//main class

	public static void main(String[] args) {
		int count=0; //정답수를 저장하는 변수
		double qcount=0; //문제수를 저장하는 변수
		while(count !=5){
		int rand=(int)(Math.random()*9)+1;//1~9
		String ans=JOptionPane.showInputDialog("5*"+rand+"=?");
		qcount++;
		int answer=Integer.parseInt(ans); //정수변환
		if(answer==5*rand){
			count++;
			JOptionPane.showMessageDialog(null, "정답\n"+
						"현재 정답수:"+count);		
		}//end of if
		else
			JOptionPane.showMessageDialog(null, "땡!");
		}//end of while
		JOptionPane.showMessageDialog(null, "축하합니다. 5문제를 맞추셨습니다.\n정답률은 "+
		count/qcount*100+"%입니다.\n프로그램을 종료합니다");
		//qcount는 double형이여야함 int형이면 0나옴 
		
	}//end of main method

}//end of Work05 class
