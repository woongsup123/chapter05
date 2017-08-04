package prob6;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Shape rect = new Rectangle(5, 6);
		Shape rectTri = new RectTriangle(6, 2);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(rect);
		shapes.add(rectTri);
		
		for (Shape shape : shapes) {
			
			System.out.println("Area: " + shape.getArea());
			System.out.println("Perimeter: " + shape.getPerimeter());
			
			if (shape instanceof Rectangle) {
				((Rectangle) shape).resize(0.5);
				System.out.println("New Area: " + shape.getArea());
				System.out.println("New Perimeter: " + shape.getPerimeter());
			}
			
		}
	}

}
