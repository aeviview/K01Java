package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {

		/*
		 <String 클래스 : 문자열>
		 <Scanner 클래스 : 입력할때>
		 <Math 클래스 : 0 ~ 1 사이의 무수하게 많은 실수 값>
		 <Random 클래스 : 정수형 난수 생성할 때>
		 */
		
		/*
		 Math.random() : Math라는 클래스에 random이라는 메소드 사용.
		  - 0 ~ 1 사이의 실수를 랜덤하게 반환하는 함수
		  - 정수 형태의 난수를 생성하기 이해서는 100을 곱해준다.
		 */
		
		//난수생성방법1
		double rndNumber = Math.random();
		System.out.println("생성된난수[실수]"+ rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된난수[정수]"+ intNumber);
		
		/*
		 Random 클래스 : Scanner 클래스와 동일한 nextInt() 함수를
		 			이용해서 정수형 난수 생성
		 */
		
		//난수생성방법2
		Random random = new Random();
		System.out.println("생성된난수 : "+ random.nextInt());
		System.out.println("==============================");
		
		/*
		 로또 번호처럼 1~45사이의 난수를 생성하는 방법
		 1.0.xxxxxxx형태의 난수를 정수로 변경하기 위해 100을 곱해준다.
		 2. int로 형변환한다.
		 3. 45로 % 연산하여 나머지를 구한다.(이 때 결과는 0 ~ 44)
		 4. 3번의 결과에 +1을 해준다. 결과적으로 1 ~ 45 사이의 난수 생성 가능
		 */
		
		System.out.println("1~45사이의 난수생성 : "+ ((int)(Math.random()*100 % 45)+1));
		System.out.println("==============================");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		
		int[] lottoNum = new int[6];
		
		for(int i=0 ; i<lottoNum.length ; i++)
		{
			lottoNum[i] = (int)(Math.random()*100 % 45)+1;
		}
		
		for(int i=0 ; i<lottoNum.length ; i++)
		{
			System.out.printf("%d ", lottoNum[i]);
		}
	
	}

}
