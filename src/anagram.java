import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class anagram {

    public static List<String> funWithAnagrams(List<String> s) {
        /*List<String> input = new ArrayList();
        input.add("code");
        input.add("odce");
        input.add("anagrams");
        input.add("anagram");
        input.add("anagr");
        input.add("edoc");
        funWithAnagrams(input);*/


        //[anagr, anagram, anagrams, code]
        List<String> accepted = new ArrayList();
        List<String> anagrams = new ArrayList();
        for(int i = 0; i < s.size(); ++i){
            char[] chars = s.get(i).toCharArray();
            Arrays.sort(chars);
            String anagram = Arrays.toString(chars);
            boolean inAnagrams = false;
            for(int j = 0; j < anagrams.size(); ++j){
                if(anagram.equals(anagrams.get(j))){
                    inAnagrams=true;
                    // break;
                }
            }
            if (!inAnagrams){
                anagrams.add(anagram);
                accepted.add(s.get(i));
            }
        }
        Collections.sort(accepted);
        System.out.println(accepted);
        return accepted;
    }
}
