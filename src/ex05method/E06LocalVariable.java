package ex05method;

public class E06LocalVariable {
	
	// 어디서 에러가 나는지 왜 나는지 이해하자
	
	 /*
	 Local variable(지역변수)
	 - 변수는 사용범위(Scope)를 가지고 있고, 해당 지역내에서만 사용 가능하다.
	 - 해당 지역을 벗어나면 즉시 메모리에서 소멸된다.
	 - 기본자료형은 스택(Stack)이라는 메모리 공간을 사용한다. (기본자료형은 int, char, boolean등)
	 - Stack은 CPU가 메모리의 생성 및 소멸을 주관한다.
	 */
	
	public static void main(String[] args)
	{
		boolean scope = true;
		
		/*
		 main 지역에서 num를 선언하면 그보다 작은 if문의 지역에서는 같은 이름의 변수 사용 불가능.
		 큰 지역에서 이미 선언하여서 메모리상에 있기 때문이다.
		 */
		// int num = 9; //에러발생
		
		if(scope)
		{
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역:"+ num);
		}	
		else
		{
			int num = 5;
			System.out.println("첫번째 if문의 else지역:"+ num);
		}
		
		/*
		 if문의 블럭에서 선언된 변수 num은 해당 블럭을 벗어나면 메모리에서 소멸된다.
		 따라서 아래에서 num을 선언 할 수 있다.
		 */
		
		int num = 100;
		System.out.println("main메소드 지역:"+ num);
		
		simpleFunc(); //메소드 호출
		
		System.out.println("main 메소드 끝");
	}	
	
	/*
	 main에서 선언한 변수 num이 메모리에 아직 남아있지만,
	 simpleFunc() 메소드는 서로 다른 지역에 정의되었으므로
	  같은 이름의 변수를 사용할 수 있다.
	 */
	
	static void simpleFunc()
	{
		int num = 1000;
		System.out.println("simple 메소드 지역:"+ num);
	}

}