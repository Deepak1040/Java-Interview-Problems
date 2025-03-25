//605. Can Place Flowers

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int flowerbed[] = { 1, 0, 1, 0, 1, 0, 1 };
        int n = 0;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (n == 0)
            return true;
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)
                count++;
        }
        System.out.println(count);
        return count == n;
    }
}
