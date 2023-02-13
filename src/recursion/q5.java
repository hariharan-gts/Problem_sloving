package recursion;

public class q5 {
    /*
     Given an array of ints, compute recursively if the array contains a 6. We'll use the
convention of considering only the part of the array that begins at the given index. In this
way, a recursive call can pass index+l to move down the array. The initial call will pass in
index as 0.
array6([1, 6, 4], O) true
array6([1, 4], O)
-9 false
array6([6], 0)
-4 true
     */
	public static boolean array6(int a[],int index) {
		if(index==0)
			return false;
		if(a[index]==6)
			return true;
		
		return array6(a, index-1);
	}
	
	/*
	 Given an array of ints, compute recursively the number of times that the value 11 appears
in the array. We'll use the convention of considering only the part of the array that begins
at the given index. In this way, a recursive call can pass index+l to move down the array.
The initial call will pass in index as 0.
2, 11], 0)
11], 0) — 2
	 */
	public static int array11(int a[],int index) {
		if(index==a.length)
			return 0;
		
		return (a[index]==11?1:0)+array11(a, index+1);
	}
	public static void main(String[] args) {
		int a[]= {1,4,7,11,4,11};
        System.out.println(array11(a, 0));
		// System.out.println(array6(a, a.length-1));
	}

}
