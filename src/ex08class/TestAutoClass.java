package ex08class;
// get,set 사용
public class TestAutoClass {

	String carName;
	int carYear;
	String owner;
	// 빈공간 우클릭 -> source -> generate constructor using field 클릭하면 멤버메소드 자동 출력됨
	
	public TestAutoClass(String carName, int carYear, String owner) {
		super();
		this.carName = carName;
		this.carYear = carYear;
		this.owner = owner;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
