package warmup1;
/**
 * Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' and include the second only if it is 'z', 
 * so "ozymandias" yields "oz".
 */
public class StartOz {
	
	public String startOz(String str) {
	  String newStr = "";
	  
	  if(str.length() >= 1 && str.charAt(0)=='o'){
	    newStr = newStr + str.charAt(0);
	  }
	  
	  if(str.length() >= 2 && str.charAt(1)=='z'){
	    newStr = newStr + str.charAt(1);
	  }
	  
	  return newStr;
	}
}
