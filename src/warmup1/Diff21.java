package warmup1;

/**
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.
 */

public class Diff21 {
	public int diff21(int n) {
		  int diff = 21 - n;
		  int reverse = n -21;
		  if(n <= 21) {
		    return diff;
		  } else {
		    return (reverse) * 2;
		  }
		}

}
