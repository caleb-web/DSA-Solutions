package string.problem;

import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindUniqueCharacter {
	
	@Test
	  public void example1() {
		  String s1="Testleaf";
		  char[] output= {'s', 'l', 'a', 'f'};
		  char[] unique = getUnique(s1);
		  Assert.assertEquals(output, unique);
	  }
	
	@Test
	  public void example2() {
		  String s1=" Babu $#$ ";
		  char[] output= {'a', 'u', '#'};
		  char[] unique = getUnique(s1);
		  Assert.assertEquals(output, unique);
	  }
	
	@Test
	  public void example3() {
		  String s1="aaa";
		  char[] output= {};
		  char[] unique = getUnique(s1);
		  Assert.assertEquals(output, unique);
	  }
	
	@Test
	  public void example4() {
		  String s1="abc";
		  char[] output= {'a', 'b', 'c'};
		  char[] unique = getUnique(s1);
		  Assert.assertEquals(output, unique);	  
		  }
	
		/*Pseudo Code
		 * Take the String convert the lower case and convert to the character array
		 * Create a Set
		 * Iterate from the right from left
		 *     a) Check if the given character is already in the Set ->yes remove it.
		 *     b) Not in the set add it
		 *  Finally return the character array   
		*/
	
      private char[] getUnique(String s1) {
    	  char[] c1 = s1.toLowerCase().toCharArray();
    	  Set<Character> unique= new LinkedHashSet<>();
    	  Set<Character> dups= new LinkedHashSet<>();
    	  
    	  for (Character c : c1) {
			if(unique.contains(c) || dups.contains(c)) {
				unique.remove(c);
				dups.add(c);
			}else {
				unique.add(c);
			}
		}
    	  char[] ch = new String(unique.toString().replaceAll("[\\[\\], ]", "")).toCharArray();
    	return ch;
      }

}
