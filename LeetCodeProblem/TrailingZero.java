
//172 Factorial Trailing Zero

public class TrailingZero {
    
    public static void main(String[] args) {
        int n=3;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int fact =factorial(n);
        int num,count=0;

        while(fact>0) {
            num=fact%10;
            if(num==0) count++;
            fact=fact%10;
        }
        return count;
    }
    private static int factorial(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return n*factorial(n-1);
    }

}
