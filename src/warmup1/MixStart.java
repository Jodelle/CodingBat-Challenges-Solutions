package warmup1;

public class MixStart {
	
	public boolean mixStart(String str) {
		  if(str.length()<3){
		    return false;
		  }
		  String firstThree = str.substring(1,3);
		  if(str.length()>=3 && firstThree.equals("ix")){
		    return true;
		  }else {
		    return false;
		  }
	}

}
