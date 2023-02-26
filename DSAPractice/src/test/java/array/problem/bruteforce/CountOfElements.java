package array.problem.bruteforce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfElements {
	@Test
	public void example1() {
		int[] arr= {2, 3, 10, 7, 10, 10, 5};
		int maxCandateCount = getMaxCandateCount(arr);
		Assert.assertEquals(maxCandateCount, 4);
	}
	
	@Test
	public void example2() {
		int[] arr= {2, 3, 10, 7, 3, 10, 2, 10, 5};
		int maxCandateCount = getMaxCandateCount(arr);
		Assert.assertEquals(maxCandateCount, 6);
	}
	
	@Test
	public void example3() {
		int[] arr= {5, 5, 5};
		int maxCandateCount = getMaxCandateCount(arr);
		Assert.assertEquals(maxCandateCount, 0);
	}
   
	private int getMaxCandateCount(int[] arr) {
		int N=arr.length;
		int mC=Integer.MIN_VALUE;
		int cnt=0;
		
		for (int i = 0; i < N; i++) {
			if(arr[i]>mC) {
				mC=arr[i];
				cnt=1;
			}
			else if(arr[i]==mC) {
				cnt++;
			}
		}
		return N-cnt;
	}
}
