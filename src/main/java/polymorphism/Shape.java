package polymorphism;

import java.util.*;

public class Shape {
	private int i;

	public Shape() {

	}

	public Shape(int i) {
		this.i = i;
		System.out.println("constructor shape " + i);

	}

	public void draw() {
	}

	public void erase() {
	}

	public void printMessage() {

		System.out.println("Shape.printMessage()");

	}

}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle.draw()");
	}

	public void erase() {
		System.out.println("Circle.erase()");
	}

	public void printMessage() {
		System.out.println("Circle.printMessage()");
	}
}

class Square extends Shape {
	private int i;

	public Square() {

		System.out.println("constructor square");
	}

	public Square(int i) {
		this.i = i;
		System.out.println("constructor square" + i);
	}

	public void draw() {
		System.out.println("Square.draw()");
	}

	public void erase() {
		System.out.println("Square.erase()");
	}

	public void printMessage() {
		System.out.println("Square.printMessage()");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	public void erase() {
		System.out.println("Triangle.erase()");
	}

	public void printMessage() {
		System.out.println("Triangle.printMessage()");
	}

}

class Cube extends Shape {
	public void draw() {
		System.out.println("Cube.draw()");
	}

}

class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(5)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Cube();
		}
	}
}

class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		// Shape sh = new Triangle();
		// sh.printMessage();
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// Make polymorphic method calls:
		for (Shape shp : s) {
			if (!(shp instanceof Circle)) {
				shp.draw();
			}
			// shp.printMessage();
		}

		// shp.printMessage();
		System.out.println("--------------------------");

		Square sq = new Square(77);
		sq.draw();
		// Square sq2= new Square();
		Shape sh = sq;
		sh.draw();
		Square sq2 = (Square) sh;
		sq2.draw();
		Circle cr = new Circle();
		if (sh instanceof Circle) {
			cr = (Circle) sh;

		}
		System.out.println(Circle.class);

	}
}