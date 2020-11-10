		/*
		 문제2) 파일명 : QuArray1To10.java
		다음 절차에 따라 프로그램을 작성하시오.
		1. 크기가 10인 정수타입의 배열을 선언한다.
		2. 반복문을 이용하여 배열을 채운다. 
		 (이 때 배열은 1,2,3,4....순서대로 채운다)
		3. 2번에서 채운 배열을 출력한다.
		4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
		5. 누적해서 더한 값을 출력한다. 
		 */
		
		/*
		int [] arrNumber = new int [11];
		
		for(int i=1 ; i<arrNumber.length ; i++)
		{
			arrNumber[i] += i;
		}
		
		System.out.println("초기화된 배열 요소");
		
		for(int i=1 ; i<11 ; i++)
		{
			
			System.out.print(arrNumber[i]+" ");
		}
	
		int sum = 0;
		for(int i=1 ; i<11 ; i++)
		{
			sum += i;
			
			
		}
		
		System.out.println("");
		System.out.println("배열 전체 요소의 합 : "+sum);
		*/
		
package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {		
		
		
		
		int[] arr = new int[10]; // 크기 10인 배열 선언
		
		for(int i=0 ; i<arr.length ; i++) // 배열에 1~10까지의 정수를 초기화
		{
			arr[i] = i+1;
		}
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) // 배열의 모든 수를 더한다
		{
			sum += arr[i];
		}
		
		System.out.println("배열 전체요소의 합 : "+ sum);
		
	}

}
