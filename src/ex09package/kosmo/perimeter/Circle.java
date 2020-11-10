package ex09package.kosmo.perimeter;

public class Circle {

	double rad;
	final double PI;
	
	public Circle(double rad)
	{
		this.rad = rad;
		PI = 3.14159;
	}
	public double getPerimeter() //원의 둘레 계산
	{
		return 2 * PI * rad;
	}
}
