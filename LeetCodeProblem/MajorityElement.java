
// 169 Majority Element

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int array[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(array));
    }

    public static  int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int major=0,res=0;
        for(int n:nums) {
            map.put(n, 1+map.getOrDefault(n, 0));

            if(map.get(n)>major) {
                res=n;
                major=map.get(n);
            }
        }
        return res;
    }
}
