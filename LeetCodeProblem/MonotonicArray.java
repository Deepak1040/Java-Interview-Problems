// 896 Monotonic Array
public class MonotonicArray {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 2, 3 };
        System.out.println(checkArray(nums));
    }

    public static boolean checkArray(int nums[]) {

        if (nums[0] <= nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                } else
                    return false;
            }
        } else if (nums[0] >= nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                } else
                    return false;
            }
        }

        return true;
    }
}
