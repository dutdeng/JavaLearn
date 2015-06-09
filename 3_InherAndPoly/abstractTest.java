public class abstractTest{
	public static void main(String[] args){
		Circle c = new Circle(5);
		Shape s = c;
		System.out.println(s.area());
		Rectangle r = new Rectangle(3,4);
		s = r;
		System.out.println(s.area());
	}
}

abstract class Shape{
	public abstract double area();
}

class Circle extends Shape{
	private double r;
	public Circle(double r){
		this.r = r;
	}
	public double area()
	{
		return Math.PI*r*r;
	}
}

class Rectangle extends Shape{
	private double w, h;
	public Rectangle(double w,double h){
		this.w = w;
		this.h = h;
	}
	public double area()
	{
		return w*h;
	}
}
