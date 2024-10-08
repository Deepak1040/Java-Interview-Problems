//26 Remove Duplicates
public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums1[]={0,0,1,1,1,2,2,3,3,4};// change the array in order and return the number of unique elements
        System.out.println(removeDuplicates(nums1)); 
    }

    // Two pointer solution 
    // ele = numbers from the array
    // idx = index of the element 
    public static int removeDuplicates(int[] nums) {
        int ele=nums[0];
        int idx=1;
        int count=1;
        //System.out.println(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            if(ele!=nums[i])
            {
                nums[idx]=nums[i];
                idx++;
                count++;
                ele=nums[i];
            }
        }
        //System.out.println(Arrays.toString(nums));
        return count;
    }
}
