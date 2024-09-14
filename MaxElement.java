public class MaxElement {
    public static void main(String args[])
    {
        int array [] ={1,3,-1,-3,5,3,6,7};
        int k = 3;
        for(int i = 0;i<=array.length-k;i++)
        {
            int a=Integer.max(array[i], array[i+1]);
            System.out.print(Integer.max(a, array[i+2])+ " ");
        }
    }
}
