import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int []nums = new int [5];
		for (int i=0 ; i<nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		}
		showEven(nums);
		showOdd(nums);
	}
	
	public static void showEven(int[] nums) {
		String space = " ";
		for (int _nums : nums) {
			if (_nums % 2 == 0) {
				space = space + _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null,
		"List of even number: " + "\n"+space );
	}
	public static void showOdd(int[] nums) {
		String space = " ";
		for (int _nums : nums) {
			if (_nums % 2 != 0) {
				space = space + _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null,
		"List of odd number: " + "\n"+space );
	}
}	

