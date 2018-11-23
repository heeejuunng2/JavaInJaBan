package day01;

import java.util.Scanner;

import javax.swing.JOptionPane;

//jop를 이용하여 나이를 입력받고
// "당신은 00살이군요" 출력
// "당신의 10년후 나이는 00 살입니다" 출력
public class Quiz01 {

	public static void main(String[] args) {
		
		//JOptionPane.showInputDialog("당신의 나이를 입력하세요");
		
		int age = Integer.parseInt(
					JOptionPane.showInputDialog(
						"당신의 나이를 입력하세요"));
		JOptionPane.showMessageDialog(null,
					"당신의 나이는"+age+"살 이군요"+
					" 당신의 10년 후 나이는"+(age+10)+"입니다");
		}
	}
