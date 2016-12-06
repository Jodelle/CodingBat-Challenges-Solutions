package warmup1;
/**
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7
 */
public class LastDigit {
	
	public boolean lastDigit(int a, int b) {
	  return (Math.abs(a - b) % 2 == 0);
	}
}
