package com.dsalearn.dsapractice;

import java.util.ArrayList;
import java.util.List;

public class ArmStrong {
	
	public boolean findArmstrong(int A){
        int originalNumber, remainder, result = 0;

        originalNumber = A;
       while(originalNumber!=0){
          remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
       }
       if(result==A){
         return true;
       }
       else{
         return false;
       }
    }
    public int[] solve(int A) {
        int[] arr=new int[A];
        ArrayList<Integer> ls=new ArrayList<>();
        ls.toArray();
        for(int i=0; i<=A; i++){
            if(findArmstrong(i)==true){
             for(int j=0; j<=i; j++) {
            	 arr[j]=i;
             }
            }
        }
        return arr;
    }

	public static void main(String[] args) {
		
		ArmStrong aS=new ArmStrong();
		int[] solve = aS.solve(149);
		System.out.println(solve);
	}

}
