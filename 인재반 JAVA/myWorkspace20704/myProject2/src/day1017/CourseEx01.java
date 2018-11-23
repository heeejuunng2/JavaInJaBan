package day1017;

import java.util.ArrayList;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name+"(일반인)";
	}
}//end of Person class

class Worker extends Person{
	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(직장인)";
	}
}//end of Worker class

class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(학생)";
	}
}//end of Student class

class HighStudent extends Student{
	public HighStudent(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(고등학생)";
	}
}//end of HighStudent class

class Course<T extends Person>{ //지네릭(Person)
	String cname; //강좌명
	private ArrayList<T> list = new ArrayList<>(); //수강생리스트
	
	public Course(String cname) {
		this.cname = cname;
	}
	
	void add(T item) {
		list.add(item);
	}
	
	boolean remove(T item) {
		return list.remove(item);
	}
	
	@Override
	public String toString() {
		return cname+"강좌수강생: "+list.toString();
	}
	
	ArrayList<T> getList(){
		return list;
	}
}//end of Course class 

public class CourseEx01 {//main class

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("컴퓨터의 이해");
		
		Course<Worker> workerCourse = new Course<>("인공지능");
		
		Course<Student> studentCourse = new Course<>("자바");
		
		Course<HighStudent> highStudentCourse = new Course<>("모바일앱");

		infoCourse(workerCourse);
		CourseEx01.<Worker>infoCourse2(workerCourse); //클래스이름 생략불가
		infoCourse2(workerCourse); //생략가능
		
//		infoWorkerCourse(studendtCourse); //불가능
//		infoStudentCourse(workerCourse); //불가능  
		
	}//end of main method
	
	//문제1) 모든 강좌 객체를 받을 수 있도록 매개변수를 선언
	public static void infoCourse(Course<? extends Person> c) { }
	
	//문제2) 문제1의 메서드를 지네릭메서드로 변환해보세요
	//이름은 infoCourse2로 한다
	public static <T extends Person>void infoCourse2(Course<T> c) { }
	
	//문제3) 학생들만 들을 수 있는 강좌객체를 받을 수 있도록 매개변수 선언
	public static void infoStudentCourse(Course<? extends Student> c) { }
	
	//문제4) 문제3의 메서드를 지네릭메서드로 변환
	//이름은 infoStudentCourse2로 한다
	public static <T extends Student>void infoStudentCourse2(Course<T> c) { }
	
	//문제5) 직장인과 일반인이 들을 수 잇는 강좌객체를 받을 수 있도록 매개변수 선언
	public static void infoWorkerCourse(Course<? super Worker> c) { }
	
	//문제6) 문제5의 메서드를 지네릭메서드로 변환
	//이름은 infoWorkerCourse2로 한다
	//※주의※) ?(와일드카드)는 지네릭메서드에는 쓰지 X
	//public static <T super Worker>void infoWorkerCourse2(Course<T> c) { }
	
}//end of main class
