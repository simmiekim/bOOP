package b_encapsulation;

/*
 *   캡슐화
 *   
 *   	기본적으로 	멤버변수는 private 지정
 *   				멤버메소드는 public 지정
 *   
 *   
 *   private 지정된 멤버는 접근하려면 setter/getter 필요
 *   
 *   this : 객체의 레퍼런스 
 *   		멤버를 접근할 때 사용
 */
public class Student {

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;

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