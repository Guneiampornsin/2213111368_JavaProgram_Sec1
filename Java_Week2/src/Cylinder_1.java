public class Cylinder_1 extends Circle_1{
	private double height;
	
	public Cylinder_1(double radius , double height) {
		super(radius,null);
		this.height = height;
		
	}

	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return super.getArea() *height;
	}
	
	@Override
	public double getArea() {
		return 2* Math.PI*(height+super.getRadius()) ;
	}
	@Override
	public String toString() {
		return "height = "+height+super.toString();
	}
}
