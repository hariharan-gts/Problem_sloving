package recursion;

/*
 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive
definition. The first two values in the sequence are O and 1 (essentially 2 base cases). Each
subsequent value is the sum of the previous two values, so the whole sequence is: O, 1, 1,
2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth
fibonacci number, with representing the start of the sequence.
fibonacci(O) O
fibonacci(l) 1
fibonacci(2)
1
 */

/*
 Given a non-negative int n, return the sum of its digits recursively (no loops). Note that
mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
the rightmost digit (126 / 10 is 12).
sumDigits(126) —4 9
sumDigits(49) 13
sumDigits(12) 3
 */

/*
 Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for
example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126
% 10 is 6), while divide (I) by 10 removes the rightmost digit (126 / 10 is 12).
count7(717) 2
count7(7)
1
count7(123) O
 */
/*
 Given a non-negative int n, compute recursively (no loops) the count of the occurrences of
8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818
yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide
(l) by 10 removes the rightmost digit (126 / 10 is 12).
count8(8) 1
count8(818) 2
count8(8818) 4
 */

/*
 Given base and n that are both 1 or more, compute recursively (no loops) the value of
base to the n power, so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) 3
powerN(3, 2) 9
powerN(3, 3) 27
 */
public class q3 {
	public static int powerN(int n,int t) {
		if(t==0)
			return 1;
		return n*powerN(n, t-1);
	}
	public static int count8(int n) {
		if(n==0)
			return 0;
		return ((n%10)==8?1:0)+count8(n/10);
	}
	public static int count7(int n) {
		if(n==0)
			return 0;
		
		return (n%10==7?1:0)+count7(n/10);
	}
	public static int sumDigits(int n) {
		if(n==0)
			return 0;
		return (n%10)+sumDigits(n/10);
	}
   public static int fibonacci(int n) {
	   if(n==0)
		   return 0;
	   if(n==1||n==2)
		   return 1;
	   
	   return fibonacci(n-1)+fibonacci(n-2);
   }
	public static void main(String[] args) {
	//System.out.println(fibonacci(6));
	//	System.out.println(sumDigits(126));
		//System.out.println(count7(777));
	//	System.out.println(count8(8188));
		System.out.println(powerN(3, 3));
	}

}
