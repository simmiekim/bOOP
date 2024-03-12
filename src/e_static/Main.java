package e_static;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("책 갯수=" + Book.getCount());
		
		Book b2 = new Book();
		System.out.println("책 갯수=" + Book.getCount());
		
		Book b3 = new Book();		
		System.out.println("책 갯수=" + Book.getCount());
		
		//System.out.println("책 갯수=" + Book.count);
	}

}
