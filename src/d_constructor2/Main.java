package d_constructor2;

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
		
		
		
		Student h = new Student();

		//Student h2 = new Student("홍길동", 100, 88, 77);		
		
		
		System.out.println(h.getName()+"님의 총점: " + h.calTotal());
		System.out.println(h.getName()+"님의 평균: " + h.calAvg());
		
		//System.out.println(h2.getName()+"님의 총점: " + h2.calTotal());
		//System.out.println(h2.getName()+"님의 평균: " + h2.calAvg());
		
	}

}
