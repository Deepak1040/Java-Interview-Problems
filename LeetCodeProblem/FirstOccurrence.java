
// 28 Find the First Occurrence 

public class FirstOccurrence{
    public static void main(String[] args) {
        
        String a="leetcode";
        String b="letc";
        System.out.println(strStr(a, b));
    }
    public static int strStr(String haystack, String needle) {
        
        int index =haystack.indexOf(needle);

        return index;
    }
}