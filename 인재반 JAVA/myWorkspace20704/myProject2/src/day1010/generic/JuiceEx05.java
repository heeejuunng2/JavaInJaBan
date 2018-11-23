package day1010.generic;
/*
 * <지네릭 메서드>
 * : 메서드의 선언부에 지네릭 타입이 선언된 메서드
 *   (메서드 반환타입 바로 앞에 선언)
 *  주의! 지네릭클래스에 정의된 타입변수와 지네릭메서드에 정의된 타입변수는 별개!!
 */
class Juice{
	String name; //주스 이름
	Juice(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name+"Juice";
	}
}//end of Juice class

class Juicer{
	//static멤버에는 타입변수<T> 사용 불가
	//아에 지네릭 적용하지 않거나 타입변수 대신 특정 타입을 지정해줘야함
	static Juice makeJuice(FruitBox<Fruit> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box객체 list에 들어있는 객체 연결해서 출력*/
	}
	//매개변수로 Apple의 FruitBox객체를 받도록 makeJuice()를 오버로딩 => 불가능
	// ==> 지네릭이 다른것으로는 오버로딩 성립 X
//	static Juice makeJuice(FruitBox<Apple> box){
//		String tmp="";
//		for(Fruit f : box.getList()) {
//			tmp+=f+" "; //Apple Grape 
//		}
//		return new Juice(tmp);
//		/*box객체 list에 들어있는 객체 연결해서 출력*/
//	}
	static Juice makeJuice2(FruitBox<? extends Fruit> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box객체 list에 들어있는 객체 연결해서 출력*/
	}
	/*
	 * 와일드 카드
	 * <? extends T> : T와 그 자손들만 가능
	 * <? super T> : T와 그 조상들만 가능
	 * <?> : 모든 타입이 가능, <T> 또는 <? extends Object>와 동일
	 */
	
	//makeJuice()를 지네릭메서드로 변경
	//static멤버에 타입변수 사용X but 지네릭타입을 선언하고 T사용 가능
	static <T extends Fruit>Juice makeJuice3(FruitBox<T> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box객체 list에 들어있는 객체 연결해서 출력*/
	}
	
	
}//end of Juicer class

public class JuiceEx05 {//main class

	public static void main(String[] args) {

		
	}//end of main method

}//end of main class
