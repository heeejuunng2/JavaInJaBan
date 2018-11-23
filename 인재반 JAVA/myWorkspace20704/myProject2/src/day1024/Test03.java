package day1024;

import java.util.TreeSet;

/*
 * int compareTo(T other)
 * : this가 other보다 앞에 두고 싶으면 음수 반환
 *   this가 other보다 뒤에 두고 싶으면 양수 반환
 *   this와 other가 같으면 0반환
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"/"+age+"세";
	}
	
	//나이순으로 오름차순 정렬
	//나이가 같은경우, 이름순
	@Override
	public int compareTo(Person o) {
		if(age==o.age) {
			return name.compareTo(o.name);
			//return o.name.compareTo(name); ->이름 내림차순
			//String의 compareTo()이용
		}
		return age-o.age;
	}
}
public class Test03 {//main class
	//Integer, Double, String은 모두 Comparable인터페이스의
	//compareTo()메소드 오버라이드
	
	public static void main(String[] args) {
		Integer i1=45, i2=25, i3=25;
		
		System.out.println(i1.compareTo(i2)); //i1>i2 => 1(양수)
		System.out.println(i2.compareTo(i1)); //i2<i1 => -1(음수)
		System.out.println(i2.compareTo(i3)); //i2=i3 => 0
		//비교해서 내가 더 크면 뒤로, 작으면 앞으로, 같으면 가만있음(정렬)
		//-> 오름차순 정렬
		
		//양수가 나오면 뒤로, 음수가 나오면 앞으로, 0은 가만히
		
		TreeSet<Person> ts = new TreeSet<>();
		
		ts.add(new Person("홍자바",45));
		ts.add(new Person("김자바",25));
		ts.add(new Person("박자바",30));
		ts.add(new Person("이자바",30));
		
		System.out.println(ts); //정렬기준없으면 오류남
		
	}//end of main method
	
}//end of main class
