
public class ReverseInt {
	
	    public int reverse(int x) {
	        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
	            return 0;
	        }else{
	        int y=0;
	        if (x<0){
	         y=Math.abs(x); 
	        }else{
	            y=x;
	        }
	        String   test = Integer.toString(y);
	        char[] arr = test.toCharArray();
	        int len = test.length();
	        char[] reversedInt= new char[len];
	        int toReturn = 0;
	        
	        for(int i=0; i<len; i++){
	            reversedInt[i]=arr[len-1-i];
	        }
	        toReturn= Integer.parseInt(new String(reversedInt));
	        if (x<0){
	        return -toReturn;    
	        }else {
	        return toReturn;    
	        }    
	        }
	        
	        
	    }
	

}
