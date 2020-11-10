package ex08class;


/*
 [생성자 Constructor] => void를 쓰지 않는다(반환값이 없기 때문)
 	- 클래스를 객체화(인스턴스) 할 때 자동으로 호출되는 메소드
 	- 자동으로 호출되며, 개발자가 임의로 호출할 수 없다
 	- 반환값이 없다. 즉, 특정 연산 후 임의로 호출을 반환 할수 없다.(void 미사용)
 	- 그 외는 메소드가 가진 모든 특성을 가지고 있다.(매개변수전달, 오버로딩 등)
 	
 	생성자 내에서 this 사용법
 	용도 1) : 동일 클래스 내에서 다른 생성자를 호출할 때 사용한다.
 		단, 생성자 내에서만 호출 가능하다.
 		사용법 - this(인자1, 인자2, ... );
 	용도 2) : 생성자내에서 멤버변수와 매개변수의 이름이 동일 할 때 구분 위해서 사용한다.
 		this.변수 => 멤버변수
 		변수 => 생성자의 매개변수
 		단, 이름이 서로 다르다면 this는 생략해도 된다.
 		주로 명시적인 코드작성을 위해 사용된다.
 */
public class PersonConstructor {

	//멤버변수
	String name;
	int age;
	String addr;
	
	/*
	 [디폴트생성자]
	 	- 해당 클래스에 생성자를 정의하지 않은 경우에 아래와 같은 매개변수,
	 	실행부가 없는 생성자가 자동으로 삽입된다.
	 	단, 생성자를 하나라도 정의하면 디폴트 생성자는 삽입되지 않는다.(주의)
	 */
	//public PersonConstructor() {} 이런 존재만 알고 있어라 (자동으로 생김)
	
	//생성자 1 : 기본생성자 => 생성자가 없다
	public PersonConstructor()
	{
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다");
	}
	
	//생성자 2 : 인자생성자
	public PersonConstructor(String name)    //인자가 하나짜리 생성자
	{  
			//멤버변수와 매개변수를 구분하기 위해 this를 사용한다. (this는 '내꺼'라는 뜻으로 해석)
			this.name = name; //멤버변수도 name(앞)이고 매개변수도 name(뒤)이다.
			age = 1;
			addr = "출처불명";
			System.out.println("나는 인자생성자[1] 입니다");
	}
	
	public PersonConstructor(String name, int age) // 인자가 두개인생성자
	{
		/*
		 this()는 생성자내에서 다른 생성자를 호출할 때 사용된다.
		 단, 생성자내에서만 사용 가능하고, 일반 멤버메소드에서는 사용 불가능하다.
		 */
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	public PersonConstructor(String _name, int age, String addr)
	{
		name = _name; // 매개변수와 멤버변수명이 다르면 this를 쓰지 않아도 된다.(_사용함)
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}
	
	void initialize(String name, int age, String addr)
	{
		//this(name, age, "미상");
		//위 코드는 생성자 내에서만 사용할 수 있기 때문에 err 난다.
		//생성자는 void를 사용하지 않는 메소드
		
		//멤버변수를 구분하기 위한 this는 멤버메소드에서도 사용가능하다.
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo()
	{
		System.out.printf("%s 님의 정보\n", this.name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("주소 : %s\n", addr);
	}
	
}
 // 실행이 안됨. 메인함수 작성이 아직 안되었기 때문이다
 // 메인함수는 E05PersonConstructor 클래스에서 작성하겠다