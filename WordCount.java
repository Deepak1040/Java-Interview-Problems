
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            inputString=inputString.toLowerCase();

            // Splitting the string based on special characters
            String[] words = inputString.split("[!@#$%,.;:]+");

   

            // Creating an ArrayList to hold the words
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, words);

            // Creating a HashMap to count occurrences of each word
            HashMap<String, Integer> map = new HashMap<>();
            for(int n=0;n<words.length;n++)
                map.put(list.get(n),1);

            for (String word : list) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }

            // Displaying the word count map (key-value pairs)
            System.out.println("Word Counts:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}


