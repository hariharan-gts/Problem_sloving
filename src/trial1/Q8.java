package trial1;

import java.util.Scanner;

/*
 Given a string, look for a mirror image (backwards) string at both the beginning and end of
the given string. In other words, zero or more characters at the very begining of the given
string, and at the very end of the string in reverse order (possibly overlapping). For
example, the string "abXYZba" has the mirror end "abt'.
mirrorEnds("abXYZba") "ab"
mirrorEnds("abca") "a"
mirrorEnds("aba") "aba"
 */
public class Q8 {
    public static String mirrorEnds(String s) {
    	String ans="";
    	int st=0,en=s.length()-1;
    	while(st<s.length()&&en>=0) {
    		if(s.charAt(st)==s.charAt(en)) {
    			ans+=s.charAt(st);
    			st++;
    			en--;
    		}
    		else
    			break;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(mirrorEnds(s));
		sc.close();

	}

}
