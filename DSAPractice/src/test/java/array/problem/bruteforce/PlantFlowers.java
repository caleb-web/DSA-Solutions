package array.problem.bruteforce;

import org.testng.annotations.Test;

public class PlantFlowers {
	
	/*
	 * 1) Did I understand the problem? Yes or No !!
	 *      -> If No, Ask the person to provide more details with example(s)
	 *      -> If Yes, go to next step !!
	 *    
	 *    What is the input(s)
	 *    What is the expected output?
	 *    Do I have constraints to solve the problem
	 *    Do I have all informations to go to next step !!
	 *    How big your test data set will be?
	 *    
	 * 2) Test data set
	 * 
	 *      Minimum of 3 data set !! Positive, Edge, Negative
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 *      
	 * 3) Do I know how to solve it?
	 *      
	 *       Yes - great, is there alternate?
	 *       No - Can I break down the problem into sub problems?
	 *       
	 * 4) Ask for hint(If you dot know to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 *       Yes - What are those?
	 *       No - Thats is still fine, proceed to solution by what you know !!
	 *       
	 * 6) If you know the alternate solutions -> find out the O Notations(Performance)
	 * 
	 *       Then explain the both or best(depends on time)
	 *       
	 *       Approach 1: Start with worst ->Improve(Optimize) -> End up with the best
	 *       Approach 2: Write down the options and benefits and code the best
	 *       
	 * 7) Start always with Pseudo Code
	 * 
	 * 8) Implement them in the code(editor)
	 *       
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 *       
	*/

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
	 * current element, left and right should be zero, then replace the current index element as 1 and decrement the n value 
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
