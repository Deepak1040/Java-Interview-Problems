

// 3 sum - 15

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int array[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(array);
        for (List<Integer> a : list) {
            for(int i=0;i<a.size();i++)
                System.out.print(a.get(i)+"  ");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int first,second,third;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++) {
            first=nums[i];
            second=nums[i+1];
            third=nums[i+2];
            System.out.println(first+"  "+second+"  "+third);
            List<Integer> inner =new ArrayList<>();
            if(first+second+third == 0){
                inner.add(first);
                inner.add(second);
                inner.add(third);
            }
            list.add(inner);
            //System.out.println("gh");
        }
        return list;
    }
}
