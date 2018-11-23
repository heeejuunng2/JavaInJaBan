package day15;

import javax.swing.JOptionPane;

class Student{
	
	String name;
	int score;
	
	void input(){
		//jop로 이름과 점수를 입력받아서 name과 score에 저장
		name=JOptionPane.showInputDialog("이름을 입력하세요");
		score=Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
	}
	String view(){
		//객체의 정보를 String으로 변환
		return "이름: "+name+"의 점수는:"+score+"입니다\n";
	}
	
}//Student class

public class Work01 {//main class

	public static void main(String[] args) {
		//Student배열 5칸 sarr
		Student[] sarr=new Student[5];
		int count=0;
		
		while(true){
			String msg="1.학생등록(5명)\n"+"2.학생검색\n"+
						"3.학생정보 보기\n4.종료하기";
			String input=JOptionPane.showInputDialog(msg);
			if(input.equals("1")){
				//Student의 객체생성
				//input 메서드 호출
				for(int i=0;i<sarr.length;i++){
					sarr[i]=new Student();
					sarr[i].input();
					count++;
				}
				JOptionPane.showMessageDialog(null, "등록완료");
			}else if(input.equals("2")){
				boolean check=false;
				if(count==0){
					JOptionPane.showMessageDialog(null, "등록이 필요합니다");
					continue;
				}else{
					String search=JOptionPane.showInputDialog("찾을학생 이름:");
					for(Student s:sarr){
						if(s.name.equals(search)){
							check=true;
							JOptionPane.showMessageDialog(null, s.view());
							break;
						}		
					}
					if(check==false){
						JOptionPane.showMessageDialog(null, "찾는 학생 없음");
					}
				}
			}else if(input.equals("3")){
				String str="";
				if(count==0){
					JOptionPane.showMessageDialog(null, "등록이 필요합니다");
					continue;
					}
				else {
					for(Student tmp:sarr){
						str+=tmp.view();
					}	
					JOptionPane.showMessageDialog(null, str);
				}
			}else if(input.equals("4")){
				JOptionPane.showMessageDialog(null, "종료");
				System.exit(0);
			}else{
				JOptionPane.showMessageDialog(null, "잘못입력");
				continue;
			}
		}//while
		
	}//main method

}//Work01 class
