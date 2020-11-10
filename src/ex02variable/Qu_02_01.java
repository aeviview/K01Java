package ex02variable;

public class Qu_02_01 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 총점을 구해라
		// 먼저 변수를 선언하고, 변수끼리 연산한다.
		// 변수는 숫자가 먼저 오면 안되고, 가독성이 좋도록 만들어야 한다.
		
		int kor = 89, eng = 99, math = 78;
			
		System.out.print("국어:"+kor);
		System.out.print("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+(kor + eng + math));
		
	}

}
