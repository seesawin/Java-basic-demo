package tw.com.seesawin.ex05;

public class Oop3 {
	public static void main(String[] args) {

		Circle c1 = new Circle();
		Shape c2 = c1;
		Object c3 = c1;

		Shape s1 = new Triangle();
		Object s2 = s1;
		
		Object obj1 = new Rectangle();
		
		Object x1 = new Circle();
		Shape x2 = (Shape) x1;
		Circle x3 = (Circle) x1;
		
		Triangle x4 = (Triangle) x1;
		Rectangle x5 = (Rectangle) x1;
		
	}
}

class Shape extends Object { }
class Circle extends Shape { }
class Triangle extends Shape { }
class Rectangle extends Shape { }
