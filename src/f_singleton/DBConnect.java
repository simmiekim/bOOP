package f_singleton;

/*
 *  목적 : DBConnect 객체가 1개 공유
 */

public class DBConnect {

	static DBConnect con = null;
	
	private DBConnect() {
		System.out.println("디비연동");
	}
	
	public static DBConnect getInstance() {
		if( con == null ) {
			con = new DBConnect();
		}
		return con;
	}
}
