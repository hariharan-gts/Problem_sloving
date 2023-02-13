package recursion;

public class q6 {
/*
 Given a string, compute recursively a new string where all the adjacent chars are now
separated by a "*"
allStar("hello") -4 "h*e*l*l*o"
 */
	public static String allStar(String s,String ans,int len) {
		if(len==s.length())
			return ans;
		if(len>=0&&len<s.length()-1)
			return allStar(s, ans+(s.charAt(len)+"*"), len+1);
		return allStar(s, ans+s.charAt(len), len+1);
	}
	
	/*
	 Given a string, compute recursively a new string where identical chars that are adjacent in
the original string are separated from each other by a
pairStar("hello") 'thel*lo"
pairStar("xxyy") "x*xy*y"
pairStar("aaaa") "a*a*a*a"
	 */
	 public static String pairStar(String s,String ans,int len) {
		 if(len==s.length())
			 return ans;
		 if(len<s.length()-1&&s.charAt(len)==s.charAt(len+1))
			 return pairStar(s, ans+s.charAt(len)+"*", len+1);
		 return pairStar(s, ans+s.charAt(len), len+1);
	 }
	 
	 /*
	  Given a string, compute recursively a new string where all the lowercase 'x' chars have
been moved to the end of the string.
endX("xxre") -4 "rexx"
endX("xxhixx") "hixxxx"
"hihixxx"
	  */
	 public static String endX(String s,String ans,String x,int index) {
		 if(index==s.length())
			 return ans+x;
		 if(s.charAt(index)=='x')
			 return endX(s,ans,x+'x',index+1);
		 return endX(s,ans+s.charAt(index),x,index+1);
		 
	 }
	public static void main(String[] args) {
		System.out.println(endX("hexxlll", "","", 0));
	}

}
