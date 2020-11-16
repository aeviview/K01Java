package testpackage;

import java.util.Random;
import java.util.Scanner;

/*
 <Up Down 게임>
 1 ~ 100을 입력
 */
class Test
{
	public static void main(String[] args)
	{
		int low; //최소값
		int high; //최대값 
		int answer; //정답
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			int i = 0; //횟수
			low = 1;
			high = 100;
			
			answer = r.nextInt(100);
			System.out.println("업다운 게임 시작!");
			
			while(true) 
			{
				System.out.println(low + "-" + high);
				System.out.println(i + ">>");
				
				int n = 0; //입력한 값!
				
				n = s.nextInt();
				
				if(n==answer)
				{
					System.out.println("정답입니다!");
					break;
				}
				else if(n>answer)
				{
					System.out.println("더 낮은 수 입니다!");
					high = n;
				}
				else
				{
					System.out.println("더 높은 수 입니다!");
					low = n;
				}
				i++;
			}
			break;		
		}
			
	}
	
}
