/*
 문제3) 파일명 : ExSusikAZ.java
다음 수식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하시오.
  AZ
 +ZA
--------
  99
단, A와 Z는 서로다른 숫자이다.
실행결과]
09 + 90 = 99
18 + 81 = 99
27 + 72 = 99
36 + 63 = 99
45 + 54 = 99
54 + 45 = 99
63 + 36 = 99
72 + 27 = 99
81 + 18 = 99
90 + 09 = 99
 */


package quiz;

public class ExSusikAZ
{

	public static void main(String[] args) 
	{
	
		for(int i=0 ; i<=9 ; i++)
		{
			for(int j=0 ; j<=9 ; j++)
			{
				if((10*i+j)+(10*j+i)==99);
				{
					System.out.printf("%d%d + %d%d = %d\n", i,j,i,j,(i+j));
				}
			}// 이건 못풀겠어!
		}
	}
}
