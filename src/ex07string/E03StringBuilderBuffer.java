package ex07string;

/*
 StringBuffer 클래스
  - String 클래스는 내부 메소드를 이용해서 새로운 문자열을 생성하면
  	원래 문자열은 변하지 않고 새롭게 생성된 메모리에 문자열을 저장한다.
  - 기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기 위해서 StringBuffer 클래스가 사용된다.
  - 해당 클래스는 새로운 메모리를 생성하지 않고 기존 메모리의 문자열을 변경한다.
 */
public class E03StringBuilderBuffer { //StringBuilder 클래스도 있지만 사용하지 않음

	public static void main(String[] args) {

		
		/*
		 append()
		  - 문자열의 끝에 새로운 문자열을 연결한다.
		 insert()
		  - 지정한 인덱스 위치에 문자열을 삽입한다.
		 */
		StringBuffer strBuf = new StringBuffer("AB");
		
		strBuf.append(25);
		strBuf.append("Y").append(true);
		
		System.out.println("strBuf="+ strBuf);
		
		strBuf.insert(2, false); //2번 인덱스에 false를 삽입하겠다!
		strBuf.insert(strBuf.length(), 'Z');
		
		System.out.println("strBuf=" + strBuf);
		
		System.out.println("String과 StringBuffer의 " + "참조값  비교");
		
		
		String str1 = "코스모";
		String str2 = "코스모";
		
		
		if(str1==str2)
			System.out.println("연결 전 : 주소값 동일"); //[출력]
		else
			System.out.println("연결 전: 주소값 다름");
		
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+ buf);
		System.out.println("저장된 문자열 크기 : "+buf.length());
		System.out.println("기본 버퍼 크기 : "+buf.capacity());
		
		buf.append("KOSMO");
		System.out.println("buf="+ buf);
		System.out.println("저장된 문자열 크기 : "+buf.length());
		System.out.println("기본 버퍼 크기 : "+buf.capacity());
		
		buf.append(" 금일은 StringBuffer 공부중임")
			.append(" 오늘은 화욜^^");
		System.out.println("buf="+ buf);
		System.out.println("저장된 문자열 크기 : "+buf.length());
		System.out.println("기본 버퍼 크기 : "+buf.capacity());
		
	}

}
