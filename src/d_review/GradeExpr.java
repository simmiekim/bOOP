package d_review;

public class GradeExpr {

	// 멤버변수
	int[] jumsu;
	
	// 생성자
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	// 멤버함수
	double getAverage() {
		int total = getTotal();
		return total/jumsu.length;
		// return getTotal()/jumsu.length;
	}
	

	int getTotal() {
		int total = 0;		
		for(int i=0; i<jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	
	int getGoodScore() {
		return 0;
	}

	int getBadScore() {
		return 0;
	}
}
