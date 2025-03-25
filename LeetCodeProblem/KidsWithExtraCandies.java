//1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandies {
    public static void main(String[] args) {
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> list = kidsWithCandies(candies, extraCandies);
        System.out.println(list.toString());
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies > max)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}
