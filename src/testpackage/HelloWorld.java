package testpackage;

public class HelloWorld 
{

		
	public static void main(String[] args) 
	{

		//1~10까지의 합을 구해라 while문
		
		int x = 1;
		int sum = 0;
		
		
		while(x<=10)
		{
			sum += x;
			x++;
		}
		
		System.out.println("합은 : "+sum);
		
		System.out.println("do ~ while문");
		
		int y = 1;
		int sum2 = 0;
		
		do
		{
			sum2 += y;
			y++;
		}
		while(y<=10);
		
		System.out.println("모든 합은 : "+sum2);
		
		System.out.println("for문");
		
		int sum3 = 0;
		for(int z=1 ; z<=10 ; z++)
		{
			sum3 += z;
		}
		
		System.out.println("for문을 이용한 합은 : "+sum3);
		
		
		
	}
		
}	

