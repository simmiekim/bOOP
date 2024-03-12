package i_inherit2;

public class Dvd extends Item{

	String actor;
	String director;
	
	void output() { 
		System.out.println("번호:" + num);
		System.out.println("제목:" + title);
		System.out.println("배우:" + actor);
		System.out.println("감독:" + director);
	}
}
