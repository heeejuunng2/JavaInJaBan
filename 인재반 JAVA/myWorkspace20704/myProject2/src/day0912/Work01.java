package day0912;

import java.util.Arrays;

/*
 * <Arrays Ŭ����>
 * :�迭�� ����, ����, Ž�� �� �迭 ���ۿ� �ʿ��� �޼ҵ� ����
 *  (��� static �޼���)
 */
public class Work01 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		//1. �迭�� ����
		//1) Ÿ�ٹ迭 copyOf(�����迭,����):�ε��� 0���� ���̸�ŭ
		char[] c1= {'J','a','v','a'};
		char[] c2=Arrays.copyOf(c1, c1.length);
		System.out.println(c2);
		
		c2=Arrays.copyOf(c1, 2);
		System.out.println(c2);
		
		//2) Ÿ�Ϲ迭 copyOfRange(�����迭,�����ε���,���ε���)
		//					:�迭�� ����~ �������� ���� 
		c2=Arrays.copyOfRange(c1, 1, 4);
		System.out.println(c2);
		
		//3)system.arraycopy(�����迭,���������ε���,Ÿ�ٹ迭,Ÿ�ٽ����ε���,���簹��)
		int[] src= {0,1,2,3,4,5};
		int[] dst= {0,100,200,300,400,500};
		//dst�� 0,100,200,300,3,4�� �ǵ��� ����
		System.arraycopy(src, 3, dst, 4, 2);
		
		//2. �迭�� ���
		//String toString(�迭): �迭�� ��� ��Ҹ� ���ڿ��� ����
		System.out.println(Arrays.toString(dst));
		
		//3. �迭�� ��
		//boolean equals(�迭,�迭)
		int[] src2= {0,1,2,3,4,5};
		System.out.println(Arrays.equals(src, src2)); //true
		
		//4. �迭�� �� ����
		//1)void fill(�迭, ��)
		Arrays.fill(src2, 7);
		System.out.println(Arrays.toString(src2));
		//2)void fill(�迭,�����ε���,���ε���,��)
		//src2 �� 8,8,7,7,7,7
		Arrays.fill(src2, 0, 2, 8);
		System.out.println(Arrays.toString(src2));
		
		//5. �迭 �������� ����
		//1) void sort(�迭)
		Arrays.sort(dst);
		System.out.println(Arrays.toString(dst));
		
		//2) void sort(�迭,�����ε���,���ε���)
		//src2�� 0��°���Һ��� 2��°���ұ��� ����
		//7,8,8,7,7,7
		Arrays.sort(src2, 0, 3);
		System.out.println(Arrays.toString(src2));
		
		//6. �迭 �˻�
		//1) int binarhSearch(�迭,ã�°�)
		//��ã���� ���� ��ȯ
		String[] sa= {"����ũ","����","�����","�ܹ���","������","���ű��"};
		System.out.println(Arrays.binarySearch(sa, "����ũ"));
		//�ݵ�� ���ĵ� ���¿��� ����ؾ���
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
		System.out.println(Arrays.binarySearch(sa, "������"));
		//2) int binarySearch(�迭,�����ε���,���ε���,��)
		//  ���ϴ� �������� ã��
		System.out.println(Arrays.binarySearch(sa, 0,2,"����ũ")); 
		//ã���� x
		
	}//end of main method

}//end of main class
