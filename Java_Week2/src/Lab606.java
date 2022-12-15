import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		checkIndex(nums,index);
		while(checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again: "));
		}//end of while-loop
		int currentnum =currentData(nums , index);
		int previous=prevData(nums , index);
		int next=nextData(nums , index);
		
		
		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + index + "] is " + currentnum +
				((previous==0) ? "\nNo previous data" : "\nPrevious data, nums [" 
				+ (index-1) + "] is " + previous) +
				((next==0) ? "\nNo next data" : "\nNext data, nums [" 
				+ (index+1) + "] is " + next)
				);
		
	}//end of main
	public static boolean checkIndex(int[] nums , int index) {
		return (index < 0 || index > (nums.length-1));
	}//end of checkIndex
	
	public static int currentData(int[] nums , int index) {
		int found = 0;
		found = nums[index];
		return found;
	}//end of currentData
	public static int prevData(int[] nums , int index) {
		if (index-1 < 0) {
			return 0;
		}else {
	    	return nums[index-1];
		}
	}//end of prevData
	public static int nextData(int[] nums , int index) {
		if (index+1 > (nums.length-1)) {
			return 0;
		}else {
    	return nums[index+1];
		}
	}//end of nextData
}
