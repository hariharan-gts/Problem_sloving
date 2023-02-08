package trial2;

import java.util.Arrays;

/*
 20. Array - Surpasser Count
Given integer array, return new array where each element is replaced with the count of number
of elements which are greater towards it right
Input: [10, 12, 5, 40, 21, 70, 1, 49, 37]
Output: [6, 5, 5, 3, 3, O, 2, O, 0]
21. Array - Exponential form
Given a String which has a number, return a string which is a exponential representation of that
number using prime factors (only using 2,3,5,7). and 'X are used in the representation.
Input:
Input string: "24"
Output: "2A3X3A1 "
Input: "32"
Output: "2A5"
Input: "245"
Output: "5AIXT2"
 */
public class Q11 {
    public static void supCount(int a[]) {
    	int ans[]=new int[a.length];
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]<a[j]) {
    				ans[i]++;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(ans));
    }
    public static boolean isPrime(int n) {
    	if(n==2||n==3)
    		return true;
    	if(n%2==0||n%3==0)
    		return false;
    	for(int i=5;i<=Math.sqrt(n);i++) {
    		if(n%i==0)
    			return false;
    	}
    	return true;
    }
    public static String expF(int n) {
    	String ans="";
    	for(int i=2;i<Integer.MAX_VALUE&&n>1;i++) {
    		if(isPrime(i)) {
    			int cnt=0;
    			while(n>0&&n%i==0) {
    				cnt++;
    				n/=i;
    			}
    			if(n>1&&cnt>0)
    				ans=ans+i+"^"+cnt+"X";
    			else if(cnt>0)
    				ans=ans+i+"^"+cnt;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
//		int a[]= {10, 12, 5, 40, 21, 70, 1, 49, 37};
//		supCount(a);
		System.out.println(expF(245));

	}

}
