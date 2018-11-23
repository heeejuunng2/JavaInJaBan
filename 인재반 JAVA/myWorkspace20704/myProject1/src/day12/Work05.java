package day12;
/*
 * 부모: Book
 *  -필드:title(책이름),price(가격)
 * 자식1: Novel
 *  -필드:title,price,writer,publisher(출판사)
 * 자식2: Comic
 *  -필드:title,price,writer,hero,publisher(출판사)
 * 자식3: Textbook
 *  -필드:title,price,subject
 * 
 * 1. 4개 클래스에 모든 정보를 출력하는 String show()메소드를 만드세요
 * 	  (오버라이드 이용)
 * 2. 생성자를 만드세요
 * 	  -기본생성자
 *    -모든 필드를 매개변수로 하는 생성자
 */
class Book{
	String title;
	int price;
	
	Book(){
		
	}
	Book(String title,int price){
		this.title=title;
		this.price=price;
	}
	String show(){
		return "제목:"+title+"\n가격:"+price;
	}
}

class Novel extends Book{
	String writer;
	String publisher;
	
	Novel(){
		
	}
	Novel(String title,int price,String writer,String publisher){
		super(title,price);
		this.writer=writer;
		this.publisher=publisher;
	}
	@Override
	String show() {
		return super.show()+"\n저자:"+writer+"\n출판사:"+publisher;
	}
}

class Comic extends Novel{
	String hero;
	
	Comic(){
		
	}
	Comic(String title,int price,String writer,String publisher,String hero){
		super(title,price,writer,publisher);
		this.hero=hero;
	}
	@Override
	String show() {
		return super.show()+"\n저자:"+writer+"\n영웅이름:"+hero+"\n출판사:"+publisher;
	}
}

class Textbook extends Book{
	String subject;
	
	Textbook(){
		
	}
	Textbook(String title,int price,String subject){
		super(title,price);
		this.subject=subject;
	}
	@Override
	String show() {
		return super.show()+"\n과목:"+subject;
	}
}

public class Work05 {//main class
	
	public static void main(String[] args) {
		
	}//main method
	
}//Work05 class
