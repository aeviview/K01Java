package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

		
		/*
		 문제4] 구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
		파일명 : Qu_04_09.java
		 */
		
		
		/*
		 풀이 : 단이 고정되는 것이 아니라 수가 고정된다(기존 구구단과 다름)
		 */
		
		
		for(int su = 1 ; su <= 9 ; su++)
		{
			
			for(int dan = 2 ; dan <= 9 ; dan++)
			{
				System.out.printf("%-2dX%-2d=%-2d", dan, su, (dan*su));
				// System.out.println();
				System.out.print("  ");
			}
			
			System.out.println(" ");
		}
		
	}
}
