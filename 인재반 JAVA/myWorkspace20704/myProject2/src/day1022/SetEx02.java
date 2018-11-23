package day1022;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEx02 {//main class

	public static void main(String[] args) {
		//String Ÿ���� TreeSet�� �����
		Set<String> set = new TreeSet<>(); 
		
		//TreeSet<String> set = new TreeSet<>(); �����Ŷ� ����
		
		//����, ����, ����, �̼�, ������ add
		set.add("����"); set.add("����"); set.add("����");
		set.add("�̼�"); set.add("����");
		
		//"����(�� 00��)" ���
		System.out.println("����(�� "+set.size()+")��");
		
		//�ݺ��ڸ� �̿��Ͽ� Set�� ��� ��ü�� ���
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//��ĳ�ʷ� ������ ���� �Է¹޾� �� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("������ ���� �Է�: ");
		String subject = sc.next();
		set.remove(subject);
		
		//"������ ����(�� 00��)"���
		System.out.println("������ ����(�� "+set.size()+")��");
		
		//���ڸ� �̿��ؼ� Set�� ��� ��ü�� ���
		it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}	
		
	}//end of main method

}//end of main class
