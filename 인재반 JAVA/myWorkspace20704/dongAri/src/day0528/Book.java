package day0528;
/*
 * 부모:Book
 * -필드:title(책이름),price
 * 자식1:Novel
 * -필드:title
 */

public class Book{
	public String titel;
	public int price;
	
	public Book(){
		
	}
	
	public Book(String title,int price){
		this.titel=title;
		this.price=price;
	}
	public String show(){
		return "제목:"+titel+"\n가격:"+price;
	}
}//Book class

class Novel extends Book{
	String writer,publisher;
	
	Novel(){
		
	}
	Novel(String title,int price,String witer,String publisher){
		super(title,price);
		this.writer=writer;
		this.publisher=publisher;
	}
	@Override
	public String show() {
		return super.show()+"\n저자:"+writer+"\n출판사:"+publisher;
	}
}//Novel class

class Comic extends Novel{
	String hero;
	
	Comic(){
		
	}
	Comic(String title,int price,String witer,String publisher,String hero){
		super(title,price,witer,publisher);
		this.hero=hero;
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"\n영웅:"+hero;
	}
}//Comic class

class Textbook extends Book{
	String subject;
	
	Textbook(){
		
	}
	Textbook(String title,int price,String subject){
		super(title,price);
		this.subject=subject;
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"\n과목:"+subject;
	}
}//Textbook class

