package string.problem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondLeastCharacter {
	
	@Test
	  public void example1() {
		  String s1="aaaabbcccdeee";
		  char output = getSecondLeastCharacter(s1);
		  Assert.assertEquals(output, 'c');
	  }
	
	//@Test
	  public void example2() {
		  String s1=" Babu $#$ ";
		  char output = getSecondLeastCharacter(s1);
		  Assert.assertEquals(output, 'a');
	  }
	
	//@Test
	  public void example3() {
		  String s1="aaa";
		  char output = getSecondLeastCharacter(s1);
		  Assert.assertEquals(output, 'a');
	  }
	
	//@Test
	  public void example4() {
		  String s1="abc";
		  char output = getSecondLeastCharacter(s1);
		  Assert.assertEquals(output, 'a');
		  }
    
	/*Pseudo Code
	 * Take the String convert to the character array
	 * Create a map
	 * Add the character array to map
	 * Iterate from the right from left
	 * Traverse through the map and find the min value!!
	 * Based on the min value, Find the Character. 
	*/
	
	private char getSecondLeastCharacter(String s1) {
		char[] ch = s1.toLowerCase().toCharArray();
		int minValue=Integer.MAX_VALUE;
		int secondLeast=Integer.MAX_VALUE;
		
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			Integer currentValue = entry.getValue();
			if(currentValue<minValue) {
				secondLeast=minValue;
				minValue=currentValue;
				}
				else if(currentValue<secondLeast){
					secondLeast=currentValue;
				}
			if(entry.getValue()==secondLeast) {
				return entry.getKey();
			}
		}
		return 0;
	}
	
	
}
