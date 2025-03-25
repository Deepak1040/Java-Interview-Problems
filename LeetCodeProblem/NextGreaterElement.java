//2454. Next Greater Element IV

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 0, 9, 6 };
        int res[] = secondGreaterElement(nums);
        for (int a : res) {
            System.out.print(a + " ");
        }
    }

    public static int[] secondGreaterElement(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int first = -1, second = -1, ele;
            ele = nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] > ele) {
                    first = nums[j];
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] > first) {
                        second = nums[j];
                    }
                }
            }

            res[i] = second;

        }

        return res;
    }

}
