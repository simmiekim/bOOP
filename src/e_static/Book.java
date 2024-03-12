package e_static;

/*
 *   static
 *   	- 각 객체들끼리 공유
 *   	- 메모리 단 1개 생성
 *   
 *   	- 객체생성보다 먼저 생성
 *   	- 클래스명으로 접근
 */
public class Book {

	private static int count = 0;
	
	public Book(){
		count++;
		System.out.println("책 한권 생성");
	}
	
	public static int getCount() {
		return count;
	}
	
	
	
}
