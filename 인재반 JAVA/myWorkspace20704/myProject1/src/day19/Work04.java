package day19;

public class Work04 {//main class

	public static void main(String[] args) {
		String str="ABC";
		//<String Ŭ������ �ֿ�޼���>
		//1. char charAt(int index)
		//   index�� ���ڸ� ��ȯ
		char ch=str.charAt(1); //�ε����� 0����
		System.out.println(ch); //B
		
		//2. boolean contains(String word)
		//   �� ���ڿ��� word�� ���ԉ糪?
		String str2="��ī��, ������, ���̸�, ���α�";
		boolean bool= str2.contains("����");
		System.out.println(bool); //flase
		
		//3. boolean endsWith(String word)
		//   boolean startWith(String word)
		String email="ssn@naver.com";
		System.out.println(email.endsWith(".com")); //true
		
		//4. boolean equalsIgnoreCase(String word)
		//   ��ҹ��� ���о��� ������ �ٸ����� Ȯ��
		System.out.println("Exit".equalsIgnoreCase("exit")); //true
		
		//5. int indexOf(String word)
		//   int indexOf(String word, int fromIndex)
		System.out.println(email.indexOf("v")); //6
		System.out.println(email.indexOf("v", 4)); //6
		
		//6. int lastIndexOf(String word)
		//   : �ߺ��� �ܾ��� ��� ������ word�� ���� �ε���
		String str3="JAVA A JAVA B JAVA C";
		System.out.println(str3.indexOf("JAVA")); //0
		System.out.println(str3.lastIndexOf("JAVA")); //14
		
		//7. int length() : ���ڼ�
		//   �迭�� length �̰� ��Ʈ���� length �ڿ� () ���� �޼ҵ�ϱ�
		System.out.println(str3.length()+"����");
		
		//8. String replace(String old, String new)
		//   old�� new�� ��ü�� ���ڿ��� ��ȯ�Ѵ�
		String str4=str3.replace("JAVA", "C");
		System.out.println(str4);
		
		//9. String[] split(String regex)
		//    regex(����ǥ����)�� �������� ���ڿ��� �ɰ���
		//    String �迭�� ��Ƽ� ��ȯ
		String[] s=str4.split("C");
		for(String ss:s){
			System.out.println(ss);
		}
		String str5="��ī��#������@���̸�#Ǫ��@�ǵ�����";
		s=str5.split("#|@"); //#�Ǵ� @�������� �ɰ���
		for(String ss:s){
			System.out.println(ss);
		}
		
		//10. String subString(int fromIndex)
		//	  String subString(int fromIndex,int endIndex)
		//fromIndex���� endIndex '��' ���� �ڸ�
		System.out.println(email.substring(4));
		System.out.println(email.substring(0, 2));
		
		//11. char[] toCharArray()
		//    ���ڿ��� char�� �迭�� ����
		char[] chs=email.toCharArray();
		for(char c:chs){
			System.out.println(c);
		}
		
		//12. String toLowerCase(): �ҹ��ڷ�
		//	  String toUpperCase(): �빮�ڷ�
		System.out.println(email.toUpperCase());
		
		//13. String trim()
		//���ڿ��� ���� ������ ���� ���, ������ ����
		//ID�� �Է��ϴ� �κп��� �Է��� ID�� ������ �����Ҷ� ���
		System.out.println(" ABC".trim());
		
		//14. static String valueOf(�� ����)
		//���� �����͸� String���� ��ȯ(�Ľ�����)
		//parsing : "3.14" => 3.14
		//valueOf : 3.14=>"3.14"
		String str6=String.valueOf(3.14);
		System.out.println(str6);
		
	}//main method

}//Work04 class
