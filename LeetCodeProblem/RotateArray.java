
import java.util.Arrays;



// 189 Rotate Array
public class RotateArray {
    public static void main(String[] args) {
        
        int array[]={1,2,3,4,5,6,7}; // {5,6,7,1,2,3,4}
        int pos=3;
        rotate(array, pos);
    }

    public static void rotate(int[] nums, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i : nums)
            sb.append(i);

        String sub=sb.substring(0, nums.length-k);
        String sub_new=sb.substring(nums.length-k);
        sb=new StringBuilder(sub_new);
        sb.append(sub);

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Integer.parseInt(String.valueOf(sb.charAt(i)));
        }   
        
        System.out.println(Arrays.toString(nums));
    }

    // Both Works 
    
    // public static void rotate(int[] nums, int k) {
    //     k = k % nums.length;
    //     if (k != 0) {
    //         int[] temp = new int[nums.length];
    //         System.arraycopy(nums, nums.length - k, temp, 0, k);
    //         System.arraycopy(nums, 0, temp, k, nums.length - k);
    //         System.arraycopy(temp, 0, nums, 0, nums.length);
    //     }
    // }
}
