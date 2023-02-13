package recursion;

/*
 * We have a number of bunnies and each bunny has two big floppy ears. We want to
compute the total number of ears across all the bunnies recursively (without loops or
multiplication).
bunnyEars(0) 0
bunnyEars(1) 2
bunnyEars(2) 4
 */
/*
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the
normal 2 ears. The even bunnies (2, 4, .. ) we'll say have 3 ears, because they each have a
raised foot. Recursively return the number of "ears" in the bunny line 1, 2, .
n (without
loops or multiplication).
bunnyEars2(0)
bunnyEars2(1)
bunnyEars2(2)
 */
public class q2 {
   public static int bunnyEars(int n) {
	   if(n==0)
		   return 0;
	   
	   return 2+bunnyEars(n-1);
   }
   public static int bunnyEars2(int n) {
	   if(n==0)
		   return 0;
	  
	   
	   return ((n%2==0)?3:2)+bunnyEars2(n-1);
   }
   /*
    * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2
blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or
multiplication) the total number of blocks in such a triangle with the given number Of rows.
triangle(O) 0
triangle(l)
1
triangle(2)
3
    */
   public static int triangle(int n) {
	   if(n==0)
		   return 0;
	   
	   return n+triangle(n-1);
   }
	public static void main(String[] args) {
		//System.out.println(bunnyEars(6));
		//System.out.println(bunnyEars2(2));
		System.out.println(triangle(5));
	}

}
