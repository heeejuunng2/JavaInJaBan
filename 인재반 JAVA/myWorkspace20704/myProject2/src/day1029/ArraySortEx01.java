package day1029;
/*
 * <��ü ����(��)>
 * 1. Comparable<T> �������̽�: int comparaTo(T o)
 * 2. Comparator<T> �������̽�(Comparable����Ŭ������
 * �� �� ���� ��ü�� �迭�� ����) ==> int compare(T o1, T o2)
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
		String[] strings = {"�θ��� ���� �θ����� ������",
							"�ð��� ���̴�",
							"���� Į���� ���ϴ�"
					};
		
		Arrays.sort(strings); //�������ִ� �޼���
		for(String s : strings) {
			System.out.println(s);
		}
  
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
				}
			});
		
		System.out.println("===���ڿ� ���� �������� ����===");
		for(String s:strings) {
			System.out.println(s);
		}
  
		Arrays.sort(strings, new SortbyLength());
		System.out.println("===���ڿ� ���� �������� ����===");
		for(String s:strings) {
			System.out.println(s);
		}
 
 	}//end of main method

}//end of main class 
