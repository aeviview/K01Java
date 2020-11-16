package ex16exception;

/*
 업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class QuUpDownGameException
{

	public static void main(String[] args)
	{
		
		int low, high;
		int card;
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int i = 0;
			low = 1;
			high = 100;
			card = r.nextInt(100);
			System.out.println("업다운 게임 시작!");
			
			while(true)
			{
				System.out.println(low+ "-" + high);
				System.out.print(i+1+">>");
				int n = 0;
				
				try
				{
					n = scanner.nextInt();
				} 
				catch(InputMismatchException e)
				{
					System.err.println("정수만 입력해라!");
					scanner.nextLine();
					continue;
				}
				if(n>high || n<low)
					System.err.println("범위를 벗어났음");
				else
					if(n==card)
					{
						System.out.println("정답입니다.");
						break;
					}
					else if(n>card)
					{
						System.out.println("더 낮은 수입니다");
						high = n;
					}
					else
					{
						System.out.println("더 높은 수입니다");
						low = n;
					}
			
			}
				i++;
		}
	}
	
}
