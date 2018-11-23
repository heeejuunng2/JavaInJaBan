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
			String string = "�޴��� �����ϼ���\n"
					+ "-------------------------\n"
					+ "1. �� �ܾ� ���\n"
					+ "2. �ܾ� �˻�\n"
					+ "3. ��� �ܾ� ����\n"
					+ "4. Quiz\n"
					+ "5. �����ϱ�";
			int num = Integer.parseInt(JOptionPane.showInputDialog
					(null, string,"�ܾ���",JOptionPane.PLAIN_MESSAGE));
			switch (num) {
			case 1:
				word_en=JOptionPane.showInputDialog(null,"�ܾ �Է��ϼ���","�Է�",JOptionPane.QUESTION_MESSAGE);
				word_kr=JOptionPane.showInputDialog(null,"���� �Է��ϼ���","�Է�",JOptionPane.QUESTION_MESSAGE);
				map.put(word_en, word_kr);
				break;
			case 2:
				String search=JOptionPane.showInputDialog(null,"�˻��� ����ܾ� �Է�","�Է�",JOptionPane.QUESTION_MESSAGE);
				if(map.containsKey(search)) {
					JOptionPane.showMessageDialog(null, "��: "+map.get(search), "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "�ܾ� ����", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				String str= "---�ܾ� ����Ʈ---\n";
				map.put("apple", "���");
				map.put("search", "ã��");
				map.put("shadow", "�׸���");
				map.put("crab", "��");
				map.put("refrigerator", "�����");
				map.put("chair", "����");
				map.put("clock", "�ð�");
				map.put("bowl", "�׸�");
				map.put("brick", "����");
				map.put("near", "�����");
				map.put("squid", "��¡��");
				map.put("spill", "��������");
				map.put("cheer", "�����ϴ�, ȯȣ�ϴ�");
				map.put("rack", "����, ��ħ��");
				
				for(String key : map.keySet()) {
					str+=key+":"+map.get(key)+"\n";
				}
				JOptionPane.showMessageDialog(null,str, "�޽���", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				int correct_count=0;
				int incorrect_count=0;
				int quiz = Integer.parseInt(JOptionPane.showInputDialog(null,"���� �� �Է�:","Quiz ��",JOptionPane.QUESTION_MESSAGE));
				int rnd = (int)(Math.random()*quiz);
				for(int i=0;i<quiz;i++) {
				
				String anw = JOptionPane.showInputDialog(null, map.get(rnd)+"?","���ܾ �Է�",JOptionPane.QUESTION_MESSAGE);
				if(anw.equals(map.keySet())) {
					correct_count++;
					JOptionPane.showMessageDialog(null, "����!!(�����:"+incorrect_count+")", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				}else {
					incorrect_count++;
					JOptionPane.showMessageDialog(null, "��!!(�����:"+incorrect_count+")\n����:"+map.keySet(),
							"�޽���", JOptionPane.INFORMATION_MESSAGE);
				}
					
				}//end of for
				JOptionPane.showMessageDialog(null, "������:"+quiz+"/�����:"+incorrect_count, "Quiz ���", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "�����մϴ�.", "�޽���", JOptionPane.PLAIN_MESSAGE);
				return;
			}//end of switch
		}//end of while

	}//end of main method

}//end of main class
