package day1029;
/*
 * <객체 정렬(비교)>
 * 1. Comparable<T> 인터페이스: int comparaTo(T o)
 * 2. Comparator<T> 인터페이스(Comparable구현클래스가
 * 될 수 없는 객체의 배열을 정렬) ==> int compare(T o1, T o2)
 */
import java.util.Arrays;
import java.util.Comparator;

class SortbyLength implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.length()-o1.length();
	}
   
}//end of SortbyLength class

public class ArraySortEx01 {//main class

	public static void main(String[] args) {
		String[] strings = {"로마에 가면 로마법을 따른다",
							"시간은 금이다",
							"펜은 칼보다 강하다"
					};
		
		Arrays.sort(strings); //정렬해주는 메서드
		for(String s : strings) {
			System.out.println(s);
		}
  
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
				}
			});
		
		System.out.println("===문자열 길이 오름차순 정렬===");
		for(String s:strings) {
			System.out.println(s);
		}
  
		Arrays.sort(strings, new SortbyLength());
		System.out.println("===문자열 길이 내림차순 정렬===");
		for(String s:strings) {
			System.out.println(s);
		}
 
 	}//end of main method

}//end of main class 
