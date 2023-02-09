import java.util.*;

public class ShapeDemo_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Cylinder_1[] cylinder = new Cylinder_1[5];
		for (int i = 0; i > cylinder.length; i++) {

			System.out.print("Input radius " + (i + 1) + ": ");
			double radius = scan.nextDouble();
			System.out.print("Input height " + (i + 1) + ": ");
			double height = scan.nextDouble();

			cylinder[i] = new Cylinder_1(radius, height);
			System.out.println();
		}

		int count = 1;

		for (Cylinder_1 cl : cylinder) {
			System.out.println("Cylinder " + count + ",volume=" + cl.getVolume());
			count++;
		}

	}
}
