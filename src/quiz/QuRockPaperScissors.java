/*
파일명 : QuRockPaperScissors.java
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
1. 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2. 사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
3. 승부를 판단하여 출력한다.
4. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
5. 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6. 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
7. 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
*/


package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {

	public static void rpsGameStart()
	{
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; //게임카운트용 변수
		
		
		
		//1.난수생성 - 컴퓨터 입장에서는 가위,바위,보
		int com = random.nextInt(10000) % 3 + 1; //1~3사이의 난수 생성
		System.out.println("컴퓨터 : "+ com);
		
		//2.사용자 입력
		int user = 0;
		System.out.println("가위바위보를 입력하세요");
		System.out.println("가위(1), 바위(2), 보(3)=>");
		user = scanner.nextInt();
		
		//사용자가 정상적으로 입력한 경우(! not을 사용)
		if(!(user<1 || user>3))
		{
			//가위바위보 출력용 함수를 이용해서 정보출력
			System.out.printf("사용자 : %s, 컴퓨터 : %s ",
					displayRPS(user), displayRPS(com));
			
			switch(user - com) //if문 9개 사용해서 작성할 수 있지만 비효율적임
			{
			case 0:
				System.out.println("비겼습니다");break;
			case 1: case -2:
				System.out.println("이겼습니다");break;
			case 2: case -1:
				System.out.println("졌습니다");break;
			}	
			
			gameCount ++; //게임카운트 증가
			
		}
		else
		{
			System.out.println("가위바위보 할 줄 몰라요??");
		}
		
		int restart;
		if(gameCount>=5) //게임재시작 여부 확인
		{
			while(true)
			{
			System.out.println("게임재시작(1), 종료(0)");
			restart = scanner.nextInt();
			
			if(restart==0) //게임종료
			{
				break; //while문을 탈출
			}
			else //게임재시작
			{
				gameCount = 0; //게임카운트 0으로 초기화
				System.out.println("게임을 재시작 합니다");
			}
		}
		}	
		
	}

	public static String displayRPS(int n)
	{
		String str = "";
		switch(n)
		{
		case 1 : str = "가위";break;
		case 2 : str = "바위";break;
		case 3 : str = "보";break;
		}
		return str;
		
	}
	
	public static void main(String[] args)
	{
		
		rpsGameStart();
		
	}
	
}
