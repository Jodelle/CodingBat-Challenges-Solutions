package warmup2;

/**
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
 * or whatever is there if the string is less than length 3. Return n copies of the front;
 */
public class FrontTimes {
	
	public String frontTimes(String str, int n) {
	  String result = "";
	  String front = str.length() < 3 ? str : str.substring( 0, 3);

	  for ( int i = 0; i < n; i++ )
	  {
	    result = result + front;
	  }

	  return result;
	}

}
