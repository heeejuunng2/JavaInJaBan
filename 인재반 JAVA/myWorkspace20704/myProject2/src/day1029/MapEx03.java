package day1029;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * <MAP 인터페이스>
 * : 키(Key)-값(Value) 쌍으로 원소를 저장
 *   ==> 키(값을 찾는데 도와주는 것) : 중복X
 *       값 : 중복O
 * - 특정 키워드로 검색을 할때 많이 사용
 * - 구현클래스 : HashMap, TreeMap
 *             (HashMap: 검색뛰어남, TreeMap:범위검색 또는 정렬)
 */
public class MapEx03 {//main class
 
	public static void main(String[] args) {
		//Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		//1. V put(K key, V value)
		map.put("사과", 5);
		map.put("바나나", 3);
		map.put("포도", 10);
		map.put("딸기", 1);
  
		//2. int size() Map에 저장된 원소의 개수
		System.out.println("과일종류: "+map.size()+"개");
  
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 과일 입력:");
		String input = sc.next();
		//★3. boolean containsKey(Object key)
		//★4. V get(Object key)
		if(map.containsKey(input)) {
			System.out.println(input+"이(가) "+map.get(input)+"개 있어요");
		}else {
			System.out.println(input+"은(는) 없어요");
		}	
  
		System.out.println("삭제할 과일 입력: ");
		input = sc.next();
		//5. V remove(Object key)
		if(map.containsKey(input)) {
			map.remove(input);
			System.out.println(input+"을(를) 삭제했어요");
		}else {
			System.out.println(input+"은(는) 없어요");
		}
		//★ Set<K> keySet() : Map에 저장된 모든 Key를 Set으로 반환
		//  for(String s:map) {
		//    안됨
		//  }
		for(String key:map.keySet()) {
			System.out.println(key+"/"+map.get(key)); //과일이름 , 갯수
		}
		//7. void clear()
		map.clear();
		System.out.println("모두 삭제했어요");
  
		//8. boolean isEmpty()
		System.out.println("비었나요?"+map.isEmpty());
		}//end of main method
 
}//end of main class 
