
import java.util.Scanner;

public class ZohoPattern {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the Number: ");
        try (Scanner sc = new Scanner(System.in)) {
            num=sc.nextInt();
            pattern(num);
        }
    }

    /* 
    1 2 3 4 5
    2 3 4 5 1
    3 4 5 1 2
    4 5 1 2 3
    5 1 2 3 4

    public static void pattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            int z=0;
            for (int j =0;j<num;j++)
            {
                if(i+j>num)
                {
                    System.out.print(++z + " ");
                    continue;
                }
                System.out.print(j+i + " ");
            }
            System.out.println();
        }
    }
    */

    /* n=5
            1
          2 1
        3 2 1
      4 3 2 1
    5 4 3 2 1 

    public static void pattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for (int j = 0; j <num-i ; j++) 
            {
                System.out.print(" "); 
            }
            for(int z=i;z>0;z--)
            {
                System.out.print(z);
            }

            System.out.println();
        }
    }
    
    */

    /* n=6
                    1
                 2  4
              3  5  7
           6  8 10 12
        9 11 13 15 17
    14 16 18 20 22 24 
    */

    public static void pattern(int num)
    {
        int temp=1;
        for(int i=0;i<=num;i++)
        {
            int n=temp;
            for(int j=0;j<i;j++)
            {
                if(n==1){System.out.println(n);break;}
                System.out.print(n+2 + " ");
                n=n+2;
            }
            System.out.println();
            temp++;
        }
    }
}
