

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums1[]={3,2,2,3};
        System.out.println(removeDuplicates(nums1)); 
    }

    public static int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
