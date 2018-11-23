package day1024;

public class Test02 {//main class

	public static void main(String[] args) {
		//hashcode는 객체가 저장된 위치를 의미
		//객체의 주소값을 이용해서 만들기 때문에
		//모든 객체는 같은 해시코드x
		
		Pokemon p = new Pokemon("푸린",2,100);
		System.out.println(p.hashCode());
		
		Pokemon p2 = new Pokemon("푸린",2,100);
		System.out.println(p2.hashCode());
		
		System.out.println(p.equals(p2)); //false
	}//end of main method

}//end of main calss
