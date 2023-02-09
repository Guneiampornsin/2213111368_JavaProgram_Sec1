import java.util.*;
public class ShapeDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input Height");
		double height = scan.nextDouble();
		
		Circle_1  circle = new Circle_1(radius , null);
		
		System.out.println();
		System.out.println("Circle[radius =" +radius+"]");
		System.out.println("Circle[area ="+circle.getArea()+"]");
		
		Cylinder_1 cylinder = new Cylinder_1(radius,height);
		System.out.println();
		System.out.println("Cylinder[height="+height+",radius="+radius+"]");
		System.out.println("Cylinder[area="+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume="+cylinder.getVolume()+"]");
		
	}

}
