package day04;
/*
 * switch(변수){
 * 		case 리터럴: //리터럴은 그냥 값
 * 		case 리터럴:
 * 		default
 * 		}
 */
public class Work03 {// main class
	public static void main(String[] args) {
		//int rnd=(int)(Math.random()*3)+8; //8~10
		int rnd=8;
		
		switch(rnd){
		case 8:
			//System.out.println("퇴근중");
			//break;
		case 9:
			System.out.println("근무중");
			break;
		case 10:
			System.out.println("외근중");
			break;
		default:
			System.out.println("놀아요");
			break;
		}//end of switch
	}//end of main method
}//end of Work03 class
