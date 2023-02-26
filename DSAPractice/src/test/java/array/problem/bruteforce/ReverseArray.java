package array.problem.bruteforce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArray {
	@Test
	public void example1() {
		int[] numbers = { 2, 3, 1, 4, 7, 5, 19 };
		int[] indices = getRevereValues(numbers);
        Assert.assertEquals(indices, new int[] {19, 5, 7, 4, 1, 3, 2});
	}

	@Test
	public void example2() {
		int[] numbers = { 2, 3, 0, 5, 7, 5, 19, 0, -2, 1 };
		int[] indices = getRevereValues(numbers);
		Assert.assertEquals(indices, new int[] {1, -2, 0, 19, 5, 7, 5, 0, 3, 2});
	}
	
	public static void swap(int[] nums, int left, int right){
	    	  int temp = nums[left];
	          nums[left] = nums[right];
	          nums[right] = temp;
	   }
	
	private int[] getRevereValues(int[] arr) {
		int i=0, j=arr.length-1;
		
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		return arr;
	}
}
