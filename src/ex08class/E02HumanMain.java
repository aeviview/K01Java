package ex08class;
// Human 클래스와 같은 package 안에 있기 때문에
// import 없이 공유할 수 있다

/*
  해당 예제에서는 Human 클래스를 외부파일로 선언하였다.
  동일한 패키지에 정의된다면 컴파일러는 해당 클래스를 찾아서 즉시, 객체(인스턴스)화 할 수 있다.
  만약 다른 패키지에 선언된 클래스라면 반드시 import 선언을 해줘야한다.
 */
public class E02HumanMain {

	public static void main(String[] args) {
		
		// Human 클래스의 객체를 설정하고 여러가지를 한다
		// 1. 객체생성
		Human human = new Human();
		// 2. 객체의 초기화
		human.name = "치영";
		human.age = 35;
		human.energy = 4;
		// 3. 멤버메소드를 통해 상태 등의 행동을 구현한다
		human.showState();
		human.eating();
		human.walking();
		human.fighting();
		human.showState();
		// 4. 에너지를 고갈 시켜본다. walking()메소드 20번 반복 호출
		for(int i=1 ; i<=20 ; i++)
		{
			human.walking();
		}
		human.showState();
		// 5. 에너지가 최대치를 넘는지 확인한다. eating()메소드 20번 반복 호출
		for(int i=1 ; i<=20 ; i++)
		{
			human.eating();
		}
		human.showState();
	}

}
