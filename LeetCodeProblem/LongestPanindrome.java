
import java.util.ArrayList;



// 5 Longest Palindrom SubString
public class LongestPanindrome {
    
    public static void main(String[] args) {
        String s="bb"; //bab
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        ArrayList<String> list = new ArrayList<>();
        if(s.length()<=1) return s;
        int max_len=0;
        String max_str="";
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
                for(int k=i;k<j;k++) {
                    list.add(s.substring(i, j));
                }
            }
        }

        for (String str : list) {
            if(isPalindrome(str)){
                int len=str.length();
                if(len>max_len) {
                    max_len=len;
                    max_str=str;
                }
            }
        }

        return max_str;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return str.contentEquals(sb);
    }
    

    /* 
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }*/
    
}
