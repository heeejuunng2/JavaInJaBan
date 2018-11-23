package day1010;

class Box{
	private Object object; //모든 종류의 객체를 담을수 있다

	public void setObject(Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
	
}//end of Box class

public class Work01 {//main class

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("또가스"); //String이 Object로 바뀜 ==>업캐스팅
		
		String str=(String)box.getObject(); //Object -> String ==>다운캐스팅
		
		box.setObject(new Fruit("사과"));
		
		//"박스의 내용:사과"출력
		System.out.println("박스의 내용:"+((Fruit)box.getObject()).name);
		
		box.setObject(10); //객체 10임 숫자 10 ㄴㄴ Integer->Object
		
		int num = ((Integer)box.getObject());
		
		System.out.println("박스의 내용:"+num);
	}//end of main method

}//end of main class