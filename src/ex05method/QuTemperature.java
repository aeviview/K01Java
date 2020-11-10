package ex05method;

public class QuTemperature {

	// 섭씨 -> 화씨
	static double celsiusToFahrenheit(int cel) { // 함수 첫글자는 소문자, 리턴 함수기 때문에 void 쓰지 않는다
		return 1.8 * cel + 32;
	}
	
	// 화씨 -> 섭씨
	static double fahrenheitToCelsius(int fah) {
		return (fah-32) / 1.8;
	}
	
	public static void main(String[] args) { //반환값을 가지고 있으므로 메인에서 출력
		
		System.out.print("섭씨 20도 -> 화씨=");
		System.out.println(celsiusToFahrenheit(20));

		System.out.print("화씨 98도 -> 섭씨=");
		System.out.println(fahrenheitToCelsius(98));
		
		
		/*
		문제5-3) 파일명 : QuTemperature.java  (난이도:중)
		섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
		화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
		*/
		
		/*
		 화씨 = 1.8 * 섭씨 +32
		 섭씨 =(화씨-32) / 1.8
		 */
		
		/*
		 풀이 : 
		 */
		
		
		
	}

}
