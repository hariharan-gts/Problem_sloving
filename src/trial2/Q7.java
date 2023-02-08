package trial2;

import java.util.Scanner;

/*
 Given two numbers, which are given as Strings, return us a string which is the sum of these two
numbers. Please DO NOT convert to integers using inbuilt string functions.
Input:
String l: "145"
String: "39"
Output: " 184"
 */
public class Q7 {
   public static String cov(char s1[],char  s2[]) {
	 StringBuilder sb=new StringBuilder();
	  int c=0;
	  int i=s1.length-1,j=s2.length-1;
	  while(i>=0&&j>=0) {
		  int v=(s1[i]-'0')+(s2[j]-'0')+c;
		  c=v/10;
		  v%=10;
		  sb.append(v);
		  i--;
		  j--;
	  }
	  while(i>=0) {
		  int  v=(s1[i]-'0')+c;
		  c=v/10;
		  v%=10;
		  sb.append(v);
		  i--;
	  }
	  while(j>=0) {
		  int  v=(s2[j]-'0')+c;
		  c=v/10;
		  v%=10;
		  sb.append(v);
		  j--;
	  }
	  if(c>0) {
		  sb.append(c);
	  }

	  return sb.reverse().toString();
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(cov(s1.toCharArray(),s2.toCharArray()));

	}

}
