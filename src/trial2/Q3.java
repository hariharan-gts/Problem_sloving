package trial2;

import java.util.*;

/*
 Find the intersection of two given string. Return the string which has character which appears in
both string (same sequence order as stringl).
Input:
Stringl:
"Hello"
String2: "world"
Output: "10"
Input:
String l: "hl
String2: "bye
Output: null
 */

public class Q3 {
    public static String inter(String s1,String s2) {
    	String ans="";
    	int f[]=new int[256];
    	for(int i=0;i<s1.length();i++) {
    		f[s1.charAt(i)]++;
    	}
    	for(int i=0;i<s2.length();i++) {
    		f[s2.charAt(i)]++;
    	}
    	for(int i=0;i<256;i++) {
    		if(f[i]>=2)
    		{
    			ans+=(char)i;
    	     }
    		}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(inter(s1,s2));
       sc.close();
	}

}
