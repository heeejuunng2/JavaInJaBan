package day0907;
/*
 * <API(Application Programming Interface)>
 * =라이브러리
 */
public class Api {//main class

	public static void main(String[] args) {
		String str="ABCDE";
		//1. char charAt(int indax)
		char ch=str.charAt(1);
		System.out.println(ch); //B
		
		//2. boolean contains(String word)
		System.out.println(str.contains("CD")); //True
		
		//3. boolean endsWith(String word)
		System.out.println(str.endsWith("AB")); //False
		System.out.println(str.startsWith("AB")); //True
		
		//4. boolean equalsIgnoreCase(String word) ->대소문자 구분 X
		System.out.println("Exit".equalsIgnoreCase("EXIT")); //true
		System.out.println("EXit".equals("EXIT")); //false
		
		//5. int indexOf(String word)
		System.out.println(str.indexOf("C")); //2
		System.out.println(str.indexOf("B", 3));//-1
		
		//6. int lastIndexof(String word)
		String str2="java a java b java c";
		System.out.println(str2.indexOf("java")); //0
		System.out.println(str2.lastIndexOf("java")); //14
		
		//7. int length()
		System.out.println("jammanbo".length()); 
		
		//8. String replace(String old,String new)
		System.out.println(str.replace("AB", "ab"));
		//str="abCDE"
		
		//9. String[] split(String regex)
		String[] s=str2.split("java");
		for(String ss:s){
			System.out.println(ss);
		}
		
		//10.String subString(int fromIndex0)
		//   String subString(int fromIndex, int endIndex)
		//	                                                           포함,  미포함
		System.out.println("java".substring(1, 2));
		
		//11. char[] toCharArray() : 문자열을 char 배열로 바꿔줌
		char[] chs=str.toCharArray();
		for(char c:chs){
			System.out.print(c+"/");
		}
		
		System.out.println();
		//12. String toLowerCase():소문자
		//    String toUpperCase():대문자
		//13. String trim: 문자열 양쪽 공백을 삭제
		//14. static String valueOf(모든 타입)
		//들어온 데이터를 String으로 변환
		String str4=String.valueOf(3.14);
		System.out.println(str4);
		
		
	}//end of main method

}//end of Api class
