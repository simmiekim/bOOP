package a_basic;

public class Student {

	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
}

/*
	멤버변수(member fields) : 서로 다른 데이타타입의 변수들
	멤버함수(member methods) : 멤버변수를 처리하는 역할
*/