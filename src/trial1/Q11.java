package trial1;
import java.util.*;
/*
 Given a string, return a string where every appearance of the lowercase word "is" has been
replaced with "is not". The word "is" should not be immediately preceeded or followed by a
letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
tests if a char is a letter.)
notReplace("is test") -4 "is not test"
notReplace("is-is") "is not-is not"
notReplace("This is right") -4 "This is not right"
 */
public class Q11 {
public static String notReplace(String s) {
	String ans="";
	int i=0,len=s.length();
	while(i<len) {
		if(i>=2&&s.charAt(i)=='i'&&s.charAt(i+1)=='s') {
			if(s.charAt(i-1)!='-'&&s.charAt(i-2)!='-')
			{
			//System.out.println(1);
			ans+="is not";
			i+=2;
			}
			else if(s.charAt(i-1)=='-'&&s.charAt(i-2)!='-') {
				//System.out.println(2);
				ans+="is not";
				i+=2;
			}
			else {
			 ans+=s.charAt(i);
			 i++;
			 continue;
			}
		}
	    else if(i!=0&&i!=s.length()-1&&s.charAt(i)=='i'&&s.charAt(i+1)=='s'&&!Character.isLetter(s.charAt(i-1))) {
	    	//System.out.println(3);
			ans+="is not";
			i+=2;
		}
	else if(i==0&&s.charAt(i)=='i'&&s.charAt(i+1)=='s') {
		System.out.println(4);
		ans+="is not";
		i+=2;
	}
		else {
			ans+=s.charAt(i);
			i++;
		}
	}
	return ans;
}
//   public static String notReplace(String s) {
//	   return s.replaceAll("is","not");
//   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(notReplace(s));
	}

}
