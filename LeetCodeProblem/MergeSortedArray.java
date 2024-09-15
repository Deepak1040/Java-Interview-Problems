

import java.util.Arrays;


//88 Merge Sorted Arrays


public class MergeSortedArray {
    public static void main(String Args[]){
        int array1[]={};
        int array2[]={2,};
        int result[] = mergeArray(array1,0,array2,1);

        for(int a: result)
            System.out.print(a+" ");
    }


    public static int[] mergeArray(int array1[],int size1,int array2[], int size2)
    {
        int result[] = new int[size1+size2];  
        int i;
        for(i=0;i<size1;i++)
            result[i]=array1[i];
        for(int j=0;j<size2;j++,i++)
            result[i]=array2[j];

        Arrays.sort(result);
        return result;

        // Or this Both Works 
        // for(int i=m,j=0;j<n;j++,i++)
        //     nums1[i]=nums2[j];   
        // Arrays.sort(nums1);
    }
}
