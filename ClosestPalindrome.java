public class ClosestPalindrome {
    public static void main(String[] args) {
        String num="1212";
        ClosestPalindrome cp=new ClosestPalindrome();
        System.out.println(cp.nearestPalindromic(num));
    }



    public String nearestPalindromic(String n) {
        int num = Integer.parseInt(n);
        if(num<10 && num>0) return Integer.toString(num-1);
        else{
            //Change the implementation
        }
        return "0";
    }
}
