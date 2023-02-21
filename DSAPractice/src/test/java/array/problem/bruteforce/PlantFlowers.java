package array.problem.bruteforce;

import org.testng.annotations.Test;

public class PlantFlowers {

	@Test
	public void example1() {
		int[] nums= {1, 0, 0, 0, 1};
		int n=1;
		System.out.println("Is all planted?" +isPrintable(nums, n));
	}
	
	@Test
	public void example2() {
		int[] nums= {0, 0, 1, 0, 1, 0, 0};
		int n=2;
		System.out.println("Is all planted?" +isPrintable(nums, n));
	}
	
	@Test
	public void example3() {
		int[] nums= {1, 0, 1, 0, 1, 0, 1};
		int n=1;
		System.out.println("Is all planted?" +isPrintable(nums, n));
	}
	
	/*pseudo Code
	 * Iterate through the each element in the array
	 * intialize the 2 variable left and right and assign zero to both
	 * if the index is greater than zero, left=nums[i-1]
	 * if the less than nums length, right=nums[i+1]
	 * current element, left and right should be zero, then replace the current index element as 1 and
	 * Decrement the n value 
	 * if n becomes zero return true
	 * else return false
	*/
	
	private boolean isPrintable(int[] nums, int n) {
		
		for (int i = 0; i < nums.length; i++) {
		   int left=0;
		   int right=0;
		   
		  if(i>0) 
			  left=nums[i-1];
		  if(i<nums.length-1)
			  right=nums[i+1];
		  
		  if(nums[i]==0 && left==0 && right==0) {
			  nums[i]=1;
			  n--;
		  }
		}
		if(n==0)
			return true;
		
		return false;
	}
}
