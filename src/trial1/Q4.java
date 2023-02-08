package trial1;

import java.util.*;
/*
 We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
left or right. Return true if all the g's in the given string are happy.
gHappy("xxggxx") true
gHappy("xxgxx") false
gHappy("xxggyygxx") false
 */
public class Q4 {
    public static boolean gHappy(char a[]) {
    	for(int i=0;i<a.length;i++) {
    		if(a[i]=='g') {
    			if(i==0&&a[i+1]!='g') {
    				//System.out.println(i+" "+1);
    				return false;
    			}
    			else if(i==a.length-1&&a[i-1]!='g') {
    				//System.out.println(i+" "+2);
    				return false;
    			}
    			else if(i>0&&i<a.length-1&&(a[i-1]!='g'&&a[i+1]!='g')) {
    				//System.out.println(i+" "+3);
    				return false;
    			}
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(gHappy(s.toCharArray()));
		sc.close();

	}

}
