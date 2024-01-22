package 다형성;

public class ShapeMain {
	static void paint(Shape shape) {
		
		shape.draw();
	}
	public static void main(String[] args) {
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}
}

class Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}	
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
