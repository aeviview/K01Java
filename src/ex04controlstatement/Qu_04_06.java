package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {

		/*
		문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		파일명 : Qu_04_06.java
		
		[실행결과]
		*
		* *
		* * *
		* * * *
		* * * * *
		
		*/
		
		/*
		 풀이 : 25번 반복할 수 있는 반복문을 만들어라
		 	한 층씩 내려간다고 생각하고 이미지 구상(정비례)
		 	x는 세로, y는 가로로 생각하자
		 */
		
		int x = 1;
		while(x<=5)
		{
			int y = 1;
			while(y<=x)
			{
				if(x>=y) //y는 x의 갯수만큼 출력한다.
				{
				System.out.print("* ");
				}
				y++;
			}
				
				
			System.out.println(" "); //한 줄 출력 후 줄바꿈
			x++;
				
			
		}
	}	
}
