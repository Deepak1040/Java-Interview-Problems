


 //58 Length of Last Word

public class LengthOfWord {
    public static int lengthOfLastWord(String s) {
        String array[]=s.split(" ");
        return array[array.length-1].length();
    }

    public static void main(String Args[])
    {
        String s=" eb efibwf kenfibefnwf kenfi en     ";
        System.out.println(lengthOfLastWord(s));
    }
}
