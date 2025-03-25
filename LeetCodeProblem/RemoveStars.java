
// 2390. Removing Stars From a String

public class RemoveStars {

    public static void main(String[] args) {

        String s = "leet**cod*e"; // lecoe
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                sb.replace(i - 1, i + 1, "");
                i = i - 2;
            }
        }
        return sb.toString();
    }
}
