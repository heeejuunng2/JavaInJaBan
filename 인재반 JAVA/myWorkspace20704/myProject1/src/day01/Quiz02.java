package day01;

import javax.swing.JOptionPane;

/*
 * Math.random()을 활용하여 구구단 문제를 제시하고,
 *  정답입력시 "딩동댕~", 오답시 "땡~"을 출력하세요
 *  (이때, 조건연산자를 이용하세요)
 *  단, jop로 결과 출력
 */
public class Quiz02 {

	public static void main(String[] args) {
		//1. 난수 2개를 발생
		// 2~9까지의 난수==> n1
		// 1~9까지의 난수==> n2
		int n1=(int)(Math.random()*8)+2;
		int n2=(int)(Math.random()*9)+1;
		//정답을 입력받는다
		int answer=Integer.parseInt(
				JOptionPane.showInputDialog(n1+"*"+n2+"= ?"));
		//2. 난수의 곱을 정답과 비교
		String result=n1*n2==answer?"딩동댕":"땡";
		//if(n1*n2==answer)
			//jopshowinputdialog("딩동댕");
		//else
			//jopshowinputdialog("땡");
		//3. 출력
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	
		
	}

}
