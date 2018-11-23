package day02;
/*
 * Scanner를 이용하여 숫자(2~9)를 입력받고
 *  (Scanner라고 치고 ctrl+space에서 import
 *   -> Scanner sc = new Scanner(System.in);
 *  그 숫자의 구구단을 출력
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Work02 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("몇단?");
//		int i=sc.nextInt();
//		
//		for(int j=1;j<10;j++)
//			System.out.println(i+"*"+j+"="+i*j);
		
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("몇단?"));
		String result=""; //결과를 저장할 변수  중요!!!
		for(int j=1;j<10;j++)
			result += i+"*"+j+"="+i*j+"\n";
		JOptionPane.showMessageDialog(null, result);
		// String result="";
		//i=1 result=""+3*1=3+줄바꿈
		//i=2 result=""+3*1=3+줄바꿈+3*2=6+줄바꿈
		//i=3 result=""+3*1=3+줄바꿈+3*2=6+줄바꿈+3*3=9+줄바꿈
		

	}

}
