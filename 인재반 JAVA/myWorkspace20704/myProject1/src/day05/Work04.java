package day05;

import javax.swing.JOptionPane;

/*
 * <배열 활용 예제1 : 총합과 평균>
 * 1. 점수를 저장하는 score배열(크기5)를 선언한다.
 * 2. jop를 이용(입력대화상자: 과목1의 점수를 입력 이라고 출력) 점수 입력받는다
 * 3. 점수의 종합과 평균을 jop로 출력한다
 * 	  (200,88,100,100,90을 입력 -> 총합 :478, 평균 :95.6이 출력되어야함 )
 * 단, 총합을 구할때는 확장 for문을 이용할것
 */
public class Work04 { //main class
 
	public static void main(String[] args) {
		//1.sum, avg변수 선언
		int sum=0;
		double avg=0;
		//2.배열 선언
		int[] score = new int[5];
		//3.점수 입력받아서 배열에 값을 저장
		for(int i=0;i<score.length;i++){
			score[i]=Integer.parseInt(JOptionPane.showInputDialog("과목"+(i+1)+"의 점수를 입력"));
		}//for
		//4.sum을 구한다(확장for)
		for(int i:score){
			sum+=i;
		}//for
		//5.avg를 구한다
		avg=(double)sum/score.length;
		//jop로 출력
		JOptionPane.showMessageDialog(null,"점수 총합은 "+sum+"이고 \n평균은 "+avg+"입니다");
	} //main method

} //Work04 class
