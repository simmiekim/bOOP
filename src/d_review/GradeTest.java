package d_review;

public class GradeTest {

	public static void main(String[] args) {
		
		// 추후에 입력값으로 처리
		int [] jumsu = new int[3];
		jumsu[0] = 100; 
		jumsu[1] = 90;
		jumsu[2] = 80;

		GradeExpr expr = new GradeExpr(jumsu);
		
		System.out.println("총점:"+ expr.getTotal());
		System.out.println("평균:"+ expr.getAverage());
	}

}
