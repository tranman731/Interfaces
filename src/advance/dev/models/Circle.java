package advance.dev.models;

public class Circle extends Shape {
	public double radius;
	

	public Circle(double bk) {
		super();
		this.radius = radius;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	

}