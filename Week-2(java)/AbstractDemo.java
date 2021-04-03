abstract class Shape
{
	abstract void display();
}
class Circle extends Shape{
	 void display()
	{
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	 void display()
	{
		System.out.println("Rectangle");
	}
}
class Square extends Shape{
	 void display()
	{
		System.out.println("Square");
	}
}
class AbstractDemo{
	public static void main(String [] args){
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Square();
		s1.display();
		s2.display();
		s3.display();
	}
}