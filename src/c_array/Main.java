package c_array;

import java.util.Scanner;

public class Main {

	// 3명의 학생의 국영수 점수를 입력받어 총점과 평균 구하기
	
	// *********** 클래스 배열인경우
	//			배열도 new 객체 생성 필요
	//			클래스도 new 객체 생성 필요
	
	public static void main(String[] args) {

		Student [] s = new Student[3];
		
		Scanner input = new Scanner(System.in);

		for(int i=0; i<s.length; i++) {
			
			s[i] = new Student();
			
			System.out.println("이름->");
			s[i].setName( input.next() );
			System.out.println("국어->");
			s[i].setKor( input.nextInt() );
			System.out.println("영어->");
			s[i].setEng( input.nextInt());
			System.out.println("수학->");
			s[i].setMath( input.nextInt());
			
			System.out.println("총점:"+ s[i].calTotal());
			
			
		}
		
	}

}
