package ex05method;

public class E08RecursiveError {

	public static void main(String[] args)
	{
		showHi(3);
	}

	/*
	 <오류코드>
	 1. 감소연산자로 인해 cnt의 값은 차감되지만...
	 2. 조건식의 위치가 잘못되어서...
	  = 재귀호출을 하기 전에 종료체크를 할 수 있도록 수정해야 한다.
	 
	 StackOverFlow(스택오버플로우)
	 - 스택은 함수가 종료되기 전까지의 모든 정보를 저장하는 메모리로(기본자료형 저장)
	   유한한 공간이므로 무한루프에 빠지게 되면 저장능력을 초과하여 에러발생.
	 */
	
	
//	public static void showHi(int cnt)
//	{
//		 System.out.println("Hi~!");
//		 System.out.println("cnt="+ cnt);
//		 // 재귀호출전 종료체크를 하므로 정상 종료된다.
//		 
//		showHi(--cnt);
//		if(cnt==1)
//		{
//			return;
//		}
		
	public static void showHi(int cnt)
	{
		 System.out.println("Hi~!");
		 System.out.println("cnt="+ cnt);
		 // 재귀호출전 종료체크를 하므로 정상 종료된다.
		 
		if(cnt==1)
		{
			return;
		}
		showHi(--cnt);
	}
}
