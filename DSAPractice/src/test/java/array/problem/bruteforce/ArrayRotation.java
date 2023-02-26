package array.problem.bruteforce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayRotation {
	@Test
	public void example1() {
		int[] numbers = { 2, 3, 1, 4, 7, 5, 19 };
		int k=3;
		int[] indices = getRotationArray(numbers, k);
        Assert.assertEquals(indices, new int[] {7, 5, 19, 2, 3, 1, 4});
	}

	@Test
	public void example2() {
		int[] numbers = { 2, 3, 0, 5, 7, 5, 19, 0, -2, 1 };
		int k=5;
		int[] indices = getRotationArray(numbers, k);
		Assert.assertEquals(indices, new int[] {5, 19, 0, -2, 1, 2, 3, 0, 5, 7});
	}
	
	public static void reverse(int[] nums, int left, int right){
	      while(left<right){
	    	  int temp = nums[left];
	          nums[left++] = nums[right];
	          nums[right--] = temp;
	      }
	   }
	
	public int[] getRotationArray(int[] nums, int k) {
      k = k % nums.length;
      reverse(nums,0,nums.length-1);
      reverse(nums,0,k-1);
      reverse(nums,k,nums.length-1);
	return nums;
	}
}
