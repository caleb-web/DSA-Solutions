package string.problem;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindLargestSubString {
	@Test
	  public void example1() {
		  String s1="aaaabcbcccdeee";
		  int output = getLargestSubStringCount(s1);
		  Assert.assertEquals(output, 3);
	  }
	
	//@Test
	  public void example2() {
		  String s1=" Babu $#$ ";
		  int output = getLargestSubStringCount(s1);
		  Assert.assertEquals(output, 3);
	  }
	
	//@Test
	  public void example3() {
		  String s1="aaa";
		  int output = getLargestSubStringCount(s1);
		  Assert.assertEquals(output, 3);
	  }
	  
	  
	  private int getLargestSubStringCount(String s1) {
		  int n = s1.length();
		    Set<Character> set = new HashSet<>();
		    int left = 0, right = 0, maxLength = 0;
		    
		    while (right < n) {
		        if (!set.contains(s1.charAt(right))) {
		            set.add(s1.charAt(right));
		            right++;
		            maxLength = Math.max(maxLength, right - left);
		        } else {
		            set.remove(s1.charAt(left));
		            left++;
		        }
		    }
		    
		    return maxLength;
	  }
}
