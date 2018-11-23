package day0919;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * 1) 생성자:
 *      -생성자(모든 필드 초기화)
 * 2) 메소드
 *      -모든 필드를 캡슐화하고 getter/setter만든다
 *      -setter : nationName과 capitalName이 ""아니도록
 *      		  /population이 0을 초과하도록
 *      		  만약 위 조건을 만족하지 않으면 만족할때까지 입력을
 *               다시 받도록 해주세요
 *      -getter
 *      -toString() 오버라이드(형식 자유)
 */
class Nation{
	private String nationName; //국가명
	private String capitalName; //수도명
	private int population; //인구
	
	Nation(String nationName,String capitalName,int population){
		setNationName(nationName);
		setCapitalName(capitalName);
		setPopulation(population);
	}
	
	public void setNationName(String nationName) {
		while(nationName.equals("")) {
			nationName=JOptionPane.showInputDialog("국가명이 입력되지 않았습니다.\n 국가명:");
		}//end of while
		this.nationName = nationName;
	}//setNationName method
	
	public void setCapitalName(String capitalName) {
		while(capitalName.equals("")) {
			capitalName=JOptionPane.showInputDialog("수도명이 입력되지 않았습니다.\n 수도명:");
		}//end of while
		this.capitalName = capitalName;
	}//setCapitalName method
	
	public void setPopulation(int population) {
		while(population<=0) {
			population=Integer.parseInt(JOptionPane.showInputDialog("인구수가 잘못입력되었습니다.\n 인구수:"));
		}//end of while
		this.population = population;
	}//setPopulation method
	
	@Override
	public String toString() {
		return "국가명: "+nationName+"\n수도명: "+capitalName+"\n인구수: "+population+"만명";
	}
	
	public String getNationName() {
		return nationName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public int getPopulation() {
		return population;
	}
	
}
public class NationMain {//main class

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		String select= ""; //메뉴 선택 번호
		String menu="===국가 관리 프로그램===\n"
					+"1. 국 가 등      록\n"
				    +"2. 모든 국가 보기\n"
					+"3. 국 가 검      색\n"
				    +"4. 국 가 삭      제\n"
				    +"0. 종              료\n";
		String nation,capital;
		int population;
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			if(select.equals("1")) { //국가등록
				 //국가명, 수도명, 인구수(단위:만명) 을 입력받아서
				 //입력받은 값으로 객체 생성해서 list에 삽입
				 //list에 add후 "등록완료"메세지 띄움
				nation = JOptionPane.showInputDialog("국가명을 입력하세요 :");
				capital = JOptionPane.showInputDialog("수도명을 입력하세요 :");
				population = Integer.parseInt(JOptionPane.showInputDialog("인구수(단위:만명)을 입력하세요 :"));
				list.add(new Nation(nation,capital,population));
				JOptionPane.showMessageDialog(null, "등록완료");
			}else if(select.equals("2")) { //모든 국가 보기
				String str="----국가리스트----\n";
				//list를 출력
				for(Object o:list) { //ArrayList가 Object객체라서
					str+=o.toString()+"\n-------------------------\n";
				}
				JOptionPane.showMessageDialog(null, str);
			}else if(select.equals("3")) { //국가검색
				//국가명을 입력받고, 해당 국가 정보를 보여줌
				//없으면 "등록하지 않은 국가입니다"메세지 띄움
				boolean check=false;
				String search = JOptionPane.showInputDialog("검색할 국가의 이름을 입력하세요 :");
				for(Object o:list) {
					if(((Nation)o).getNationName().equals(search)) {
						JOptionPane.showMessageDialog(null, o.toString());
						check=true;
						break;
					}
				}//end of for
				if(!check) { //check == false 
					JOptionPane.showMessageDialog(null, "등록되지 않은 국가입니다.");
				}
				continue;
			}else if(select.equals("4")) { //국가삭제
				//국가명을 입력받고, 해당 국가 정보를 삭제한후
				//"삭제하였습니다"메세지 띄움
				//국가명이 없으면, "등록하지 않은 국가이므로 삭제할 수 없습니다" 메세지 띄움
				boolean check=false;
				String bin = JOptionPane.showInputDialog("삭제할 국가명을 입력하세요.");
				for(Object o : list) {
					if(((Nation)o).getNationName().equals(bin)) {
						list.remove(o);
						JOptionPane.showMessageDialog(null, "삭제완료");
						check=true;
						break;
					}
				}
				if(!check) { //check == false 
					JOptionPane.showMessageDialog(null, "등록되지 않은 국가입니다.");
				}
			}else if(select.equals("0")) { //종료
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				System.exit(0);
			}else JOptionPane.showMessageDialog(null, "잘못입력");
		}
		
	}//end of main method

}//end of mian class
