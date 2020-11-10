package ex08class;
//2번 예제를 생성자로 변경해보자


//과일 판매자를 추상화한 클래스
class FruitSeller3 //생성자는 클래스명과 똑같아야 하고 반환값이 없다(void 지우기)
{
	
	int numOfApple; //판매자의 사과 보유 갯수
	int myMoney;      //판매수익
	final int APPLE_PRICE; //사과의 단가
	
	/*
	 상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
	 일반적인 멤버메소드에서는 초기화 할 수 없다.
	 하지만 생성자 메소드에서는 초기화가 가능하다.
	 생성자는 마음대로 호출할 수 없고, 객체생성시 단 한번만 호출되는 특성이 동일하기 때문이다.
	 (한 번 이상 초기화 되지 않음이 보장되기 때문)
	 */
	
	public FruitSeller3(int money, int appleNum, int price)
	{
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	
	//[판매자가 사과를 판매하는 행위를 표현한 멤버메소드]
	public int saleApple(int money)
	{
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num; 
	}
	
	//[판매자의 현재상태를 출력하는 멤버메소드]
	public void showSaleResult()
	{
		System.out.println("[판매자] 남은 사과 갯수 : "+ numOfApple);
		System.out.println("[판매자] 판매 수익 : "+ myMoney);
	}
}


//과일 구매자를 추상화한 클래스
class FruitBuyer3
{
	int myMoney; //보유금액
	int numOfApple; //구입한 사과의 갯수(장바구니)
	
	public FruitBuyer3(int _myMoney, int _numOfApple)
	{
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	
	
	//[구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드]
	public void buyApple(FruitSeller3 seller, int money)
	{
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult()
	{
		System.out.println("[구매자] 현재 잔액 : "+ myMoney);
		System.out.println("[구매자] 사과 갯수 : "+ numOfApple);
	}
	
}

// 메인 클래스
public class E06FruitSalesMain3 {
	
	public static void main(String[] agrs) {
	
	 
		//판매자1 : 보유갯수 100개, 단가 1000원
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		//판매자2 : 보유갯수 80개, 단가 500원
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		System.out.println("");
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}
}
