package week1;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveToZeros {
	
	@Test
	public void eg1() {
		int[] nums= {4,1,0,3,0,10};
		int[] sortSquare = method1(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {4, 1, 3, 10, 0, 0 }));
	}
	
	//@Test
	public void eg2() {
		int[] nums= {-4,-1,0,3,10};
		int[] sortSquare = method1(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {0, 1, 9, 16, 100 }));
	}
	
	//@Test
	public void eg3() {
		int[] nums= {-4,-1,0,3,10};
		int[] sortSquare = method1(nums);
		assertEquals(true, Arrays.equals(sortSquare, new int[] {0, 1, 9, 16, 100 }));
	}
	/*psedocode
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

}
