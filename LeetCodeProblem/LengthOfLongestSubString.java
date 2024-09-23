
import java.util.HashSet;


// 3 Length of Longest Sub String

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<String> list=new HashSet<>(); 
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length();j++) {
                for(int k=i;k<j;k++) {
                    list.add(s.substring(i, j));
                }
            }
        }

        for (String string : list) {
            System.out.println(string);
        }
        return 0;
    }
}
