package day01;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * <자료 입력받기>
 * 1. Scanner 클래스
 * - 콘솔창에서 입력받을때
 * - Scanner 라고 치고, import한다
 * 
 * 2. JOptionPane 클래스
 * - 콘솔창 대신 직접 창을 띄워 입력받을 때
 * - jop라고 치고 자동완성 한다
 * - JOptionPane 클래스를 import한다
 * - 입력데이터는 무조건 문자열이다
 * - 입력문자열을 다른 형으로 바꿀 때는 파싱을 해야한다
 * - Integer.parseInt()
 * - Double.paresDouble()
 */

public class Work01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=sc.nextInt();
		
		System.out.println(i+"를 입력하셨군요");
		
		
		int c=Integer.parseInt(
				JOptionPane.showInputDialog(
						"숫자를 입력하세요"));
		//데이터를 입력받을 때
		
		//System.out.println(c+"를 입력하셨군요");
		
		JOptionPane.showMessageDialog(null,c+"를 입력하셨군요");
		//메세지를 새로운 창에 보여줄때
	}
}
