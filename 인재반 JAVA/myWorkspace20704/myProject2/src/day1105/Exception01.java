package day1105;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/*
 * <프로그램의 오작동, 비정상적인 종료>
 * 1. 에러(error): 개발자가 해결 못함
 * 2. 예외(exception): 개발자가 해결할 수 있음
 * 
 * <예외 클래스>
 * : 실행시 발생가능한 오류(Error, Exception)을 클래스로 정의
 *   1. Exception 클래스 : 사용자의 실수 ==> 예외처리 꼭
 *      - printStackTrace() : 콘솔창에 빨간 줄 뜨면서 강제종료
 *      -> 예외처리를 안하면, 디폴트로 실행되는 메소드
 *   2. RuntimeException 클래스 : 프로그래머의 실수 ==> 예외처리가 강제는 아님
 *   
 * <1. try~catch 블록>
 *   주의사항! - try블록안에서는 변수를 선언하지 않는다!!
 *           - try블록안에서 에러발생시, 에러발생지점 다음 문장은 실행X
 *           - Exception 처리하는 catch블록은 가장 마지막에 선언하다
 *             (앞에두면 데드코드됨)
 * <2. throws 선언>
 *   :메소드 내부에서 예외가 발생할 수 있는 부분에 try~ catch를 하는것이 기본이지만,
 *     경우에 따라서 메소드를 호출한 곳으로 예외를 떠넘긴다.
 *   유의 사항!! 부모가 가진 예외보다  더 많은 예외 선언 불가
 *             (수의 개념이 아닌 범위의 개념)
 */
class Parent{
	void parentMethod() throws IOException, SQLException{
		
	}
}//end of Parent class

class Child extends Parent{
	@Override
	void parentMethod() throws  IOException, SQLException { 
		//부모가 가진 예외보다 더 많이 선언 불가, 범위 더 큰거 선언 불가
		super.parentMethod();
	}
}

public class Exception01 {//main class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두개의 수를 입력받아서 나누기한다음에 몫 출력
		int n1=1, n2=1, result=0;
		try {
			System.out.println("첫번째 수를 입력하세요:");
			n1 = sc.nextInt();
			System.out.println("두번째 수를 입력하세요:");
			n2 = sc.nextInt();
			System.out.println("두 수를 나눕니다.");
			result = n1/n2;
			System.out.println("출력될까?");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요:");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		}catch(Exception e) {
			System.out.println("돌발상황 발생");
		} //Exeption은 맨 마지막에 해야함 !
		  finally {
				System.out.println("몫:"+result);
				System.out.println("종료합니다.");
		}//선택사항, 
		
	
	}//end of main method

}//end of main class
