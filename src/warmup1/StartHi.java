package warmup1;
/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class StartHi {
	
	public boolean startHi(String str) {
	  if(str.length() < 2){
	    return false;
	  }
	  
	  String findFirstTwo = str.substring(0,2);
	  if(findFirstTwo.equals("hi")){
	    return true;
	  }else{
	    return false;
	  }
	}
	
}
