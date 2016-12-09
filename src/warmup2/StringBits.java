package warmup2;

/**
 * Given a string, return a new string made of every other char starting with the first, 
 * so "Hello" yields "Hlo".
 */
public class StringBits {
	
	public String stringBits(String str) {
	  String result = "";
	  for(int i = 0; i < str.length(); i = i + 2){
	    result = result + str.charAt(i);
	  }
	  return result;
	}

}