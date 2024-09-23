
//125 Valid Palindrome
public class ValidPalindrome {
    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();  
        String str=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit((str.charAt(i))))
                sb.append(str.charAt(i));
        }
        str=String.valueOf(sb);
        sb.reverse();
        return str.contentEquals(sb);
        
    }
}
