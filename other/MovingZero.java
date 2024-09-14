package other;
public class MovingZero {
    public static void main(String Args[])
    {
        int array[]= {1,0,2,3,0,4,6};
        int j=array.length-1;
        int index=0;
        for(int i=0;i<array.length-index;i++){
            if(array[i]==0){
                int temp=array[i];
                array[i]=array[j];
                array[j--]=temp;
                index++;
            }
        }

        for(int a : array)
            System.out.print(a+" ");

    }
}
