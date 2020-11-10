package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException
	{

		/*
		 하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여
		 숫자라면 2의배수인 경우에만 "2의 배수 입니다"라고 출력한다. 
		 그 외에는 "2의 배수가 아닙니다" 라고 출력한다.
		 힌트] '0'의 아스키코드값은 48 입니다. 
		 (System.in.read()를 사용하세요)
		 */
		//하나의 문자만 입력받음
	
		System.out.println("문자 하나를 입력하세요:");
		int asciiCode = System.in.read();
		
		/*아스키코드를 모를 때 구현하는 방법.
		 입력받은 문자가 숫자형 문자인지 판단하여 boolean 값 저장
		 */
		boolean isNumber = (asciiCode>='0' && asciiCode<='9') ;
		if(isNumber==true)
		{
			//만약 숫자라면
			/*
			 숫자형 문자가 가지고 있는 아스키 코드값에서 48(0의 아스키코드 값)을 빼면
			 해당문자의 정수가 된다.
			 즉 '4' - '0' = (정수) 4
			 */
			if((asciiCode-'0') % 2 == 0)
			{
				System.out.println("2의 배수입니다.");
			}
			else
			{
				System.out.println("2의 배수가 아닙니다.");
			}
		}
		else
		{
			//숫자가 아니라면
			System.out.println("숫자가 아닙니다.");
		}
	}
}
