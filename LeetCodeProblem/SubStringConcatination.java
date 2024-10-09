
import java.util.*;


// 30 Substring with Concatination of All Words

public class SubStringConcatination {
    public static void main(String[] args) {
        String s= "barfoothefoobarman";
        String words[] ={"foo","bar"};
        List<Integer> list = findSubstring(s, words);
        System.out.println(list.toString());


    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        List<String> word_list=new ArrayList<>(Arrays.asList(words));
        int subSize=words[0].length()*words.length;

        for (int i = 0; i<=s.length()-subSize; i=i+words[0].length()) {
            String subString= s.substring(i, subSize+i);
            
        }

        return list;

    }
}
