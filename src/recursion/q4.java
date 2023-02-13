package recursion;
/*
 Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the
string.
countX("xxhixx") 4
countX("xhixhix") 3
countX("hi") 0
 */

/*
 Given a string, compute recursively (no loops) the number of times lowercase "hi" appears
in the string.
countHi("xxhixx")
countHi("xhixhix") 2
countHi("hi") 1
 */

/*
 Given a string, compute recursively (no loops) a new string where all the lowercase 'x'
chars have been changed to 'y' chars.
changeXY("codex") "codey"
changeXY("xxhixx") "yyhiyy"
changeXY("xhixhix")
"yhiyhiy"
 */

/*
 Given a string, compute recursively (no loops) a new string where all appearances of "pi"
have been replaced by "3.14".
changePi("xpix") "x3.14x"
changePi("pipi") "3.143.14"
changePi("pip") -4
"3.14p"
 */
public class q4 {
	public static String changePI(String s,String ans,int len) {
	   if(len<0)
		return ans;
	   if(s.charAt(len)=='i'&&s.charAt(len-1)=='p')
		   return changePI(s, "3.14"+ans, len-2);
		
	   return changePI(s, s.charAt(len)+ans, len-1);
	}
	public static void changeXY(char a[],int len) {
		if(len<0)
			return ;
		if(a[len]=='x')
			a[len]='y';
		changeXY(a, len-1);
	}
	public static int countHi(String s,int len) {
		if(len<=0)
			return 0;
		return ((s.charAt(len)=='i'&&s.charAt(len-1)=='h')?1:0)+countHi(s, len-1);
	}
	
	
   public static int countX(String s,int len) {
	   if(len<0)
		   return 0;
	   return (s.charAt(len)=='x'?1:0)+countX(s, len-1);
   }
   
   /*
    Given a string, compute recursively a new string where all the 'x' chars have been
removed.
noX("xaxb") "ab"
noX("abc") "abc"
    */
    public static String noX(String s,String ans,int len) {
    	if(len<0)
    		return ans;
    	return noX(s,(s.charAt(len)!='x'?s.charAt(len):"")+ans,len-1);
    }
    
    /*
     We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA"
the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x
Recursively compute the number of pairs in the given string.
countPairs("axa") 1
countPairs("axax") 2
countPairs("axbx")
1
     */
    public static int countPairs(String s,int len) {
    	if(len+1==s.length())
    		return 0;
    	
    	return ((s.charAt(len)=='a'&&s.charAt(len+1)=='x')?1:0)+countPairs(s, len+1);
    }
	public static void main(String[] args) {
	//System.out.println(countX("xxhix", 4));
    // String s="xhizzhxieixx";
     //char c[]=s.toCharArray();
     //changeXY(c,s.length()-1);
     //System.out.println(String.valueOf(c));
//     String s="xpix";
//     System.out.println(changePI(s, "", s.length()-1));
      String a="axaxax";
      System.out.println(countPairs(a, 0));
	}

}
