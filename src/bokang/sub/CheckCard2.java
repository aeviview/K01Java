package bokang.sub;
/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */
public class CheckCard2 
{
	//멤버변수 //private으로 변수 선언한다!
	private long cardNumber; //public 안붙이면 다른 패키지에 안보인다!
	private String owner;
	private int balance;
	private int point;
	
	
	//일반적인 멤버메소드이기 때문에 void(반환타입)을 꼭 붙여야 한다!! 안붙이면 에러남
	public void initMembers(long cardNumber, String owner, int balance, int point) {
		//super(); super 있으면 안된다!
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	/*
	 생성자메소드와 멤버메소드의 유일한 차이점은
	 생성자는 반환값이 없고, 멤버메소드는 반환값이 있는 것이다!
	 따라서 멤버메소드를 정의할 때는 반드시 void 혹은 반환타입을 명시해야 한다!!
	 */
	
	
	//생성자는 반환타입이 없다!!!!!!!!!!!!!!
	//기본생성자
	public CheckCard2()
	{
		
	}
	
	//인자생성자
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		super();
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	//getter/setter 만드는 이유 : private 멤버변수에 접근하기 위해서!!!(무조건 public으로 접근!)
	//멤버변수가 private으로 선언되면 클래스 내부에서만 접근가능하므로 무조건 getter/setter 해야 한다!
	//우클릭 > source > getter/setter > all 선택 > generate!
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	//멤버메소드
	//접근지정자 public을 붙이지 않으면 메인함수에서 호출할 수가 없다 ㅠㅠ
	public void charge(int amount) //충전
	{
		this.balance += amount; //충전이니까 amount를 더한다
	}
	public void payment(int amount) //결제
	{
		this.balance -= amount; //결제니까 amount를 뺀다
		//카드를 사용할 때 적립금이 발생하게 되므로 여기서 호출해야 한다!
		savingPoint(amount);
	}
	public void savingPoint(int amount) //적립
	{
		//this.point += (amount * 0.1); //이렇게 해도 되지만 밑에가 더 명시적이다
		double plusPoint = (amount * 0.1);
		this.point += plusPoint; //발란스는 인트, 플포는 더블형이다!
	}							   //더블형에서 인트형으로 가는데 에러가 안나는 이유는 += 복합대입연산자 때문에 자동형변환!
	
	public void showState() //현재상태출력(멤버변수를 출력하는 것)
	{
		System.out.println("========================");
		System.out.println("카드번호 : " + cardNumber);
		System.out.println("소유자 : " + owner);
		System.out.println("잔고 : " + balance);
		System.out.println("포인트 : " + point);
		System.out.println("========================");
	}
	
}