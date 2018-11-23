package day03;

import javax.swing.JOptionPane;

/*
 * <Quiz01>
 * 1. 30부터 1000까지의 수 중, 짝수의 총합을 출력하시오(jop이용)
 * 2. 1부터 1000까지의 수 중, 11과 17의 공배수만을 출력
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
		
		String result="";//결과를 연결하여 하나의 문자열로 저장할 변수
		for(int i=1;i<1000;i++){
			if(i%11==0&&i%17==0){
				result+=i+"\n"; //result=result+i+"\n";
			}//end of if
		}//end of for
		JOptionPane.showMessageDialog(null, result);
		

	}//end of main method 

}//end of Work01 class

// if문은 계속 실행 else if는 참나오면 그 뒤는 실행 ㄴㄴ
// 걍 else는 가장 나중에 오는 if랑짝

