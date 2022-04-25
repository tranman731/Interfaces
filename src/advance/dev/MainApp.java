package advance.dev;
import java.util.Scanner;

import advance.dev.models.Circle;
import advance.dev.models.Rectangle;
import advance.dev.models.Triangle;
import basic.dev.IShape;
import basic.dev.ShapeManager;

public class MainApp {
	public static void main(String[] args) {
		IShape shapeManager = new ShapeManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 2 hinh tron");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap vao ban kinh");
			double radius = sc.nextDouble();
			sc.nextLine();
			shapeManager.add(new Circle(radius));
		}
		
		System.out.println("Nhap vao 2 hinh chu nhat");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap vao canh a");
			double a = sc.nextDouble();
			sc.nextLine();
			

			System.out.println("Nhap vao canh b");
			double b = sc.nextDouble();
			sc.nextLine();
			
			shapeManager.add(new Rectangle(a, b));
		}
		

		System.out.println("Nhap vao 1 hinh tam giac");
		System.out.println("Nhap vao canh a");
		double a = sc.nextDouble();
		sc.nextLine();
		

		System.out.println("Nhap vao canh b");
		double b = sc.nextDouble();
		sc.nextLine();

		System.out.println("Nhap vao canh c");
		double c = sc.nextDouble();
		sc.nextLine();
		
		shapeManager.add(new Triangle(a, b, c));
		
		System.out.println("Thong tin mang shape vua nhap");
		IShape.print();
	}
}