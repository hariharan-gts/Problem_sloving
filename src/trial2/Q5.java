package trial2;

import java.util.Arrays;

/*
 *Given integer array, replace every element with least greatest element on the right. If there are no
greater number, then place the same number.
Input: [10, 12, 5, 40, 21, 70, 1, 49, 37]
Output: [12, 21, 21, 49, 37, 70, 37, 49, 37]
 */
public class Q5 {
    public static int [] lG(int a[],int n) {
    	int ans[]=new int[n];
    	for(int i=0;i<n;i++) {
    		//int v=a[i];
    		int p=Integer.MAX_VALUE;
    		for(int j=i+1;j<n;j++) {
    			if(a[j]>a[i]&&p>a[j]) {
    				p=a[j];
    			}
    		}
    		if(p!=Integer.MAX_VALUE)
    		ans[i]=p;
    		else
    			ans[i]=a[i];
    	}
    	return ans;
    }
	public static void main(String[] args) {
		int a[]= {10, 12, 5, 40, 21, 70, 1, 49, 37};
        //lG(a,a.length);
        System.out.println(Arrays.toString(lG(a,a.length)));
	}

}
