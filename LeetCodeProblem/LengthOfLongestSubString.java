
import java.util.HashSet;


// 3 Length of Longest Sub String

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int size = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                while(s.charAt(left) != s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                    size--;
                }
                left ++;
            }
            else{
                size++;
                set.add(s.charAt(right));
            }
            
            right++;
            max = max < size ? size : max;
        }
        return max;
    }
}
