package trial2;
import java.util.*;
/*
 Count the number of pairs in integer array whose sum equals given sum (all elements are unique)
Input: [0, 2, 5, 7, 4, 6, 10, 20, -10]
Sum: 10
Output : 3 [(0, 10), (4, 6), (20, -10)]
 */
public class Q8 {
    public static void ans(int a[],int n,int t) {
    	LinkedHashSet<int[]>hs=new LinkedHashSet<>();
    	String ans="[";
    	int cnt=0;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(a[i]+a[j]==t) {
    				hs.add(new int[] {a[i],a[j]});
    				cnt++;
    			}
    		}
    	}
    	for(int i[]:hs) {
    		System.out.println(Arrays.toString(i));
    	}
    	
    }
	public static void main(String[] args) {
		int a[]= {0, 2, 5, 7, 4, 6, 10, 20, -10};
		int t=10;
		ans(a,a.length,t);
	}

}
