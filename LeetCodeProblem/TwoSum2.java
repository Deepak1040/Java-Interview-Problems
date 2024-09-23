import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        int target=9;
        int res[]=twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
        
    }
    public static int[] twoSum(int[] numbers, int target) {
        //Brute Force Solution but it works
        int result[]=new int[2];
        for(int i=0;i<numbers.length;i++) {
            int first=numbers[i];
            for(int j=i+1;j<numbers.length;j++) {
                int second=numbers[j];
                if(first+second == target) {
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }

        return result;
    }
    
    /* Better Solution
    public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;
    
            while (left < right) {
                int total = numbers[left] + numbers[right];
    
                if (total == target) {
                    return new int[]{left + 1, right + 1};
                } else if (total > target) {
                    right--;
                } else {
                    left++;
                }
            }
            return new int[]{-1, -1};      
        }*/
    
}
