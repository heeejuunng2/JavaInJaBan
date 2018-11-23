package day19;

public class Work04 {//main class

	public static void main(String[] args) {
		String str="ABC";
		//<String 클래스의 주요메서드>
		//1. char charAt(int index)
		//   index번 문자를 반환
		char ch=str.charAt(1); //인덱스는 0부터
		System.out.println(ch); //B
		
		//2. boolean contains(String word)
		//   이 문자열에 word가 포함됬나?
		String str2="피카츄, 라이츄, 파이리, 꼬부기";
		boolean bool= str2.contains("피츄");
		System.out.println(bool); //flase
		
		//3. boolean endsWith(String word)
		//   boolean startWith(String word)
		String email="ssn@naver.com";
		System.out.println(email.endsWith(".com")); //true
		
		//4. boolean equalsIgnoreCase(String word)
		//   대소문자 구분없이 같은지 다른지를 확인
		System.out.println("Exit".equalsIgnoreCase("exit")); //true
		
		//5. int indexOf(String word)
		//   int indexOf(String word, int fromIndex)
		System.out.println(email.indexOf("v")); //6
		System.out.println(email.indexOf("v", 4)); //6
		
		//6. int lastIndexOf(String word)
		//   : 중복된 단어일 경우 마지막 word의 시작 인덱스
		String str3="JAVA A JAVA B JAVA C";
		System.out.println(str3.indexOf("JAVA")); //0
		System.out.println(str3.lastIndexOf("JAVA")); //14
		
		//7. int length() : 글자수
		//   배열은 length 이고 스트링은 length 뒤에 () 붙음 메소드니까
		System.out.println(str3.length()+"문자");
		
		//8. String replace(String old, String new)
		//   old를 new로 대체한 문자열을 반환한다
		String str4=str3.replace("JAVA", "C");
		System.out.println(str4);
		
		//9. String[] split(String regex)
		//    regex(정규표현식)을 기준으로 문자열을 쪼개서
		//    String 배열에 담아서 반환
		String[] s=str4.split("C");
		for(String ss:s){
			System.out.println(ss);
		}
		String str5="피카츄#라이츄@파이리#푸린@또도가스";
		s=str5.split("#|@"); //#또는 @기준으로 쪼개라
		for(String ss:s){
			System.out.println(ss);
		}
		
		//10. String subString(int fromIndex)
		//	  String subString(int fromIndex,int endIndex)
		//fromIndex부터 endIndex '전' 까지 자름
		System.out.println(email.substring(4));
		System.out.println(email.substring(0, 2));
		
		//11. char[] toCharArray()
		//    문자열을 char형 배열로 만듬
		char[] chs=email.toCharArray();
		for(char c:chs){
			System.out.println(c);
		}
		
		//12. String toLowerCase(): 소문자로
		//	  String toUpperCase(): 대문자로
		System.out.println(email.toUpperCase());
		
		//13. String trim()
		//문자열이 양쪽 공백이 잇을 경우, 공백을 적제
		//ID를 입력하는 부분에서 입력한 ID의 공백을 삭제할때 사용
		System.out.println(" ABC".trim());
		
		//14. static String valueOf(다 들어옴)
		//들어온 데이터를 String으로 변환(파싱형태)
		//parsing : "3.14" => 3.14
		//valueOf : 3.14=>"3.14"
		String str6=String.valueOf(3.14);
		System.out.println(str6);
		
	}//main method

}//Work04 class
