package d_exercise;

public class Customer {

	private String tel;
	private String name;
	private int	 	mileage;
	
	public void output() {
		System.out.println(name+"님(" + tel +")는 " + mileage +"점 있습니다");
	}
	
	// default constructor
	public Customer() {
//		this.tel = "0000";
//		this.name = "이름없음";
//		this.mileage = 10;
		this("0000","이름없음", 10);
	}
	
	// constructor
	public Customer(String tel, String name, int mileage){
		this.tel = tel;
		this.name = name;
		this.mileage = mileage;
	}
	
	public Customer(String tel, String name){
		this.tel = tel;
		this.name = name;
		this.mileage = 1000;
	}
	

	// getter, setter
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
