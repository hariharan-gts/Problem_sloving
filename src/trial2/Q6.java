package trial2;

import java.util.Scanner;

/*
 Find the character which appeared the maximum time. If you have multiple character as result
return the first character in that list.
Input: "hello world"
Output : T
Input: 'tye haha"
Output: 'h'
 */
public class Q6 {
    public static char maxC(String s) {
    	char c='a';
    	int max=-1;
    	int f[]=new int[256];
    	for(int i=0;i<s.length();i++) {
    		
    			f[s.charAt(i)]++;
    		
    	}
    	for(int i=0;i<256;i++) {
    		if(f[i]>0&&f[i]>max) {
    			max=f[i];
    			c=(char)i;
    		}
    	}
    	//System.out.println(max);
    	return c;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(maxC(s));
		sc.close();
	}

}
