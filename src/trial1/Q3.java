package trial1;

import java.util.*;
/*
 * 
Given a string, return true if the number of appearances of "is" anywhere in the string is
equal to the number of appearances of "not" anywhere in the string (case sensitive).
equallsNot("This is not") -4 false
equallsNot("This is notnot") true
equallsNot("noisxxnotyynotxisi") true
 */
public class Q3 {
    public static boolean equallsNot(char []a) {
    	char is[]={'i','s'};
    	char not[]={'n','o','t'};
    	int i=0,len=a.length,j=0;
    	int isCnt=0,nCnt=0;
    	while(i<len) {
    		if(a[i]==is[j]) {
    			while(i<len&&j<2&&is[j]==a[i]) {
    				i++;
    				j++;
    			}
    			if(j==2) {
    				isCnt++;
    			}
    			j=0;
    		}
    		else if(a[i]==not[j]) {
    			while(i<len&&j<3&&not[j]==a[i]) {
    				i++;
    				j++;
    			}
    			if(j==3)
    				nCnt++;
    			j=0;
    		}
    		else
    			i++;
    	}
    	return isCnt==nCnt;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(equallsNot(s.toCharArray()));
		sc.close();

	}

}
