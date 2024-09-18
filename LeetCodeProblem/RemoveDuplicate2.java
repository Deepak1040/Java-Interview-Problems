//80 Remove Duplicate 2
import java.util.*;


public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int nums1[]={0,0,1,1,1,2,2,3,3,4};// change the array in order and return the number of unique elements
        System.out.println(removeDuplicates(nums1)); 
    }

    // Two pointer solution 
    // ele = numbers from the array
    // idx = index of the element 
    // the number should not repeat after atmost 2 times
    public static int removeDuplicates(int[] nums) {
        int ele=nums[0];
        int idx=1;
        int count=1;
        System.out.println(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            if(ele!=nums[i])
            {
                nums[idx]=nums[i];
                idx++;
                count++;
                ele=nums[i];
            }
            if(count==2)count=0;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
