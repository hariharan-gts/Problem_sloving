package trial1;

import java.util.*;
//Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
//the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
//is at the end of a word if there is not an alphabetic letter immediately following it. (Note:
//Character.isLetter(char) tests if a char is an alphabetic letter.)
//countYZ("fez day") 2
//countYZ("day fez") 2
//countYZ("day fyyyz") 2

public class Q1 {
    public static int countYZ(String s) {
    	int cnt=0;
    	for(int i=0;i<s.length();i++) {
    		if(i+1!=s.length()&&((s.charAt(i)=='z'||s.charAt(i)=='y'||s.charAt(i)=='Z'||s.charAt(i)=='Y')&&s.charAt(i+1)==' ')) {
    			cnt++;
    		}
    		else if(i+1==s.length()&&(s.charAt(i)=='z'||s.charAt(i)=='y'||s.charAt(i)=='Z'||s.charAt(i)=='Y'))
    			cnt++;
    	}
    	return cnt;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    System.out.println(countYZ(s));
	    sc.close();
	}

}
