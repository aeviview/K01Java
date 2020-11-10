package ex05method;

/*
 재귀함수(Recursive Method)
  - 하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 함수
 */

public class E08RecursiveMethod {

	
	static int factorial(int number) {
		
		int result;
		if(number==1)
		{
			result = 1;
		}
		else
		{
			result = number * factorial(number-1); // 자기 자신을 다시 호출함
			
			 /*
			  - 계산과정이 4부터가 아니라 1부터인 이유 : 4 * f(3)에서 f(3)은 4 * f(2)이다.
			    이런식으로 f(1)까지 간다음에 result로 끝나서 1부터 시작한다.
			 */
		}
		System.out.println("계산과정 : number ="+ number +", result =" + result);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//피보나치 수열 풀이할 때 사용
		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4factorial : "+ factorial(4));
		System.out.println("10factorial : "+ factorial(10));
			
	}

}
