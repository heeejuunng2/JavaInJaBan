package day15;

public class PersonArr {//main class
	
	public static void main(String[] args) {
		//Person ��ü 3ĭ �迭 ����
		//����1.
		Person[] p=new Person[3];
		//��ü �����ؼ� ��������� ���� ���� ==> Ȯ�� for�� �Ұ���
		for(int i=0;i<p.length;i++){
			p[i]=new Person();
			p[i].input();
		}
		//��ü�迭�� ������ �о���� ==> ��Ȯ��for�� ���ɡ�
		for(Person tmp:p){
			tmp.show();
		}
		
		//����2.
		Person[] p2={new Person(), new Person(), new Person()};
		
		
	}//main method
	
}//PersonArr calss
