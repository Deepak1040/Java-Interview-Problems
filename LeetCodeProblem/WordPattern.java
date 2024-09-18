
import java.util.*;


//290 Word Pattern 
public class WordPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        
        String array[]=s.split(" ");
        int index=0;
        Map<String,String> map =new TreeMap<>();
        for (var str : array) {
            map.put(String.valueOf(pattern.charAt(index++)), str);
        }
        for (Map.Entry<String,String> a : map.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
        
        return true;
    }
}
