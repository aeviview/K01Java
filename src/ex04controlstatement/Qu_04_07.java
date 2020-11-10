package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {

		/*
		 문제2) 1~100까지의 숫자중 3의배수 이거나 7의배수인
		 숫자의 합을 구하는 프로그램을 작성하시오.
		 단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
		 출력의결과는 누적되는 모든 수를 콘솔에 print한다.
		 파일명 : Qu_04_07.java
		 
		 실행결과]
		 3+6+7+~~~~~~~~~=????
		*/
		
		/*
		 풀이 : 반복의 횟수가 명확하기 때문에 for문이 가장 좋다
		 */
		
		
		int sum = 0; //누적합을구하기 위한 변수
		
		for(int i=1 ; i<=100 ; i++) //1~100까지 반복한다
		{
			if(i%3==0 || i%7==0) //3의 배수 또는 7의 배수일 경우 sum +1하고 반복
			{
				
				if(i % (3*7)!=0) //3과 7의 공배수를 이렇게 표현한다
				{				  //공배수 제외해야 하기 때문에 ! not을 표기
					sum +=i;
					System.out.print(i+"+");
				}
			}
		}
		
		System.out.println("결과:" + sum);
		
		
	}

}
