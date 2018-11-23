package day08;

import javax.swing.JOptionPane;

/*
 * 1. 일반클래스 : Address
 * 	  -필드: 이름, 연락처
 * 2. 메인클래스
 * 	  -정보입력 :객체 생성해서 멤버변수에 값을 준다
 * 		(Address a= null;
 * 		 a=new Address();
 * 	  -정보보기 :생성한 객체의 멤버변수의 값을 출력
 * 	  -정보삭제 :생성한 객체를 없앤다 (a=null;)
 * 	  -종료 :프로그램 종료
 */
class Address{
	String name;
	String phone;
}//Address class
public class Work03 { //main class
	public static void main(String[] args) { 
		Address a=null;
		while(true){
			String s=JOptionPane.showInputDialog("1.정보입력\n2.정보보기\n3.정보삭제\n4.종료");
			if(s.equals("1")){
				a=new Address();
				a.name=JOptionPane.showInputDialog("이름입력");
				a.phone=JOptionPane.showInputDialog("전화번호 입력:");}
			if(s.equals("2")){
				if(a==null){JOptionPane.showMessageDialog(null, "등록필요");
				continue;
				}else{
					JOptionPane.showMessageDialog(null, a.name+"님의 전화번호는"+a.phone+"입니다");
				}
			}	
			if(s.equals("3")){
				a=null;
			}
			if(s.equals("4")){
				System.exit(0);
			}
		}
		

	}//main method

}//Work03 class
