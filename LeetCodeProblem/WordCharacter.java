// 2942. Find Words Containing Character

import java.util.ArrayList;
import java.util.List;

public class WordCharacter {
    public static void main(String[] args) {

        String words[] = { "leet", "code" };
        char x = 'e';
        List<Integer> list = findWordsContaining(words, x);

        System.out.println(list.toString());

    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(str)) {
                list.add(i);
            }
        }
        return list;

    }
}
