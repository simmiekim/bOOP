package h_access2;

import h_access2.sub.Access;

public class Main {

	public static void main(String[] args) {
		
		Access me = new Access();
		//me.a = "프라이빗 수정";
		me.b = "퍼블릭 수정";
		//me.c = "프로젝티드 수정";
		//me.d = "디폴트 수정";
		
		me.output();
	}

}
