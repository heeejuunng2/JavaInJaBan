package day17;
/*
 * <Quiz01>
 * 아래 클래스들의 공통된 부분을 뽑아내어 Elem 추상클래스를 만들자
 * ! 추상화 : 클래스들의 공통점을 찾아 부모 클래스를 만드는 것
 *    <-> 구체화 : 상속통해 자식 클래스 구현
 * 1) class Soldier{ //보병
 * 		int x, y; //현재위치
 * 		void move(int x, int y){ //지정된 위치 이동}
 * 		void stop(){ //현재 위치에 정지}
 * 		void stimPack(){ //스팀팩 사용}
 * }
 * 2) class Marine{ //해병
 * 		int x, y; //현재 위치
 * 		void move(int x, int y){ //지정된 위치 이동}
 * 		void stop(){ //현재 위치에 정지}
 * 		void changeMode(){ //공격모드 변환}
 * }
 * 3) class Dropship{ //수송선
 * 		int x, y; //현재위치
 * 		void move(int x, int y){ //지정된 위치 이동}
 * 		void stop(){ //현재 위치에 정지}
 * 		void load(){ //선택대상을 태운다}
 * 		void unload(){ //선택대상을 내린다}
 * }
 */
abstract class Elem{
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}
class Soldier extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("보병 출동");
	}
	void stop(){
		System.out.println("현재 위치에 멈춤");
	}
	void stimPack(){
		System.out.println("스팀백 사용");
	}
	@Override
	public String toString() {
		return "보병";
	}
}//Soldier class

class Marine extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("해병 출동");
	}
	void stop(){
		System.out.println("현재 위치에 멈춤");
	}
	void changeMode(){
		System.out.println("공격모드 전환");
	}
	@Override
	public String toString() {
		return "해병";
	}
}
class Dropship extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("수송선 출발");
	}
	void stop(){
		System.out.println("현재 위치에 멈춤");
	}
	void load(){
		System.out.println("태움");
	}
	void unload(){
		System.out.println("내림");
	}
	@Override
	public String toString() {
		return "수송선";
	}
}
public class Quiz01 {//main class

	public static void main(String[] args) {
		Elem[] group = new Elem[] {new Marine(), new Soldier(), new Dropship()};
		
		for(Elem e:group){
			e.move(200, 100);
			System.out.println(e);
		}
		
		Object[] ob={new Marine(),new Soldier(),new Dropship()};
		
		for(Object obj:ob){
			System.out.println(obj);
			//obj.move(200,100); 
			//Object 클래스에는 move가 없기때문에 안됨
		}

	}//main method

}//Quiz01 class
