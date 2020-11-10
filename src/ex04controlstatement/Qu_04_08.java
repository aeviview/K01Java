package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {

		/*
		 문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		 파일명 : Qu_04_08.java

		 [실행결과]
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 */
		
		/*
		 풀이 : 총 5층이고 반비례 하고 있다
		 	FLOOR-x+1 : 변수 x가 증가함에 따라 점점 감소하는 y를 표현하기 위한 식
		 */
		
		
		final int FLOOR = 5; // 상수 변경하면 10층, 20층 등 자유롭게 변경 가능
		
		for(int x=1 ; x<=FLOOR ; x++) //세로층 반복
		{
			for(int y=1 ; y<=(FLOOR-x+1) ; y++) //가로층 반복
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		for(int x=1 ; x<=5 ; x++)
		{
			for(int y=1 ; y<=5 ; y++)
			{	
				if(x+y<=6)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

}
