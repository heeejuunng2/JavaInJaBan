package day19;

import javax.swing.JOptionPane;

/*
 * 1. exit를 입력받을 때까지
 *    jop로 문자열을 계속 입력 받음
 * 2. 입력 받은 문자열의 단어수 출력
 *   (스플릿트=띄어쓰기 기준으로 쪼개기)
 * 3. a또는 A의 갯수 출력 (이그노얼 케이스 ..?)
 *    문자열을 문자배열에 담아서 배열의 처음부터 마지막까지 돌면서
 *    a또는 A를 만나면 count변수를 1씩 증가 (블리언컨테인)
 * 4. 띄어쓰기를 제외한 글자 수 출력 (인트 렝스)
 *     ==> replace(" ",""); ==> 띄어쓰기 사라짐
 */
public class Work05 {//main class

	public static void main(String[] args) {
		int count;
		
		while(true){
			String answer=JOptionPane.showInputDialog("아무거나 입력(종료 : exit)");
			if(answer.equals("exit")) break;
			if(answer.split(" ") != null){
				
			}
		}
		
		
	}//main method

}//Work05 class
