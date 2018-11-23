package day1022;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * <Set 인터페이스>
 * - 인덱스 X, 중복저장 X, 저장순서 X
 * - List와 메소드 중복, 대신 인덱스처리가 없다.
 *    -> get(0); 이런거 Set에서는 없음
 * - 구현클래스 : HashSet, TreeSet
 *      (HashSet: 검색빠름, TreeSet: 자동정렬)
 */
public class SetEx01 {//main class

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); 
		
		set.add(100); //100->객체 100 : boxing
		set.add(50); set.add(-10); set.add(150);
		set.add(55); set.add(70); set.add(5); set.add(100);
		
		System.out.println(set.toString());
		
		System.out.println(set.contains(10));
		set.remove(-10);
		
		System.out.println("삭제후 남은 원소의 개수 :"+set.size()+"개");
		
		System.out.println("===배열변경====");
		Object[] arr = set.toArray();
		
		/*
		 * <java.util.Iterator(반복자) 인터페이스>
		 */
		System.out.println("==Iterator사용==");
		Iterator<Integer> it = set.iterator();
		//set에 있는 반복자를 부름 ==> it에 저장
		Integer i = it.next();
		System.out.println(i); //5나옴
		System.out.println(it.next()); //50나옴
		System.out.println(it.next()); //55나옴
		
		while(it.hasNext()) { //다음 원소가 있는동안 반복
			System.out.println(it.next());
		}
		
		//반복자를 다시 처음부터 읽으려면? -> 다시 넣어줘야함..다시 처음으로 지정
		System.out.println("---------------");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------------");
		TreeSet<Integer> ts = new TreeSet<>(); 
		
		ts.add(100); //100->객체 100 : boxing
		ts.add(50); ts.add(-10); ts.add(150);
		ts.add(55); ts.add(70); ts.add(5); ts.add(100);
		
		it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===============");
		System.out.println("min: "+ts.first());
		System.out.println("max: "+ts.last());
		System.out.println(ts.higher(20));
		//E higher(E e) : e보다 큰숫자중에 가장가까운 객체를 출력한다
		System.out.println(ts.lower(20));
		
		//SortedSet<E> subSet(E from, E to) -> from부터 to"전"까지
		Set<Integer> s = ts.subSet(50, 70);
		System.out.println(s);
		
		//SortedSet<E> tailSet(E from):from(포함)보다 큰 객체 반환
		s=ts.tailSet(70); 
		System.out.println(s);
		
		//SortedSet<E> headSet(E to):to(미포함)보다 작은 객체 반환
		s=ts.headSet(70);
		System.out.println(s);
		
	}//end of main method

}//end of main class
