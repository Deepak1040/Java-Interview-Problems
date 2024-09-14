package LeetCodeProblems;
public class MovingZero {
    public static void main(String Args[])
    {
        int nums[]= {1,0,2,3,0,4,6};
        int non_zero = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[non_zero++] = nums[i];
            }
        }
        while(non_zero < n)
            nums[non_zero++] = 0;

        for(int a : nums)
            System.out.print(a+" ");

    }
}
