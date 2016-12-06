package warmup1;
/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, 
 * so "cat" yields "tcatt". The original string will be length 1 or more.
 */
public class BackAround {
	public String backAround(String str) {
	  char lastChar;
	  String input;
	  
	  lastChar = str.charAt(str.length()-1);//t
	  input = str.substring(0, str.length());//cat
	  
	  return lastChar + input + lastChar;	  
	}

}
