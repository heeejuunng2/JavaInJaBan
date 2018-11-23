package day1029;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * <MAP �������̽�>
 * : Ű(Key)-��(Value) ������ ���Ҹ� ����
 *   ==> Ű(���� ã�µ� �����ִ� ��) : �ߺ�X
 *       �� : �ߺ�O
 * - Ư�� Ű����� �˻��� �Ҷ� ���� ���
 * - ����Ŭ���� : HashMap, TreeMap
 *             (HashMap: �˻��پ, TreeMap:�����˻� �Ǵ� ����)
 */
public class MapEx03 {//main class
 
	public static void main(String[] args) {
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		//1. V put(K key, V value)
		map.put("���", 5);
		map.put("�ٳ���", 3);
		map.put("����", 10);
		map.put("����", 1);
  
		//2. int size() Map�� ����� ������ ����
		System.out.println("��������: "+map.size()+"��");
  
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ���� �Է�:");
		String input = sc.next();
		//��3. boolean containsKey(Object key)
		//��4. V get(Object key)
		if(map.containsKey(input)) {
			System.out.println(input+"��(��) "+map.get(input)+"�� �־��");
		}else {
			System.out.println(input+"��(��) �����");
		}	
  
		System.out.println("������ ���� �Է�: ");
		input = sc.next();
		//5. V remove(Object key)
		if(map.containsKey(input)) {
			map.remove(input);
			System.out.println(input+"��(��) �����߾��");
		}else {
			System.out.println(input+"��(��) �����");
		}
		//�� Set<K> keySet() : Map�� ����� ��� Key�� Set���� ��ȯ
		//  for(String s:map) {
		//    �ȵ�
		//  }
		for(String key:map.keySet()) {
			System.out.println(key+"/"+map.get(key)); //�����̸� , ����
		}
		//7. void clear()
		map.clear();
		System.out.println("��� �����߾��");
  
		//8. boolean isEmpty()
		System.out.println("�������?"+map.isEmpty());
		}//end of main method
 
}//end of main class 
