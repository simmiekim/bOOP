package a_basic;

public class Main {

	public static void main(String[] args) {
		
		// (1) 변수선언
		// (2) 객체생성 - new 이용
		Student h = new Student();

		h.name = "홍길동";
		h.kor = 100;
		h.eng = 88;
		h.math = 77;
		
		System.out.println(h.name+"님의 총점: " + h.calTotal());
		h.total = 300;
		System.out.println(h.name+"님의 평균: " + h.calAvg());
		
	}

}
