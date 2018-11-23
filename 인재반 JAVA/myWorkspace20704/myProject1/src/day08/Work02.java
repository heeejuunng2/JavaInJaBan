package day08;

import javax.swing.JOptionPane;

/*
 * <학생 정보 프로그램>
 * 1. 일반 클래스 : Student
 * 	  - 필드: 이름,국어,영어,수학,평균,등급
 * 2. 메인클래스
 * 	  1. 등록하기
 * 		 - 이름 국어 영어 수학 점수 jop로 입력받기
 * 		 - 평균, 등급계산
 * 			(평균이 90이상A, 80이상 90미만 B, 70이상 80미만C
 * 			 60이상 70미만 D, 60미만 F)
 * 	  2. 등급보기
 * 	  3. 합격확인하기 - 평균 65.5 이상이면 합격
 * 	  4. 종료하기
 */
class Student{
	String name; //이름
	int kor, eng, meth; //국,영,수
	double avg; //평균
	char grade; //등급
}//Student class

public class Work02 { //main class

	public static void main(String[] args) {
		String message="1.등록하기\n2.등급보기\n3.합격확인하기\n4.종료하기";
		Student s=null;
		while(true){
			String a=JOptionPane.showInputDialog(message);	
			if(a.equals("1")){//등록하기
				s=new Student();
				s.name=JOptionPane.showInputDialog("이름입력:");
				s.kor=Integer.parseInt(JOptionPane.showInputDialog("국어점수입력:"));
				s.eng=Integer.parseInt(JOptionPane.showInputDialog("영어점수입력:"));
				s.meth=Integer.parseInt(JOptionPane.showInputDialog("수학점수입력:"));
				s.avg=(s.kor+s.eng+s.meth)/3.0;
				
				if(s.avg>=90){ //등급계산
					s.grade='A';
				}else if(s.avg>=80){s.grade='B';}
				else if(s.avg>=70){s.grade='C';}
				else if(s.avg>=60){s.grade='D';}
				else s.grade='F';
				
				JOptionPane.showMessageDialog(null, "등록완료");
			}else if(a.equals("2")){//등급보기
				if(s==null){
					JOptionPane.showMessageDialog(null, "등록먼저해");
				}
				else {JOptionPane.showMessageDialog
					(null, s.name+"님의 등급은"+s.grade+"입니다");}
			}else if(a.equals("3")){//합격확인하기
				if(s==null){
					JOptionPane.showMessageDialog(null, "등록먼저해");
				}
				else {
					String showMsg=s.name+"님은";
					if(s.avg>=65.5){showMsg+="합격입니다";}
					else{showMsg+="불합격입니다";}
					JOptionPane.showMessageDialog(null, showMsg);
				}	
			}else if(a.equals("4")){//종료하기
				JOptionPane.showMessageDialog(null, "종료");
				System.exit(0); //프로그램 종료
			}else { //그외 경우
				JOptionPane.showMessageDialog(null, "입력오류");
			}
			
		}//while
		
	} //main method

} //Work02 class
