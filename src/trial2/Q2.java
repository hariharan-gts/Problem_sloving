package trial2;

import java.util.*;

/*
Given a string (array of characters) insert a given character at the specified location Input: Input
String: "Hello" Location: 3 (if the location is beyond string length, ignore) CharacterToInsert: 'm'
Output: "Hemllo"
*/
public class Q2 {
    public static String insert(String s,int p,char c) {
    	if(p-1>s.length())
    		return s;
    	
    	return s.substring(0,p-1)+c+s.substring(p-1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
        int p=sc.nextInt();
        char in=sc.next().charAt(0);
        System.out.println(insert(s,p,in));
	}

}
