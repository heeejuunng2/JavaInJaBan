package day1022;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * <Set �������̽�>
 * - �ε��� X, �ߺ����� X, ������� X
 * - List�� �޼ҵ� �ߺ�, ��� �ε���ó���� ����.
 *    -> get(0); �̷��� Set������ ����
 * - ����Ŭ���� : HashSet, TreeSet
 *      (HashSet: �˻�����, TreeSet: �ڵ�����)
 */
public class SetEx01 {//main class

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); 
		
		set.add(100); //100->��ü 100 : boxing
		set.add(50); set.add(-10); set.add(150);
		set.add(55); set.add(70); set.add(5); set.add(100);
		
		System.out.println(set.toString());
		
		System.out.println(set.contains(10));
		set.remove(-10);
		
		System.out.println("������ ���� ������ ���� :"+set.size()+"��");
		
		System.out.println("===�迭����====");
		Object[] arr = set.toArray();
		
		/*
		 * <java.util.Iterator(�ݺ���) �������̽�>
		 */
		System.out.println("==Iterator���==");
		Iterator<Integer> it = set.iterator();
		//set�� �ִ� �ݺ��ڸ� �θ� ==> it�� ����
		Integer i = it.next();
		System.out.println(i); //5����
		System.out.println(it.next()); //50����
		System.out.println(it.next()); //55����
		
		while(it.hasNext()) { //���� ���Ұ� �ִµ��� �ݺ�
			System.out.println(it.next());
		}
		
		//�ݺ��ڸ� �ٽ� ó������ ��������? -> �ٽ� �־������..�ٽ� ó������ ����
		System.out.println("---------------");
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---------------");
		TreeSet<Integer> ts = new TreeSet<>(); 
		
		ts.add(100); //100->��ü 100 : boxing
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
		//E higher(E e) : e���� ū�����߿� ���尡��� ��ü�� ����Ѵ�
		System.out.println(ts.lower(20));
		
		//SortedSet<E> subSet(E from, E to) -> from���� to"��"����
		Set<Integer> s = ts.subSet(50, 70);
		System.out.println(s);
		
		//SortedSet<E> tailSet(E from):from(����)���� ū ��ü ��ȯ
		s=ts.tailSet(70); 
		System.out.println(s);
		
		//SortedSet<E> headSet(E to):to(������)���� ���� ��ü ��ȯ
		s=ts.headSet(70);
		System.out.println(s);
		
	}//end of main method

}//end of main class
