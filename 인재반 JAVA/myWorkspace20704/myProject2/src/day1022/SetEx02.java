package day1022;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEx02 {//main class

	public static void main(String[] args) {
		//String 타입의 TreeSet을 만든다
		Set<String> set = new TreeSet<>(); 
		
		//TreeSet<String> set = new TreeSet<>(); 위에거랑 같음
		
		//국어, 수학, 영어, 미술, 수학을 add
		set.add("국어"); set.add("수학"); set.add("영어");
		set.add("미술"); set.add("수학");
		
		//"과목(총 00개)" 출력
		System.out.println("과목(총 "+set.size()+")개");
		
		//반복자를 이용하여 Set의 모든 객체를 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//스캐너로 삭제할 과목 입력받아 그 과목 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("삭제할 과목 입력: ");
		String subject = sc.next();
		set.remove(subject);
		
		//"삭제후 과목(총 00개)"출력
		System.out.println("삭제후 과목(총 "+set.size()+")개");
		
		//빈복자를 이용해서 Set의 모든 객체를 출력
		it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}	
		
	}//end of main method

}//end of main class
