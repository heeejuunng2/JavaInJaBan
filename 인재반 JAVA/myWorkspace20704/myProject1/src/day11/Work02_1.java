package day11;

public class Work02_1 {
	//Work02와 같은 패키지, 다른 클래스
	
	public static void main(String[] args) {
	 //public,default,protected 접근 가능
		Work02 w=new Work02();
		System.out.println(w.s1+w.s2+w.s3);
		w.m1();
		w.m2();
		w.m3();
	}

}
