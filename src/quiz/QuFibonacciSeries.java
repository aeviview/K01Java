/*
 문제1) 파일명 : QuFibonacciSeries.java

인자로 전달된 수만큼 피보나치 수열을 출력하는 메소드를 작성하시오.
피보나치수열은 0, 1 부터 시작한다. 따라서 실행결과는 다음과 같다. 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ......

실행결과]
출력할 피보나치수열의 항목갯수를 입력하세요:20
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
*/

package quiz;

import java.util.Scanner;

public class QuFibonacciSeries 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("피보나치 수열의 항목갯수를 입력해 : ");
		
		int inputNum = scanner.nextInt();
		
		
		for(int i=0 ; i<=inputNum; i++)
		{
			System.out.print(" " +fibo(i));
		}
	}

	public static int fibo(int n)
	{
		if(n<=1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);
		
	}
	
}
