package day0917;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 다수의 데이터(객체)를 저장해 두고 필요할때마다 꺼내서 사용하는 경우
 *  ==> 보통은 배열을 사용하지만, 많은 문제가 있음
 *  ==> 해결책: 컬렉션 프레임워크
 *  
 *  <Collection Framework>
 *  컬렉션: 무한한 데이터 집합 <=> 배열
 *  프레임워크: 사용방법을 미리 정해둔 라이브러리(기능)
 *   ==> 대량의 데이터를 갯수 제한없이 효율적으로 처리
 *  <컬렉션 종류> => java.util
 *  1. List 인터페이스: 인덱스값 가짐, 중복저장 가능
 *  2. Set 인터페이스: 인덱스X, 중복저장X
 *  3. Map 인터페이스: 
 */
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+" /"+age+"세";
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		List list = new ArrayList();
		ArrayList list1 = new ArrayList(10);
		
		//1. 원소추가 : boolean add(Object element)
		list.add(1); //list.add(Integer(1));
		list.add("ABC");
		list.add(new Date()); //현재 날짜와 시간 객체
		list.add('A'); //list.add(Character ('A'));
		Person p = new Person("피카츄", 10);
		list.add(p);
		System.out.println(list); //list.toString();
		
		//2. 원소삽입 : void add(int index,Object element)
		//원하는 위치에 원소 삽입
		list.add(3, new Person("라이츄",12));
		System.out.println(list);
		
		//3. 원소갯수 : int size()
		System.out.println(list.size()+"개");
		
		//4. boolean isEmpty()
		System.out.println("isEmpty? "+list.isEmpty());
		
		//5. 원소가져오기: Object get(int index)
		Object o = list.get(1);
		System.out.println(o);
		
		//6. 원소 수정 : Object set(int index, Object newElement)
		Object o2 = list.set(2, "메롱메롱");
		System.out.println(list);
		
		//7. 원소삭제: Object remove(int index)
		//           boolean remove(Object element) 삭제 성공여부
		list.remove(2);
		System.out.println(list);
		list.remove((Integer)1); //=list.remove(0);
		System.out.println(list);
		System.out.println(list.remove("아배고파"));
		//"아배고파" 라는 내용이 존재하지 않으므로 삭제 실패
		
		//8. 원소검색: boolean contains(Object element)
		System.out.println(list.contains("치킨"));
		
		//9. 배열로 만들기 : Object[] toArray() :Object배열로 만들어줌
		Object[] arr = list.toArray();
		System.out.println(arr[1]);
		
		//10. int indexOf(Object element) : 원소의 인덱스 반환
		System.out.println(list.indexOf(p));
		
		//11. clear() : 원소 모두 삭제
		list.clear();
		System.out.println(list);
		
	}//end of main method

}//end of mian class
