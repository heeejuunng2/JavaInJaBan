package day06;

import javax.swing.JOptionPane;

/*
 * <Quiz01>
 * 1. 5과목의 점수를 저장하는 double형 배열을 선언한다
 * 2. jop로 5과목의 점수를 ..입력받아 배열에 저장한다
 * 	  (예 : "1번째 점수입력(1~100의 실수)를 입력" 이라고 창을 띄어 점수를 입력받는다)
 * 3. 입력된 점수 5개외 최대점수. 최소점수를 jop로 출력한다
 * 	  (출력예: 74.2/88.9/94.1/90.8/80.6)
 * 			최고점수 : 94.1
 * 			최소점수 : 74.2
 * 
 * continue
 * -> 반복문에서만 사용가능
 * 반복을 종료시키는 것이 아니라 종속문장을 건너띈다
 * for문 : continue문을 만나면 증감식으로 가구요
 * while문 : continue문을 만나면 조건식으로 갑니다
 */
public class Work04 { //main class

	public static void main(String[] args) {
		double[] grade=new double[5];
		for(int i=0;i<grade.length;i++){
		double a=Double.parseDouble(
				JOptionPane.showInputDialog(
						i+1+"번째 과목의 점수입력(1~100의 실수)"));
		if(a<0||a>100){
			JOptionPane.showMessageDialog(null, i+1+"번째 점수 잘못입력..다시입력");
			i--;
			continue;	
		}//if
		grade[i]=a; //점수입력이 제대로 된경우, 배열에 값을 저장
		}//for
		
		//배열의 모든 값을 출력
		String str=""; //결과값을 저장할 변수
		for(double b:grade){
			str+=b+"/";
		}//확장for
		
		//최대값과 최소값 구하기
		double max=grade[0]; double min=grade[0];
		for(double b:grade){
			if(b>max) max=b;
			else if(b<min) min=b;
		}//확장 for
		
		str+="\n최고점수: "+max+"\n최소점수: "+min;
		JOptionPane.showMessageDialog(null, str);
	} //main method

} //Work04
