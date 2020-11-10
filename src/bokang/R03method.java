package bokang;

import java.util.Scanner;

public class R03method 
{

	//매개변수X, 반환값X
	public static void guguPrint() //아무것도 전달 받지도 반환하지는 않는다. 단지 출력용!
	{
		for(int dan=2 ; dan<=9 ; dan++)
		{
			for(int su=1 ; su<=9 ; su++)
			{
				System.out.printf("%2d X%2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
	}
	
	
	//매개변수O, 반환값X
	public static void guguRangeShow(int n1, int n2)
	{
		
		for(int dan=n1 ; dan<=n2 ; dan++)
		{
			for(int su=1 ; su<=9 ; su++)
			{
				System.out.printf("%2d X%2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
	}
	
	//매개변수X, 반환값O
	public static double sungjukResult()
	{
		double result = 0; //result는 double형이고 0은 int형이지만, 자동형변환이 일어나서 괜찮다!
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int k = scanner.nextInt();
		System.out.print("영어 : ");
		int e = scanner.nextInt();
		System.out.print("수학 : ");
		int m = scanner.nextInt();
		
		result = (k + e + m) / 3.0; //3으로 하면 int끼리 연산이라 result 값이 int형이 된다. 그래서 3.0해야함!
									//result는 위에서 double형으로 선언하고, 초기화했다!
		return result;
	}
	
	
	//매개변수O, 반환값O
	public static int numberPlus(int endNum) //매개 변수값이 int기 때문에 반환값은 int로 해야한다!
	{
		int sum = 0;
		for(int x = 1 ; x<=endNum ; x++)
		{
			sum += x;
		}
		return sum;
	}
	
	
	
	/*
	연습문제] 다음과 같은 출력결과를 보이는 프로그램을 메소드로 구현하시오
	메소드명 : upgradeGugu()
	실행결과] 
	---------- java ----------
	2x1=2 2x2=4
	3x1=3 3x2=6 3x3=9
	4x1=4 4x2=8 4x3=12 4x4=16
	5x1=5 5x2=10 5x3=15 5x4=20 5x5=25
	6x1=6 6x2=12 6x3=18 6x4=24 6x5=30 6x6=36
	7x1=7 7x2=14 7x3=21 7x4=28 7x5=35 7x6=42 7x7=49
	8x1=8 8x2=16 8x3=24 8x4=32 8x5=40 8x6=48 8x7=56 8x8=64
	9x1=9 9x2=18 9x3=27 9x4=36 9x5=45 9x6=54 9x7=63 9x8=72 9x9=81
	 */

	//매개변수도 없고, 반환값도 없는 타입이 좋겠다
	public static void upgradeGugu()
	{
		for(int dan=2 ; dan<=9 ; dan++)
		{
			for(int su=1 ; su<=dan ; su++)
			{
				System.out.printf("%2d X%2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		/*
		시나리오] 구구단을 출력하는 메소드를 작성하시오.
			메소드명 : guguPrint()
			주의] main메소드에서 호출하므로 정의하는 메소드는 
			반드시 static으로 선언해야 한다.
			※매개변수도 없고, 반환타입도 없는 경우
		 */
		System.out.println("매개변수X, 반환값X");
		guguPrint();
		
		/*
		시나리오]매개변수로 2개의 정수를 전달하여 해당 범위의 
			구구단을 출력하는 메소드를 작성하시오.
			만약 2, 5가 전달된다면 2단, 3단, 4단, 5단만 출력된다.
			메소드명 : guguRangeShow(int n1, int n2)
			※매개변수는 있고, 반환타입은 없는 메소드
		 */
		System.out.println("매개변수O, 반환값X");
		guguRangeShow(2, 5);
		
		
		
		/*
		시나리오] sungjukResult() 메소드를 호출하면 국어,영어,수학
		점수를 입력받은후 평균값을 반환하도록 구현하시오.
		※매개변수X, 반환값O
		 */

		System.out.println("매개변수X, 반환값O");
		System.out.println("평균값은:"+ sungjukResult());
		double avr = sungjukResult();
		System.out.println("평균값은:"+ avr);
		
		
		/*
		시나리오] 정수 하나를 매개변수로 전달하면 1부터 해당 매개변수
		까지의 합을 구하여 결과값을 반환하는 메소드를 작성하시오.
		메소드명 : numberPlus(int endNum) 
		※매개변수O, 반환값O
		 */
		int tot = numberPlus(150);
		System.out.println("1~150까지의합은:"+ tot);

		
		/*
		연습문제] 다음과 같은 출력결과를 보이는 프로그램을 메소드로 구현하시오
		메소드명 : upgradeGugu()
		*/
		upgradeGugu();
	}

}
