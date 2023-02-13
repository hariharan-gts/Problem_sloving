package trial2;

import java.util.Arrays;

/*
 *15. Array - Run Length Decoding
For a given string, which has character and the number of times the character appeared, decode
to the full string. During encoding if the character appear only once, then no number will be next
to that character.
Input: tta5br3"
Output: "aaaaabrrr"
Input: "a10br3a3"
Output: "aaaaaaaaaabrrraaa't
16. Array - Run Length Encoding
For a given input string, count the contiguous characters and represent them in integers. Ifthe
contiguous count is l, you need not add the integer.
Input: "aaaaabrrr"
Output: "a5br3't
Input: "aaaaaaaaaabrrraaa'
Output: "a10br3a3"
 */
public class Q10 {
	public static String decodin(String s) {
		String ans="";
		String temp="";
		int v=0;
		int len=s.length(),i=0,j=0;
		while(i<len) {
			j=i;
			while(j<len&&s.charAt(j)>='a'&&s.charAt(j)<='z') {
				temp+=s.charAt(j);
				j++;
			}
			while(j<len&&s.charAt(i)>='0'&&s.charAt(j)<='9') {
				v=v*10+(s.charAt(j)-'0');
				j++;
			}
			//System.out.println(temp+" "+v);
			while(v>0) {
				ans+=temp;
				v--;
			}
			i=j;
			temp="";
			v=0;
			
			
		}
		return ans;
	}
    public static String encoding(String s) {
    	String ans="";
    	String temp="";
    	int v=1;
    	for(int i=1;i<s.length();i++) {
    		if(s.charAt(i)==s.charAt(i-1)) {
    			v++;
    		}
    		else {
    			if(v>1)
    			ans+=s.charAt(i-1)+""+v;
    			else {
    			ans+=s.charAt(i-1);
    			
    			}
    			v=1;
    		}
    	}
    	if(v>1) {
    		ans+=s.charAt(s.length()-1)+""+v;
    	}
    	else {
    		ans+=s.charAt(s.length()-1);
    	}
    	return ans;
    }
    
    /*
     18. Array - Shuffle merge
Given a input two string (inputStr1) and (inputStr2), merge these two string by combining
elements of same index
Input String: "Hello"
Deletion String: "123"
Output String: t'Hle21310tt
19. Array - Split reverse
Given a string (array of character), split the string to half and reverse each half Input:
Input String: "Mike"
Output: t'iMektt
Input String: "break"
Output: "rbeka"
     */
      public static String merge(String s1,String s2) {
    	  String ans="";
    	  int i=0,j=0;
    	  while(i<s1.length()&&j<s2.length()) {
    		  ans+=s1.charAt(i)+""+s2.charAt(j);
    		  i++;
    		  j++;
    	  }
    	  while(i<s1.length()) {
    		  ans+=s1.charAt(i);
    		  i++;
    	  }
    	  while(j<s2.length()) {
    		  ans+=s2.charAt(j);
    		  j++;
    	  }
    	  return ans;
    	  
      }
      public static void splitrev(char a[]) {
    	  int s=0,e=a.length;
    	  int h=e/2;
    	  rev(a,s,h-1);
    	  
    	  rev(a,a.length%2==0?h:h+1,e-1);
    	  System.out.println(new String(a));
      }
      public static void rev(char a[],int s,int e) {
    	  while(s<e) {
    		  char temp=a[s];
    		  a[s]=a[e];
    		  a[e]=temp;
    		  s++;
    		  e--;
    	  }
      }
      
      /*
       17. Array - Second Largest number
Given an integer array find the second largest element (where array has only distinct elements)
Input: [2, 10, 11, 20, -5, 40, 60, 90, 1, 100]
Output: 90
       */
      public static int max2(int a[]) {
    	  int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE;
    	  for(int i=0;i<a.length;i++) {
    		  if(a[i]>max) {
    			  smax=max;
    			  max=a[i];
    		  }
    		  else if(a[i]<max&&a[i]>smax) {
    			  smax=a[i];
    		  }
    	  }
    	  return smax;
      }
      public static int[] dailyTemperatures(int[] T) {
          int[] result = new int[T.length];
          for (int day = T.length - 1; day >= 0; day--)
              for (int i = day - 1; i >= 0 && T[i] < T[day]; i--)  
                  result[i] = day - i;
          return result;
      }
	public static void main(String[] args) {
		int a[]= {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(dailyTemperatures(a)));
		///System.out.println(decodin("a10br3a3"));
		//System.out.println(merge("Hello", "123"));
//		String s="Break";
//		splitrev(s.toCharArray());
		//int a[]= {1,1,1};
		System.out.println(max2(a));
	}

}
