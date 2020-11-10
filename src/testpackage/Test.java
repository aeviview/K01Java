package testpackage;

/*
  [시나리오]
	다음에 주어진 조건으로 '사람'을 추상화 하시오.
	- 속성 : 이름, 직업, 에너지
	- 행동 : 뛴다, 싸운다, 잔다, 현재상태표현
	- 행동의 조건
	뛰면 에너지가 5 감소
	싸우면 에너지가 10 감소
	자면 에너지가 2 증가
	단, 에너지의 최대/최소 범위는 0~100
 
 */
public class Test
{
	// 객체 : 이름, 직업, 에너지 초기하한다
	// 멤버변수 선언
	String name;
	String job;
	int energy;
	
	// 객체의 상태(행동) : 뛴다, 싸운다, 잔다, 현재상태표현
	// 멤버메소스 선언
	void run()
	{
		energy-=1;
		if(energy<0)
		{
			energy = 0;
			System.out.println("[Run] 당신은 뛰다가 죽었습니다.");
		}
		else
		{
			System.out.println("[Run] 힘들어서 에너지가 5 감소했습니다.");
		}
	
	}
	void fight()
	{
		energy-=5;
		if(energy<0)
		{
			energy = 0;
			System.out.println("[Fight] 당신은 맞아 죽었습니다.");
		}
		else
		{
			System.out.println("[Fight] 격렬한 싸움으로 에너지가 10 감소했습니다.");
		}
	
	}
	void sleep()
	{
		energy+=2;
		if(energy>=100)
		{
			energy = 100;
			System.out.println("[Sleep] 너무 많이 자서 잠이 안와요.");
		}
		else
		{
			System.out.println("[Sleep] 충분한 휴식으로 에너지가 2 증가했습니다.");
		}
	
	}

	void showState()
	{
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
		System.out.println("에너지 : "+energy);
	}
	
}	
