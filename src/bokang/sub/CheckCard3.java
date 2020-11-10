package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리   
	
	1.충전은 10000원 단위로만 가능하다.           (10000원으로 나누어서 떨어져야함)
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다. (balance)
	
	3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야한다.
	
	4.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	5.포인트 적립율 변경
		10만원 이하결제 : 0.1%적립
		10만원 초과결제 : 0.3%적립
*/
public class CheckCard3 
{
	//멤버변수 //private으로 변수 선언한다!
	private long cardNumber; //public 안붙이면 다른 패키지에 안보인다!
	private String owner;
	private int balance;
	private int point;
	
	//카드번호가 정상인지 확인하기 위한 메소드
	public boolean cardNumberRange(long cn)
	{
		if(cn>=1000_0000_0000_0000L && cn<=9999_9999_9999_9999L) //범위를 확인!
			return true;
		else
			return false;
	}
	
	
	/*
	 생성자메소드와 멤버메소드의 유일한 차이점은
	 생성자는 반환값이 없고, 멤버메소드는 반환값이 있는 것이다!
	 따라서 멤버메소드를 정의할 때는 반드시 void 혹은 반환타입을 명시해야 한다!!
	 */
	
	
	//생성자는 반환타입이 없다!!!!!!!!!!!!!!
	//기본생성자
	public CheckCard3()
	{
		
	}
	
	//인자생성자
	public CheckCard3(long cardNumber, String owner, int balance) {
		//카드번호의 자리수가 틀릴 경우 생성불능 처리!
		if(cardNumberRange(cardNumber)==false)
		{
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = 0;
	}
	
	public CheckCard3(long cardNumber, String owner) {
		//카드번호의 자리수가 틀릴 경우 생성불능 처리!
		if(cardNumberRange(cardNumber)==false)
		{
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = 0;
		this.point = 0;
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
		if(amount%10000!=0)
		{
			System.out.println("충전 불가 : 10000원씩 해야함!");
			return;
		}
		this.balance += amount;
	}
	
	public void payment(int amount) //결제
	{
		savingPoint(amount);
		
		if(this.balance<amount)
		{
			System.out.println("잔액부족으로 결제불능");
			return; //함수안에서 return을 만나면 무조건 종료!
		}
		this.balance -= amount;
		savingPoint(amount);
	}
	
	public void savingPoint(int amount) //적립
	{
		double plusPoint = 0;
		if(amount>100000)
		{
			plusPoint = (amount * 0.3);
		}
		else
		{
			plusPoint = (amount * 0.1);
		}
		
		this.point += plusPoint; //발란스는 인트, 플포는 더블형이다!
	}							 //더블형에서 인트형으로 가는데 에러가 안나는 이유는 += 복합대입연산자 때문에 자동형변환!
	
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