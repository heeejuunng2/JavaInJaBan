package day1017;

import java.util.ArrayList;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name+"(�Ϲ���)";
	}
}//end of Person class

class Worker extends Person{
	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(������)";
	}
}//end of Worker class

class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(�л�)";
	}
}//end of Student class

class HighStudent extends Student{
	public HighStudent(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return name+"(����л�)";
	}
}//end of HighStudent class

class Course<T extends Person>{ //���׸�(Person)
	String cname; //���¸�
	private ArrayList<T> list = new ArrayList<>(); //����������Ʈ
	
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
		return cname+"���¼�����: "+list.toString();
	}
	
	ArrayList<T> getList(){
		return list;
	}
}//end of Course class 

public class CourseEx01 {//main class

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("��ǻ���� ����");
		
		Course<Worker> workerCourse = new Course<>("�ΰ�����");
		
		Course<Student> studentCourse = new Course<>("�ڹ�");
		
		Course<HighStudent> highStudentCourse = new Course<>("����Ͼ�");

		infoCourse(workerCourse);
		CourseEx01.<Worker>infoCourse2(workerCourse); //Ŭ�����̸� �����Ұ�
		infoCourse2(workerCourse); //��������
		
//		infoWorkerCourse(studendtCourse); //�Ұ���
//		infoStudentCourse(workerCourse); //�Ұ���  
		
	}//end of main method
	
	//����1) ��� ���� ��ü�� ���� �� �ֵ��� �Ű������� ����
	public static void infoCourse(Course<? extends Person> c) { }
	
	//����2) ����1�� �޼��带 ���׸��޼���� ��ȯ�غ�����
	//�̸��� infoCourse2�� �Ѵ�
	public static <T extends Person>void infoCourse2(Course<T> c) { }
	
	//����3) �л��鸸 ���� �� �ִ� ���°�ü�� ���� �� �ֵ��� �Ű����� ����
	public static void infoStudentCourse(Course<? extends Student> c) { }
	
	//����4) ����3�� �޼��带 ���׸��޼���� ��ȯ
	//�̸��� infoStudentCourse2�� �Ѵ�
	public static <T extends Student>void infoStudentCourse2(Course<T> c) { }
	
	//����5) �����ΰ� �Ϲ����� ���� �� �մ� ���°�ü�� ���� �� �ֵ��� �Ű����� ����
	public static void infoWorkerCourse(Course<? super Worker> c) { }
	
	//����6) ����5�� �޼��带 ���׸��޼���� ��ȯ
	//�̸��� infoWorkerCourse2�� �Ѵ�
	//�����ǡ�) ?(���ϵ�ī��)�� ���׸��޼��忡�� ���� X
	//public static <T super Worker>void infoWorkerCourse2(Course<T> c) { }
	
}//end of main class
