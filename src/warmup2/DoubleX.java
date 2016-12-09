package warmup2;

/**
 * Given a string, return true if the first instance of "x" in 
 * the string is immediately followed by another "x".
 */
public class DoubleX {
	
	public boolean doubleX(String str) {
	  int findX = str.indexOf("x");
	  if(findX == -1) return false;
	  //The indexOf() method returns the first 
	  //index at which a given element can be found in the array, 
	  //or -1 if it is not present.
	  
	  String x = str.substring(findX);
	  return x.startsWith("xx");
	}

}
