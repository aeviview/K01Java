package testpackage;

public class Lotto45 {

	public static void main(String[] args) {

		int[] lottoNum = new int[6];
		
		for(int i=0 ; i<lottoNum.length ; i++)
		{
			lottoNum[i] = (int)(Math.random()*100 % 45)+1;
		}
		
			System.out.println("★종빈아 빠른 쾌유 바랄께★");
			System.out.print("오늘의 행운 번호 : ");
		
		for(int i=0 ; i<lottoNum.length ; i++)
		{
			System.out.printf("%d ", lottoNum[i]);
		}
	}

}
