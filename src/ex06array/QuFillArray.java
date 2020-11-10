
		/*
		 문제3) 홀수/짝수 구분하여 배열채우기
		파일명 : QuFillArray.java
		길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
		그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고
		짝수는 배열의 끝에서 부터 채워나간다.(두번째배열)
		 
		
		int[] arrNumber = {2,4,5,3,2,9,7,8,5,1};
		
		int[] counter = new int[10];
		for(int i=0 ; i<counter.length ; i++)
		{
			counter[i] = i++;
		}
		
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println(i+"번째 정수를 입력하세요 : "+ counter[i]);
		}
		
		//포 to the 기
		*/
	

package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {	
	
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = new int[10]; //입력받은 정수를 순서대로 입력
		int[] arr2 = new int[10]; //홀,짝 구분해서 입력
		
		int indexStart = 0;				// arr2 배열의 첫번째 인덱스 저장(홀수인경우)
		int indexEnd = arr2.length - 1; // 마지막 인덱스 저장(짝수인경우)
		
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.println("숫자를 입력하거라");
			int inputNum = scanner.nextInt();
			
			arr1[i] = inputNum; // 첫번째 배열에는 입력한 순서대로 채워준다.
			
			if(inputNum%2==1) // 입력받은 숫자가 홀수이면 앞에서 부터 채우고 인덱스 +1 증가
			{
				arr2[indexStart++] = inputNum;
			}
			else              // 입력받은 숫자가 짝수이면 뒤에서 부터 채우고 인덱스 -1 감소
			{
				arr2[indexEnd--] = inputNum;
			}
		}
		
		// 두 개의 배열을 출력하기
		System.out.println("첫번째배열 출력");
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n두번째배열 출력");
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
		
	}

}
