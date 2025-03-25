
// 1456. Maximum Number of Vowels in a Substring of Given Length

public class MaximumNumberOfVovels {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        String vovels = "AEIOUaeiou";
        int countValue, maxValue = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            countValue = 0;
            for (int j = 0; j < subString.length(); j++) {
                if (vovels.contains(String.valueOf(subString.charAt(j)))) {
                    countValue++;
                }
            }
            maxValue = Math.max(countValue, maxValue);
        }
        return maxValue;
    }
}
