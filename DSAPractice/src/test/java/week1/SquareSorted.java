package week1;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import org.testng.annotations.Test;

public class SquareSorted {
	
	@Test
	public void eg1() {
		int[] nums= {-4,-1,0,3,10};
		int[] sortSquare = sortSquareUsingSort(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {0, 1, 9, 16, 100 }));
	}
	// way 1
	private int[] sortSquareUsingSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		bubbleSort(nums);
		return nums;
	}
	
	public static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n-1; i++) {
	        for (int j = 0; j < n-i-1; j++) {
	            if (arr[j] > arr[j+1]) {
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}
	
	//way 2
	
	

}
