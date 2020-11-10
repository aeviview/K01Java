/*
 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자.
 init 메소드를 통해 밑변과 높이를 초기화한다.
 그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.
*/

//set형 : 설정, get형 : 반환
package ex08class;



class Triangle
{
	//멤버변수
	int bottom; //밑변
	int height; //높이
	
	public void init(int bottom, int height)
	{
		//밑변과 높이를 초기화하는 멤버메소드
		this.bottom = bottom; //멤버변수와 매개변수 구분을 위해 this 사용
		this.height = height; //this대신 언더바를 붙여서 다른 이름으로 할 수 있다(거의 사용 안함)
							  //height = _height;
	}
	
	public double getArea()
	{
		return bottom*height*0.5; //삼각형 넓이를 구하는 공식
	}
	public void setBottom(int bot) //매개변수 int bot
	{
		bottom = bot; // 밑변을 설정
	}
	public void setHeight(int hei) //매개변수 int hei
	{
		height = hei; // 높이를 설정
	}
}

public class QuTriangle {

	public static void main(String[] args)
	{
	Triangle t = new Triangle();
	t.init(10, 17); //밑변10, 높이17로 초기화
	
	System.out.println("삼각형의 넓이 : " + t.getArea());
	t.setBottom(50);//밑변 50으로 변경
	t.setHeight(14);//높이 14로 변경
	
	System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
