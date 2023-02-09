import java.util.Scanner;
import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			Cylinder_1[] cylinder = new Cylinder_1[5];
			
			for (int i = 0; i > cylinder.length; i++) {
				double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i+1)+ ":"));
				double height = Double.parseDouble(JOptionPane.showInputDialog("Input height " + (i+1)+ ":"));
				
				cylinder[i] = new Cylinder_1(radius,height);
			}
			
			int count = 1;
			String text = "";
			
			for(Cylinder_1 cl : cylinder) {
					text = text + "Cylinder " +count + ",volume=" + cl.getVolume() + "\n";
					count++;
			}
			JOptionPane.showMessageDialog(null,text);
	}

}
