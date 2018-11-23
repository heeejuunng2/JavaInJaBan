package day02;

import javax.swing.JOptionPane;

/*
 * jop라고 타이핑하고 컨트롤+스페이스
 * JOptionPane.showInputDialog("입력하세요글");
 * JOptionPane.showMessageDialog(null,"나타낼글");
 * 문자열==> 정수
 * Integer.parseInt(JOptionPane.showInputDialog("입력하세요글"));
 */
public class Work03 { //main class 

	public static void main(String[] args) {
		//jop를 이용하여 새 학생의 이름을 입력받고, 이것을 출력
		String name="";
		for(int i=1;i<=3;i++) {
			String input = JOptionPane.showInputDialog(i+"번째 이름입력");
			name += input + "	";
		}//for문
		JOptionPane.showMessageDialog(null, name);

	}//main class 끝

}//class Work03 끝
