
//125 Valid Palindrome
public class ValidPalindrome {
    public static void main(String[] args) {
        String s="";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();  
        String array[]=s.toLowerCase().split("[ $&+,:;=?@#|'<>.-^*()%![0-9]]+]+");
        for (String string : array) {
            sb.append(string);
        }   
        String str= String.valueOf(sb);
        sb.reverse();
        return str.contentEquals(sb);
        
    }
}
