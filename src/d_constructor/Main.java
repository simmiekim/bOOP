package d_constructor;

/*	
 * 	변수선언	int a ;
 *  값지정		a = 10;
 * 		
 * 	변수초기화	int a = 10;
 * 
 *  --------------------------
 *  
 */
public class Main {

	public static void main(String[] args) {
		
		
		// (1) 변수선언 + 객체생성 - new 이용
		Student h = new Student();

		// (2) 값지정
//		h.setName("홍길동");
//		h.setKor(100);
//		h.setEng(88);
//		h.setMath(77);
		
		
		// 클래스(=객체) 초기화
		// 변수선언 + 값지정
		// Student h = new Student("홍길동", 100, 88, 77);
		
		
		
		System.out.println(h.getName()+"님의 총점: " + h.calTotal());
		//h.total = 300;
		System.out.println(h.getName()+"님의 평균: " + h.calAvg());
		
	}

}
