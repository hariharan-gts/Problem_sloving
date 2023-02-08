package trial1;

import java.util.Scanner;

/*
 Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests
if a char is one of the chars '0', '1', .. '9'. Integer.parselnt(string) converts a string to an
int.)
sumDigits("aa1bc2d3") 6
sumDiglts("
• aa11b33") —8
sumDigits("Chocolate") 0
 */
public class Q6 {
    public static int sumDigits(String s) {
    	int sum=0;
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(Character.isDigit(c)) {
    			sum+=c-'0';
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(sumDigits(s));
		sc.close();

	}

}
