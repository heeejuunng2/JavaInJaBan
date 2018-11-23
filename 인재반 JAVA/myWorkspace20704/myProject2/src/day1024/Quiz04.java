package day1024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int hakbun;
	String name;
	int score;
	
	Student(int hakbun,String name,int score){
		this.hakbun=hakbun;
		this.name=name;
		this.score=score;
	}
	//toString() 오버라이드
	@Override
	public String toString() {
		return hakbun+":"+name+"("+score+")";
	}
	//hakbun이 같으면 HashSet에 저장되지 않도록!!!
	 //-> 학번이 같으면 같은 객체로 인식한다는 말
	//==>equals() && hashCode() 오버라이드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return hakbun==((Student)obj).hakbun;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return ((Integer)hakbun).hashCode(); 
		//hakbun을 객체화 시켜야지 hasCode사용가능
	}
	//compareTo()오버라이드
	//점수 순 정렬(오름차순), 점수가 같으면 이름 순 정렬
	//TreeSet만 해당 트리셋은 같은객체판단 기준이 정렬임 
	//정렬이 같으면 같은객체로 판단함
	@Override
	public int compareTo(Student st) {
		if(st.score==score) {
			if(name.equals(st.name)) {
				return hakbun - st.hakbun;
			}
			return name.compareTo(st.name);
		}
		return score-st.score;
	}
}

public class Quiz04 {//main class

	public static void main(String[] args) {
		Set<Student> hs = new HashSet<>();
		
		hs.add(new Student(10,"김필",90));
		hs.add(new Student(28,"로꼬",75));
		hs.add(new Student(31,"로이킴",86));
		hs.add(new Student(10,"폴킴",88)); //저장X
		hs.add(new Student(4,"자이언티",67));
		hs.add(new Student(5,"양다일",75));
		
		System.out.println("======HashSet======");
		//복자 이용해서 출력
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(10,"김필",90));
		ts.add(new Student(28,"로꼬",75));
		ts.add(new Student(31,"로이킴",86));
		ts.add(new Student(10,"폴킴",88));  //저장X
		ts.add(new Student(4,"자이언티",67));
		ts.add(new Student(5,"양다일",75));
		//ts.add(new Student(6,"양다일", 75)); 
		//비교기준이 점수와 이름이라서 
		//점수와 이름이 같으면 같은 객체로 인식되므로 저장X
		ts.add(new Student(6,"양다일", 75)); 
		//비교기준을 학번도 추가했으므로 이제 저장가능
		
		System.out.println("======TreeSet======");
		//복자 이용해서 출력
		it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===================");
		System.out.println("가장 높은 점수: "+ts.last().score); 
		System.out.println("가장 낮은 점수: "+ts.first().score);
	
	}//end of main method

}//end of main class

