package d_constructor2;

/*
	생성자함수 ( constructor )
		- 클래스의 멤버값을 초기화 할 때 사용
		
		- 클래스가 객체화(인스턴스화)될 때 실행되는 함수 : new 사용시
		
		- 클래스명과 동일 이름이여야 함 
		   +
		  리턴형이 없음 (void도 있으면 안됨 )
		
		- 오버로딩 가능(overloading)
			-> 매개변수의 타입과 갯수가 다른 동일한 이름의 함수들

[참고]
	class A {
		int A = 10;
		void A() {  일반함수 }
		A() { 생성자함수 }
	}
	
	[참고] 기본생성자함수 : default constructor
	
		` 생성자함수가 한 개도 없는 경우 자동으로 추가됨
			
			Student() { }
	
		` 습관처럼 기본적으로 만듭니다
	
	
	
 ******
 * this : 객체의 멤버를 지칭하기 위해
 
   this() : 다른 생성자 호출	
	
			-> 맨 첫 줄에 기술해야 함
			
 */
public class Student {

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;

	// default constructor
	Student(){
//		this.name = "이름없음";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;

		this("이름없음", 50,50,50);
		
		System.out.println("기본생성자");
	}
	 
	// constructor
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자생성자");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	public double calAvg() {
		avg = (double)total / 3;
		return avg;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter


	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}

/*
	멤버변수(member fields) : 서로 다른 데이타타입의 변수들
	멤버함수(member methods) : 멤버변수를 처리하는 역할
*/