public class Circle_1 extends Shape {

	private double radius;

	public Circle_1(double radius, String color) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public String toString() {
		return "radius =" + getRadius();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius *radius;
	}

}
