package i_inherit;

public class Test {

	public static void main(String[] args) {
		
//		Umma u = new Umma();
//		u.gene();
//		u.job();
		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
//		d.job();

		// ** 부모변수에 자식객체 생성
		Umma u2 = new Ddal();
		u2.job();
		//u2.study();
		//***********
		u2.gene();
		
		// 자식변수에 부모객체???
		// Ddal d2 = new Umma();
		
	}

}



/*
 	  int  a = 100;		(O)
 	  	
 	  double b = 3.6;	(O)
 	  
 	  double c = 100; 	(O)
 	  
 	  int d = 3.6;		(X)
 	  int d = (int)3.6;	
 	  
 	  
 	  
 	  
 	  
 */ 
