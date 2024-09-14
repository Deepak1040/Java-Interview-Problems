package LeetCodeProblems;

// 27 Remove Element


public class RemoveElement {
    public static void main(String[] args) {
        int nums1[]={3,2,2,3};
        int val=3;
        System.out.println(removeElement(nums1, val)); 
    }
    public static int removeElement(int[] nums, int val) {

        int idx=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=val){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
        
    }
}
