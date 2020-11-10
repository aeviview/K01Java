package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {

		/* 반지름이 10인 원의 넓이를 구해라
		 원의 넓이 : 반지름 * 반지름 * 3.14
		 int형, float형, double형 모두 구해라
		*/
		
		int area_int = 10;
		float area_float = 10F;
		double area_double = 10;
		
		final float PI = 3.14F;
		//강제형변환을 할수있는지 알아보는 문제
		//큰 자료형을 작은 자료형에 대입할 때는 자료 손실이 있을 수 있다.
		//int < float,double , int < long
		System.out.println("int형 넓이:"+ (int)(area_int*area_int*PI));
		System.out.println("float형 넓이:"+ area_float*area_float*PI);
		System.out.println("double형 넓이:"+ (float)(area_double*area_double*PI));
		
	}

}
