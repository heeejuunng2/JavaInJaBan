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
	//toString() �������̵�
	@Override
	public String toString() {
		return hakbun+":"+name+"("+score+")";
	}
	//hakbun�� ������ HashSet�� ������� �ʵ���!!!
	 //-> �й��� ������ ���� ��ü�� �ν��Ѵٴ� ��
	//==>equals() && hashCode() �������̵�
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
		//hakbun�� ��üȭ ���Ѿ��� hasCode��밡��
	}
	//compareTo()�������̵�
	//���� �� ����(��������), ������ ������ �̸� �� ����
	//TreeSet�� �ش� Ʈ������ ������ü�Ǵ� ������ ������ 
	//������ ������ ������ü�� �Ǵ���
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
		
		hs.add(new Student(10,"����",90));
		hs.add(new Student(28,"�β�",75));
		hs.add(new Student(31,"����Ŵ",86));
		hs.add(new Student(10,"��Ŵ",88)); //����X
		hs.add(new Student(4,"���̾�Ƽ",67));
		hs.add(new Student(5,"�����",75));
		
		System.out.println("======HashSet======");
		//���� �̿��ؼ� ���
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(10,"����",90));
		ts.add(new Student(28,"�β�",75));
		ts.add(new Student(31,"����Ŵ",86));
		ts.add(new Student(10,"��Ŵ",88));  //����X
		ts.add(new Student(4,"���̾�Ƽ",67));
		ts.add(new Student(5,"�����",75));
		//ts.add(new Student(6,"�����", 75)); 
		//�񱳱����� ������ �̸��̶� 
		//������ �̸��� ������ ���� ��ü�� �νĵǹǷ� ����X
		ts.add(new Student(6,"�����", 75)); 
		//�񱳱����� �й��� �߰������Ƿ� ���� ���尡��
		
		System.out.println("======TreeSet======");
		//���� �̿��ؼ� ���
		it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===================");
		System.out.println("���� ���� ����: "+ts.last().score); 
		System.out.println("���� ���� ����: "+ts.first().score);
	
	}//end of main method

}//end of main class

