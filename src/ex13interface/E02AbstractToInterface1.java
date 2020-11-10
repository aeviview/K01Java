package ex13interface;

/*
 추상클래스를 interface로 변경하기
 	abstract class -> interface
 	- 메소드의 경우 public abstract를 제거
 	- 멤버상수인 경우 public static final을 제거한다.

 <추상메소드>
 - 오버라이딩의 목적으로 제작된다.
 - 함수의 실행부가 없기 때문에 {}를 쓰지 않고
 */


//프로젝트 전체에서 기준이 될 수 있는 추상클래스 정의
abstract class PersonalNumberStorageAbs
{
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonalInfo(String juminNum);
}
/*
 클래스가 클래스를 상속할 때 => extends
 클래스가 인터페이스를 상속받을 때 => implements
 인터페이스가 인터페이스를 상속할 때 => extends
 
 extends는 '상속'이라 표현하고, implements는 '구현'이라 표현한다.
 */
class PersonalInfoDTO
{
	//멤버변수
	private String name;
	private String juminNum;
	//생성자
	public PersonalInfoDTO(String name, String juminNum)
	{
		this.name = name;
		this.juminNum = juminNum;
	}
	//getter메소드
	String getName() { return name; }
	String getJuminNum() { return juminNum; } 
}


class PersonalNumberStorageExt extends PersonalNumberStorageAbs
{
	//멤버변수
	PersonalInfoDTO[] personalArr; //정보저장용 객체배열
	int numOfPerInfo; //입력정보 카운트용 변수
	//생성자
	public PersonalNumberStorageExt(int arrSize)
	{
		personalArr = new PersonalInfoDTO[arrSize];
		numOfPerInfo = 0;
	}
	
	//상속을 통해 추상메소드를 포함하게 되었으므로 반드시 아래와 같이 오버라이딩 해야한다(필수)
	//전달받은 인자를 통해 DTO객체를 생성한 후 객체배열에 추가한다.
	@Override
	public void addPersonalInfo(String juminNum, String name)
	{
		personalArr[numOfPerInfo] = new PersonalInfoDTO(name, juminNum);
		numOfPerInfo++;
	}
	
	@Override
	public String searchPersonalInfo(String juminNum)
	{
		for(int i=0 ; i<numOfPerInfo ; i++)
		{
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0)
			{
				//getter를 통해 이름을 반환한다.
				return personalArr[i].getName();
			}
		}
		return null; //검색결과가 없는 경우 null 반환
	}	
}


public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage = new PersonalNumberStorageExt(10);
		
		//정보저장
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		//검색
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));

	}

}