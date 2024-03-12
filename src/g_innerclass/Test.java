package g_innerclass;

class Outer{
	
	static class Inner {
		static void najaba() {
			System.out.println("잡아보슈~");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// [1]
//		Outer o = new Outer();
//		Outer.Inner in = o.new Inner();
//		in.najaba();
		
		// [2]
		//Outer.Inner in = new Outer.Inner();
		//in.najaba();
		
		// [3]
		Outer.Inner.najaba();
	}

}
