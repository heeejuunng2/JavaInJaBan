package day0907;

import javax.swing.JOptionPane;

/*
 * exit를 입력받을 때까지 jop로 문자열을 계속 입력 받음
 * 1. 입력받은 문자열의 단어수 출력
 * 2. a의 갯수 출력
 * 3. 띄어쓰기 제외한 글자수 출력
 *    ==> replace(" ",""):띄어쓰기 사라짐
 */
public class Work02 {//main class
	
	public static void main(String[] args) {
		String input;
		String str=""; //입력한 문자열을 연결시킨 문자열
		
		while(true){
			input=JOptionPane.showInputDialog("아무거나 입력(종료:Exit)");
			if(input.equalsIgnoreCase("exit")){
				JOptionPane.showMessageDialog(null, "종료합니다");
				break;
			}
			str+=input+"\n";
		}//while
		str.trim();
		JOptionPane.showMessageDialog(null, "<입력한 문자열>\n"+str);
		
		//입력받은 문자열의 단어 수 출력
		String[] strArr = str.split(" |\n"); //공백 또는 엔터
		JOptionPane.showMessageDialog(null, "단어수: "+strArr.length+"개");
		
		//a의 갯수 출력
		int count=0;
		char[] chs=str.toCharArray();
		for(char c:chs){
			if(c=='A'||c=='a'){
				count++;
			}
		}
		JOptionPane.showMessageDialog(null, "a또는 A의 갯수는 :"+count+"개");
		
		//띄어쓰기 제외한 글자수 출력
		str=str.replace(" ", "");
		str=str.replace("\n","");
		JOptionPane.showMessageDialog(null, "글자수: "+str.length()+"개");
		
	}//end of main method
	
}//end of main class
