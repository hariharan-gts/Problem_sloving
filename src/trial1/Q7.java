package trial1;

import java.util.Scanner;

/*
 Given a string, return the longest substring that appears at both the beginning and end of
the string without overlapping. For example, sameEnds("abXab") is "abt'.
sameEnds("abXYab") "ab'
sameEnds("xx") "x"
sameEnds("xxx") "x"
 */
public class Q7 {
    public static String sameEnds(String s) {
    	String ans="";
    	int st=0,en=s.length()-1;
    	int f[]=new int[256];
    	while(st<en) {
    		if(f[s.charAt(st)]==2||f[s.charAt(en)]==2)
    			break;
    		f[s.charAt(st)]++;
    		f[s.charAt(en)]++;
    		if(st<en-1&&s.charAt(st)==s.charAt(en))
    		ans+=s.charAt(st);
    		else
    	    ans+=s.charAt(st);
    		st++;
    		en--;
    		
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(sameEnds(s));
		sc.close();

	}

}
