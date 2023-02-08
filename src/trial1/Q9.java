package trial1;

import java.util.Scanner;

/*
 Given a string, return the length of the largest "block" in the string. A block is a run of
adjacent chars that are the same.
maxBlock("hoopla") 2
maxBlock("abbCCCddBBBxx") 3
maxBlock("") 0
 */
public class Q9 {
   public static int maxBlock(String s) {
	   int res=1,cnt=1;
	    for(int i=0;i<s.length();i++) {
	    	if(i!=s.length()-1&&s.charAt(i)==s.charAt(i+1)) {
	    		cnt++;
	    	}
	    	else {
	    		res=Math.max(cnt, res);
	    		cnt=1;
	    	}
	    	
	    }
	   
	   return res;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(maxBlock(s));
		sc.close();
	}

}
