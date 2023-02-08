package trial2;

import java.util.Scanner;

/*
 Given a string remove duplicates characters and maintain the same order
Input: "Hello world hi"
Output String: "Helo wrdhitt
 */

/*
 Given a string (array of characters) remove the given character Input:
Input String: "Hello"
CharacterToRemove: 'l'
Output: "Heo"
 */

/*
 12. Given a string (array of character), reverse the string Input:
Input String: "Mike"
Output: "ekiM"
Input String: "break"
Output: "kaerb"
13. Array - Reverse Group
Reverse array in a group of given size. Every group of string of given size should be reversed.
Input: "hello master"
Size: 3
Output: "leh olsamrettt
Input: "thank you bye"
Size: 2
Output: t'htna koy uybe"
 */
public class Q9 {
	public static String remChar(String s,char c) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=c) {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
    public static String remDup(String s) {
    	String ans="";
    	int f[]=new int[256];
    	for(int i=0;i<s.length();i++) {
    		f[s.charAt(i)]=1;
    	}
    	for(int i=0;i<s.length();i++){
    		if(f[s.charAt(i)]==1) {
    			ans+=s.charAt(i);
    			f[s.charAt(i)]=-1;
    		}
    	}
    	return ans;
    }
    public static String revGroup(char a[],int k) {
    	int i=0,j=0,len=a.length;
    	while(i<len) {
    	int s=i,e=i+k-1;
    	if(e<len)
        while(s<=e) {
        	char temp=a[s];
        	a[s]=a[e];
        	a[e]=temp;
        	s++;
        	e--;
        }
        i+=k;
        
    	}
    	return new String(a);
    	
    }
    
    /*
     Given a input string (inputStrl) and reference string (inputStr2), remove all the occurrence of
character of reference string in the input string
Input String: "Hello world hi"
Deletion String: "lhe't
Output String: "HO word i"
     */
    
    public static String rem(String s,String rem) {
    	return s.replaceAll(rem,"");
    }
    
    /*
     ay -
otatlon
Given a String rotate the array by given number 'nt
Input: "abcdefgh"
Output: "efghabcdtt
     */
    public static void rotate(char c[],int k) {
    	int s=0,e=c.length-1;
    	rev(c,s,e);
    	rev(c,0,k-1);
    	rev(c,k,e);
    	
    	System.out.println(new String(c));
    }
    public static void rev(char c[],int i,int j) {
    	while(i<j) {
    		char temp=c[i];
    		c[i]=c[j];
    		c[j]=temp;
    		i++;
    		j--;
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		//System.out.println(remDup(s));
		//System.out.println(remChar(s,'l'));
		//System.out.println(revGroup(s.toCharArray(), 3));
		//System.out.println(rem("Hello world" , "llo"));
		String s="abcdefgh";
		rotate(s.toCharArray(), 4);
		sc.close();

	}

}
