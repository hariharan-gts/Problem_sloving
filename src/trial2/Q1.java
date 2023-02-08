package trial2;
import java.util.*;
/*
 Find dup character In a given string, there is one character which appears twice. Find a function
to find the character and return it.
Input: "hello"
Output : 'l'
Input: "asdfghjatt
Output: 'a'
 */
public class Q1 {
   public static char charDup(char a[]) {
	   int f[]=new int[256];
	   char c='a';
	   for(int i=0;i<a.length;i++) {
		   f[a[i]]++;
		   if(f[a[i]]>1) {
			   return a[i];
		   }
	   }
	   return c;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
        System.out.println(charDup(s.toCharArray()));
		sc.close();
	}

}
