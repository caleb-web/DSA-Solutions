package array.problem.bruteforce;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveToZeros {
	
	@Test
	public void example1() {
		int[] nums= {1, 2, 0, 4, 3, 0, 5, 0};
		int[] sortSquare = method1(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {1, 2, 4, 3, 5, 0, 0,0 }));
	}
	
	@Test
	public void example2() {
		int[] nums= {1, 2, 0, 0, 0, 3, 6};
		int[] sortSquare = method2(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {1, 2, 3, 6, 0, 0, 0 }));
	}
	
	@Test
	public void example3() {
		int[] nums= {1, 2, 3, 4, 5, 6};
		int[] sortSquare = method2(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {1, 2, 3, 4, 5, 6 }));
	}
	/*pseudo Code
	 * initailze the new output array
	 * intialize the index variable for output array
	 * Iterate the each element from the input array
	     * If the element is not equal to zero
	     * add that element to the output array
	     * else continue the loop
	 * 
	*/
	
	// Brute force
	
	private int[] method1(int[] arr) {
		int[] output=new int[arr.length];
		int index=0;
		
		for (int i : arr) {
			if(i!=0) {
				output[index++]=i;
			}
		}
		return output;	
	}
	
	/* pseudo Code
	 * intialize an index variable
	 * Iterate through the each element in the input array
	      * If the element is non zero
	      * then we are going to replace it in the current index position
	      * else continue the looping
	 * loop till index becomes more than the input array length
	 * while looping, We'll add the index position as 0
	*/
	
	private int[] method2(int[] nums) {
		int index=0;
		
		for (int i : nums) {
			if(i!=0)
				nums[index++]=i;
		}
		
		while(index<nums.length) {
			 nums[index++]=0;
		}
		return nums;
	}
}
