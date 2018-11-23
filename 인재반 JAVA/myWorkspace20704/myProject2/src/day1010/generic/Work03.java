package day1010.generic;

class Shop<T,M>{
	private T kind;
	private M model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
class Car{
	
}
public class Work03 {//main class

	public static void main(String[] args) {
		Shop<Car,String> s = new Shop<>();
		//kind = Car, model = String
		
		s.setKind(new Car());
		s.setModel("K series");
		
		Car car = s.getKind(); //형변환 필요 X
		String model = s.getModel(); 
		
	}//end of main method

}//end of main class
