package day1105;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Assignment {//main class

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		String word_en,word_kr;
		
		while(true) {
			String string = "메뉴를 선택하세요\n"
					+ "-------------------------\n"
					+ "1. 새 단어 등록\n"
					+ "2. 단어 검색\n"
					+ "3. 모든 단어 보기\n"
					+ "4. Quiz\n"
					+ "5. 종료하기";
			int num = Integer.parseInt(JOptionPane.showInputDialog
					(null, string,"단어장",JOptionPane.PLAIN_MESSAGE));
			switch (num) {
			case 1:
				word_en=JOptionPane.showInputDialog(null,"단어를 입력하세요","입력",JOptionPane.QUESTION_MESSAGE);
				word_kr=JOptionPane.showInputDialog(null,"뜻을 입력하세요","입력",JOptionPane.QUESTION_MESSAGE);
				map.put(word_en, word_kr);
				break;
			case 2:
				String search=JOptionPane.showInputDialog(null,"검색할 영어단어 입력","입력",JOptionPane.QUESTION_MESSAGE);
				if(map.containsKey(search)) {
					JOptionPane.showMessageDialog(null, "뜻: "+map.get(search), "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "단어 없음", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				String str= "---단어 리스트---\n";
				map.put("apple", "사과");
				map.put("search", "찾다");
				map.put("shadow", "그림자");
				map.put("crab", "게");
				map.put("refrigerator", "냉장고");
				map.put("chair", "의자");
				map.put("clock", "시계");
				map.put("bowl", "그릇");
				map.put("brick", "벽돌");
				map.put("near", "가까운");
				map.put("squid", "오징어");
				map.put("spill", "엎지르다");
				map.put("cheer", "응원하다, 환호하다");
				map.put("rack", "선반, 받침대");
				
				for(String key : map.keySet()) {
					str+=key+":"+map.get(key)+"\n";
				}
				JOptionPane.showMessageDialog(null,str, "메시지", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				int correct_count=0;
				int incorrect_count=0;
				int quiz = Integer.parseInt(JOptionPane.showInputDialog(null,"퀴즈 수 입력:","Quiz 수",JOptionPane.QUESTION_MESSAGE));
				int rnd = (int)(Math.random()*quiz);
				for(int i=0;i<quiz;i++) {
				
				String anw = JOptionPane.showInputDialog(null, map.get(rnd)+"?","영단어를 입력",JOptionPane.QUESTION_MESSAGE);
				if(anw.equals(map.keySet())) {
					correct_count++;
					JOptionPane.showMessageDialog(null, "정답!!(오답수:"+incorrect_count+")", "메시지", JOptionPane.INFORMATION_MESSAGE);
				}else {
					incorrect_count++;
					JOptionPane.showMessageDialog(null, "땡!!(오답수:"+incorrect_count+")\n정답:"+map.keySet(),
							"메시지", JOptionPane.INFORMATION_MESSAGE);
				}
					
				}//end of for
				JOptionPane.showMessageDialog(null, "문제수:"+quiz+"/오답수:"+incorrect_count, "Quiz 결과", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "종료합니다.", "메시지", JOptionPane.PLAIN_MESSAGE);
				return;
			}//end of switch
		}//end of while

	}//end of main method

}//end of main class
