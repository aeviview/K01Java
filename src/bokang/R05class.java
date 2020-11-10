package bokang;

import bokang.sub.CheckCard1;
import bokang.sub.CheckCard2;

public class R05class 
{

	public static void main(String[] args) 
	{
		//체크카드 클래스 ver01
		/*
		 숫자를 구분할 때 구분자로 언더바를 사용할 수 있다.
		 JDK7.0부터 지원되었으며 숫자사이에만 쓸 수 있다.
		 잘못된방법]
		 	3._141592
		 	123_456_
		 	_123_456
		 위와 같이 언더바로 시작하거나 끝날 수 없고, 소수점과 연결해서도 사용할 수 없다.
		 */
		CheckCard1 cc1 = new CheckCard1();
		//변수 하나씩 초기화해준다!
		cc1.cardNumber = 1111_2222_3333_4444L; 
		cc1.owner = "홍길동";
		cc1.balance = 10000;
		cc1.point = 0;
		
		//결제를 진행해보자!
		//5000원 결제
		cc1.payment(5000);
		//10000원 결제
		cc1.payment(10000);
		//현재상태보기
		cc1.showState();
		
		///////////////////////////////////////////////////////////////////////////
		//객체생성 후 초기화 메소드를 통해서 멤버변수를 초기화
		CheckCard2 cc2 = new CheckCard2();
		cc2.initMembers(1234_5678_9012_3456L, "송치국", 3000, 0);
		
		//인자생성자를 통해서 객체생성과 동시에 멤버변수를 초기화
		CheckCard2 cc3 = new CheckCard2(9876_5432_1098_7654L, "송치영", 100000, 0);
		
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(18000);
		cc3.payment(19000);
		cc3.showState();
		
		//cc2.balance = 9000;
		//cc2.owner = "아무개"; 호출이 안된다! private하게 선언했기 때문이다!!
		
		cc2.setBalance(9900);
		cc2.setOwner("아무개"); //setter를 통해서 접근가능하다^^
		cc2.showState(); //송치국 => 송치영으로 변경됨
		
		//cc1,2,3 비교해보자! cc3가 가장 단순하고 빠르다!
		
	}

}
