
import java.util.HashMap;


//290 Word Pattern 
public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map= new HashMap<>();
        String word[]=s.split(" ");
        int i=0;
        for(char c:pattern.toCharArray()){
            map.put(c, word[i++]);
        }
        System.out.println(map.entrySet());
        System.out.println(map.size());
        return map.size()==1 || map.size()%2==0;
    }
}
