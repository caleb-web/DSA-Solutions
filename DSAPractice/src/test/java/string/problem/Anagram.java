package string.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram {

	@Test
	  public void example1() {
		  String s1="silent";
		  String s2="listen";
		  boolean anagram=isAnagram(s1, s2);
		  Assert.assertEquals(true, anagram);
	  }
	
	@Test
	  public void example2() {
		  String s1="Silent";
		  String s2="Listen";
		  boolean anagram=isAnagram(s1, s2);
		  Assert.assertEquals(false, anagram);
	  }
	
	@Test
	  public void example3() {
		  String s1="ABCD";
		  String s2="CBA";
		  boolean anagram=isAnagram(s1, s2);
		  Assert.assertEquals(false, anagram);
	  }
	
	@Test
	  public void example4() {
		  String s1="AABCD";
		  String s2="CBAD";
		  boolean anagram=isAnagram(s1, s2);
		  Assert.assertEquals(false, anagram);
	  }
	
		/*Pseudo Code
		 * If the length not same, return false
		 * Take the String input and convert into the character array
		 * add the character into list 
		 * Compare both
		*/
	
	private boolean isAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		List<Character> l1=new ArrayList<>();
		List<Character> l2=new ArrayList<>();
		
		for (int i = 0; i < c2.length; i++) {
			l1.add(c1[i]);
			l2.add(c2[i]);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		if(l1.equals(l2))
			return true;
		else 
			return false;
	}
	
}
