package trial2;

import java.util.*;
/*
 Find if the given number in a string, fund if it is jumper number, where the absolute difference
consecutive digits is I
Input: 2345434321
Output: true
Input: 234534
Output: false
 */
public class Q4 {
     public static boolean isJumper(long n) {
    	 if(n<=10)return true;
    	 
    	 long v=n%10;
    	 long r=n/10;
    	 while(r>0) {
    		 long rem=r%10;
    		 if(Math.abs(rem-v)!=1)
    			 return false;
    		 r/=10;
    		 v=rem;
    	 }
    	 return true;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(isJumper(n));
	}

}
