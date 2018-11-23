package day0528;
/*
 * �θ�:Book
 * -�ʵ�:title(å�̸�),price
 * �ڽ�1:Novel
 * -�ʵ�:title
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
		return "����:"+titel+"\n����:"+price;
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
		return super.show()+"\n����:"+writer+"\n���ǻ�:"+publisher;
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
		return super.show()+"\n����:"+hero;
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
		return super.show()+"\n����:"+subject;
	}
}//Textbook class

