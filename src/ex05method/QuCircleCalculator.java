package ex05method;

public class QuCircleCalculator {

	static void circleArea(double rad) { // 실수 일 수 있기 때문에 double 씀
		// 원의 넓이 : 3.14 * 반지름(rad) * 반지름(rad) - 반환값이 없는 형태
		double result = 3.14 * rad * rad;
		System.out.println("원의 넓이:"+ result);
	}
	
	static double circleRound(double rad) {
		// 원의 둘레 : 3.14 * 반지름(rad) * 2 - 반환값이 있는 형태
		double result = 3.14 * rad * 2;
		return result; // return(반환) 하는데 void 때문에 에러남. void를 double로 바꿔준다
	}
		// 원의 넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과 출력된다
		// 원의 둘레를 구하는 함수는 반환값이 있어 값을 반환 받아 출력한다.
	
	public static void main(String[] args) {

		circleArea(10.2);
		
		System.out.println("원의 둘레:"+ circleRound(12.3));
		
		/*
		 문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
		원의 반지름을 파라메타(매개변수라는 뜻)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자.
		이를 호출하는 main 메소드를 정의하라.
		
		메소드명 : circleArea() > 원의 넓이, circleRound() > 원의 둘레
		 - 넓이 공식 : 3.14 * 반지름 * 반지름
		 - 둘레 공식 : 3.14 * 반지름 * 2
		*/
		
		/*
		 풀이 : 실수는 결과값이 다를 수 있다.
		 */
		
	}

}
