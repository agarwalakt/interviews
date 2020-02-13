import java.util.HashMap;

/**
 * check if two strings can be edited, replaced, deleted not more than once
 * dagger and bagger is fine, if the number of modifications is more than one return false
 */



public class Random {
    /*
        String s= "daggerr";
        String t = "bagger";
        testCheck(s,t);
     */

    public static HashMap<Character, Integer> test  (String input){
        HashMap<Character, Integer> mm = new HashMap<Character, Integer>();
        char[] arr  = input.toCharArray();
        for(char c : arr){
            if(mm.containsKey(c)){
                mm.put(c, mm.get(c)+1);
            }else
                mm.put(c, 1);
        }
        System.out.println(mm);
        return mm;
    }

    public static boolean testCheck(String s, String t){
        if(Math.abs(s.length()-t.length())>1){
            return false;
        }
        int overallCount=0;
        HashMap<Character, Integer> mapS=test(s);
        HashMap<Character, Integer> mapT=test(t);
        for(char c : s.toCharArray()){
            if(!mapT.containsKey(c)){
                System.out.println("false");
                overallCount=overallCount+1;
            }else{
                int cT= mapT.get(c);
                int cS= mapS.get(c);
                if(cS!=cT){
                    overallCount=overallCount+1;
                    System.out.println("false");
                }
            }
        }
        if(overallCount>1){
            System.out.println("falsefalse");
            return false;
        }
        return true;
    }
}
