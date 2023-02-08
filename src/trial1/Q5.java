package trial1;

import java.util.Scanner;

/*
 We'll say that a "triple" in a string is a char appearing three times in a row. Return the
number of triples in the given string. The triples may overlap.
countTriple("abcXXXabc") 1
countTriple("xxxabyyyycd") -4 3
countTriple("a") 0
 */
public class Q5 {
   public static int countTriple(char a[]) {
	   int cnt=0;
	   for(int i=0;i<a.length-3;i++) {
		   if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
			   cnt++;
	   }
	   return cnt;
   }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   System.out.println(countTriple(s.toCharArray()));
	   sc.close();
   }
}
