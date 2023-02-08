package trial1;

import java.util.Scanner;

/*
 Given a string, return the sum of the numbers appearing in the string, ignoring all other
characters. A number is a series of 1 or more digit chars in a row. (Note:
Character.isDigit(char) tests if a char is one of the chars '0', '1', . '9'
Integer.parselnt(string) converts a string to an int.)
sumNumbers("abc123xyz") 123
sumNumbers("aa11b33") 44
sumNumbers("7 11 )
" 18
 */
public class Q10 {
    public static int sumNumbers(String s) {
    	int ans=0,temp=0;
    	int i=0,j=0,len=s.length();
    	while(i<len) {
    		if(Character.isDigit(s.charAt(i))){
    		j=i;
    		
    		while(j<len&&Character.isDigit(s.charAt(j))){
    			temp=temp*10+s.charAt(j)-'0';
    			j++;
    		}
    		ans+=temp;
    		temp=0;
    		i=j;
    		}
    		else
    		i++;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(sumNumbers(s));
		sc.close();

	}

}
