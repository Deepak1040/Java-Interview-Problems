
// 66 Plus One


import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] ={1,2,3};
        digits=plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
