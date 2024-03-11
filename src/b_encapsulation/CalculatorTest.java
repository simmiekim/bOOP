package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		CalculatorExpr expr = new CalculatorExpr(); 

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력->");
		int su1 = input.nextInt();
		int su2 = input.nextInt();
	
		//expr.num1 = su1;
		expr.setNum1(su1);
		expr.setNum2(su2);
		
		System.out.println("덧셈: " + expr.getAddtion());
	}

}
