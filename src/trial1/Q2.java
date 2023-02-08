package trial1;
import java.util.*;
/*
Given two strings, base and remove, return a version of the base string where all
instances of the remove string have been removed (not case sensitive). You may assume
that the remove string is length 1 or more. Remove only non-overlapping instances, so
with "xxx" removing "xx" leaves "x".
withoutString("Hello there", "
withoutString("Hello there", " "
e ) "Hllo thr"
withoutString("Hello there", " "
x ) "Hello there"
*/
public class Q2 {
	public static char conV(char base) {
		return base>='A'&&base<='Z'?(char)(base+32):base;
	}
    public static String withoutString(char[] base,char[] remove) {
    	String ans="",cur="";
    	int remLen=remove.length,j=0,i=0,len=base.length;
    	while(i<len) {
    		char lf=conV(base[i]);
			char rg=conV(remove[j]);
    		if(lf==rg) {
    			while(i<len&&j<remLen){
    				 lf=conV(base[i]);
    				 rg=conV(remove[j]);
    				//System.out.println(lf+" "+rg);
    				if(lf==rg) {
    				cur+=base[i];
    				i++;
    				j++;
    				}
    				else
    				break;
    			}
    			if(j==remLen) {
    			j=0;
    			continue;
    			}
    			else
    			{
    				ans+=cur;
    				cur="";
    				j=0;
    			}
    			
    		}
    		else {
    			ans+=base[i];
    			i++;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String base=sc.nextLine();
		String remove=sc.nextLine();
		System.out.println(withoutString(base.toCharArray(), remove.toCharArray()));
		sc.close();
	}

}
