package day1022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Board{ //게시판 글을 객체화 시키는것
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
		
		list.add(new Board("사랑의 헌혈 행사 안내문","보건쌤","헌혈하세요"));
		list.add(new Board("4차방과후 안내문","방과후부","방과후하세요"));
		list.add(new Board("10월 급식표","영양사쌤","많이드세요"));
		list.add(new Board("광고","OO마트","세일중입니다"));
		list.add(new Board("학폭실태 조사","학생부","조사참여하세요"));
		list.add(new Board("3학년 졸업앨범비 납부","3학년부","졸업앨범비 내세요"));
		list.add(new Board("10월 보건소식지","보건쌤","건강하세요"));
		list.add(new Board("광고","OO마트","세일중입니다"));
		
		int count=0;
		System.out.println("=====가정통신문=====");
		for(Board b : list) {
			count++;
			System.out.println(count+". "+b.toString());
		}
		
		System.out.println("=====광고글 삭제=====");
		boolean check = false;
//***!!!)확장 for문에서 삭제시 에러 발생 ==> Iterator사용 필수
//		for(Board b : list) {
//			if(b.title.equals("광고")) {
//				check = true;
//				list.remove(b);
//				break;
//			}
//		}
		
		/*
		 * <Iterator 메소드>
		 * 1. hasnext()
		 * 2. next()
		 * 3. remove()
		 */
		Iterator<Board> it = list.iterator();
		while(it.hasNext()) {
			Board b = it.next();
			if(b.title.equals("광고")) {
				it.remove();
				check = true;
			}
		}
		
		if(!check) {
			System.out.println("광고가 없습니다.");
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
		
		//보건쌤이 작성한 글만 출력해보자
		//복자 사용!
		System.out.println("=====작성자 :보건쌤=====");
		it = list.iterator();
		count=0;
		while(it.hasNext()) {
			Board b = it.next();
			if(b.writer.equals("보건쌤")) {
				count++;
				System.out.println(count+". "+b.toString());
			}
		}
		
		
	}//end of main method

}//end of main class
