package com.dsalearn.dsapractice;

import org.testng.annotations.Test;

public class Vowels {
  @Test
  public void example() {
	  String str="interviewbit";
	  System.out.println(vowelCount(str));
  }
  
  public String vowelCount(String str) {
	  String str1="";
	  for (int i = 0; i < str.length(); i++) {
	      char c=str.charAt(i);
	      if(isVowel(c))
	      {
	          str1=str1+c;
	  }
	  }  
	  return str1;
  }

public static boolean isVowel(char character)
{

  if(character=='a' || character=='e' || character=='i' ||  character=='o' ||
          character=='u' ){
      return true;
  }else{
      return false;
  }
}
}
