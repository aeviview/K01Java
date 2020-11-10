package bokang.sub;
/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/
public class CheckCard1 
{
	//멤버변수
	public long cardNumber; //public 안붙이면 다른 패키지에 안보인다!
	public String owner;
	public int balance;
	public int point;
	
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