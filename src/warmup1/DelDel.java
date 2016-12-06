package warmup1;
/**
 * Given a string, if the string "del" appears starting at index 1, 
 * return a string where that "del" has been deleted. 
 * Otherwise, return the string unchanged.
 */
public class DelDel {
	
	public String delDel(String str) {
	  if(str.length()<4){
	    return str;
	  }
	  
	  String delStr = str.substring(1, 4);
	  String newString = str.substring(0,1) + str.substring(4);
	 
	  
	  if(str.length()>=4 && delStr.equals("del")){
	    return newString;
	  } 
	  return str;
	}

}
