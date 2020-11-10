/*
 문제2) 파일명 : QuConvertTime.java
 
‘초’를 ‘시간’으로 변환하기
초를 입력받아서 00시간 00분 00초 형태로 출력하는 프로그램을 메소드를 작성하시오.
출력예 : 2458초 -> 0시간 40분 58초
       3456초 -> 0시간 57분 36초
실행결과]
시간으로 변환할 초(second)를 입력하세요:5678
[1시간 34분 38초]
*/

package quiz;

import java.util.Scanner;

public class QuConvertTime 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("시간으로 변환할 초(second)를 입력해! ");
			
			int inputNumber = scanner.nextInt();
			
			int hour;
			int minute;
			int second;
			
			hour = inputNumber/3600; ////1일을 초로 환산하면 86400초
			minute = inputNumber/60;
			second = inputNumber%3600%60;
			
			System.out.println(hour + "시간 " + minute + "분 " + second + "초");	

	}

}
