package day1022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Board{ //�Խ��� ���� ��üȭ ��Ű�°�
	String title;
	String content;
	String writer;
	
	Board(String title,String writer,String content){
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	@Override
	public String toString() {
		return title+" / "+writer+" / "+content;
	}
	
}//end of Board class

public class BoardEx03 {//main class

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("����� ���� ��� �ȳ���","���ǽ�","�����ϼ���"));
		list.add(new Board("4������� �ȳ���","����ĺ�","������ϼ���"));
		list.add(new Board("10�� �޽�ǥ","������","���̵弼��"));
		list.add(new Board("����","OO��Ʈ","�������Դϴ�"));
		list.add(new Board("�������� ����","�л���","���������ϼ���"));
		list.add(new Board("3�г� �����ٹ��� ����","3�г��","�����ٹ��� ������"));
		list.add(new Board("10�� ���Ǽҽ���","���ǽ�","�ǰ��ϼ���"));
		list.add(new Board("����","OO��Ʈ","�������Դϴ�"));
		
		int count=0;
		System.out.println("=====������Ź�=====");
		for(Board b : list) {
			count++;
			System.out.println(count+". "+b.toString());
		}
		
		System.out.println("=====����� ����=====");
		boolean check = false;
//***!!!)Ȯ�� for������ ������ ���� �߻� ==> Iterator��� �ʼ�
//		for(Board b : list) {
//			if(b.title.equals("����")) {
//				check = true;
//				list.remove(b);
//				break;
//			}
//		}
		
		/*
		 * <Iterator �޼ҵ�>
		 * 1. hasnext()
		 * 2. next()
		 * 3. remove()
		 */
		Iterator<Board> it = list.iterator();
		while(it.hasNext()) {
			Board b = it.next();
			if(b.title.equals("����")) {
				it.remove();
				check = true;
			}
		}
		
		if(!check) {
			System.out.println("���� �����ϴ�.");
		}
//		count=0;
//		for(Board b : list) {
//			count++;
//			System.out.println(count+". "+b.toString());
//		}
		it = list.iterator();
		count=0;
		while(it.hasNext()) {
			Board b = it.next();
			count++;
			System.out.println(count+". "+b.toString());
		}
		
		//���ǽ��� �ۼ��� �۸� ����غ���
		//���� ���!
		System.out.println("=====�ۼ��� :���ǽ�=====");
		it = list.iterator();
		count=0;
		while(it.hasNext()) {
			Board b = it.next();
			if(b.writer.equals("���ǽ�")) {
				count++;
				System.out.println(count+". "+b.toString());
			}
		}
		
		
	}//end of main method

}//end of main class
