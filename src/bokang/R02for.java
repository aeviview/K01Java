package bokang;

public class R02for 
{

	public static void main(String[] args) 
	{
		
		//[while문] : 반복의 횟수가 정해져 있지 않을 때 사용하는 반복문
		//			반복의 조건이 false일 때 while문을 탈출한다.

		//[시나리오] 1 ~ 10까지의 합을 구하는 while문을 작성하시오.(외워라)
		
		int i = 1;
		int sum = 0;
		while(i<=10)
		{
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합은 ? "+ sum);
	
	
		//[do ~ while문] : 일단 한 번은 실행한 후에 탈출을 위한 조건을 체크한다.(외워라)
	
		int b = 1;
		int total = 0;
		do
		{
			total += b;
			b++;
		}
		while(b<=10);
		System.out.println("1~10까지의 합은 ? "+ total);
	
	
		//[for문] : 반복의 횟수가 정해져 있을 때 사용하는 반복문
	
		//[시나리오] 1~10까지의 합을 구하는 for문을 작성하시오.(외워라)
		
		int hap = 0;
		for(int c=1 ; c<=10 ; c++)
		{
			hap += c;
		}
		System.out.println("1~10까지의 합은 ? "+ hap);
		
		
		
		/*
		[시나리오] 두개의 주사위를 던졌을 때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		[실행결과]
			1+5=6
			2+4=6
			.....
			5+1=6
		 */

		
		System.out.println("for문을 이용한 주사위 문제 구현");
		for(int x=1 ; x<=6 ; x++) //첫번째 주사위 1~6까지
		{
			for(int y=1 ; y<=6 ; y++) //두번째 주사위 1~6까지
			{
				if(x+y==6) //두 눈의 합이 6이 될 때만 결과를 출력한다(true)
				{
					System.out.printf("%d+%d=%d%n", x, y,(x+y)); //printf문으로 한다
				}
			}
		}
	
		
		/*
		 [연습문제] 위 문제를 while문으로 변경하시오.
		 */
		
		System.out.println("while문을 이용한 주사위 문제 구현");
		int x3 = 1;
		while(x3<=6) //x가 0~6사이
		{
			int y3 = 1;
			while(y3<=6) //y가 0~6사이
			{	
				if(x3+y3==6)
			
					System.out.printf("%d+%d=%d%n", x3, y3, (x3+y3));
					
					y3++;

			}	
			x3++;
		}
		
		
		/*
		 [연습문제] 위 문제를 do ~ while문으로 변경하시오.
		 */
		
		System.out.println("do ~ while문을 이용한 주사위 문제 구현");
		
		int x4 = 1;
		
		do
		{
			
			int y4 = 1;
			do
			{

				if(x4+y4==6)
					System.out.printf("%d+%d=%d%n", x4, y4, (x4+y4));
				
				y4++;
			}
			
			while(y4<=6); //y가 0~6사이
		
		x4++;
		}
		while(x4<=6); //x가 0~6사이
			
		
		
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
				단, x,y의 범위는 0~10사이의 정수이고 while문을 통해 구현하시오.(원래는 for문 쓰는게 맞음)
				실행결과]
					x=0, y=3
					x=2, y=2
					........
				 */	
		
		
		int x2 = 0;
		while(x2<=10) //x가 0~10 사이
		{
			
			int y2 = 0;
			while(y2<=10) //y가 0~10 사이
			{
				if((2*x2)+(4*y2)==12) //방정식에 만족할 때 아래 문장을 출력한다.
					System.out.printf("2x+4y=12를 만족하는 x,y : %d,%d\n",x2,y2);
			
				y2++;
			}
			
			x2++;
		}
		
		
		System.out.println("==========연습문제==========");
		/*
		[연습문제] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
		결과를 계산하는 프로그램을 작성하시오. (for문이 2개 필요하다)
		 */
		
		System.out.println("해법(1)");
		int totalSum1 = 0;
		int totalSum2 = 0;
		
		for(int g=1 ; g<=10 ; g++)
		{
			totalSum1 += g; //한 번 누적했던 값을
			totalSum2 += totalSum1; //한 번 더 누적해서 더한다!
		}
		System.out.println(totalSum1);
		System.out.println(totalSum2);

		
		
		
		System.out.println("해법(2) : for문 2개");
		int totalSum3 = 0;
	
		for(int p=1 ; p<=10 ; p++)
		{
			for(int q=1 ; q<=p ; q++)
			{
				totalSum3 += q;
			}
		
		}
		System.out.println(totalSum3);
	}

}
