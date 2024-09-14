public class ClosestPalindrome {
    public static void main(String[] args) {
        String num="1212";
        ClosestPalindrome cp=new ClosestPalindrome();
        System.out.println(cp.nearestPalindromic(num));
    }



    public String nearestPalindromic(String n) {
        int num = Integer.parseInt(n);
        StringBuilder sb ;
        String str="";
        String revStr="";
        if(num<10 && num>0) return Integer.toString(num-1);
        else{
            while(num>0){
                sb=new StringBuilder(String.valueOf(--num));
                str=sb.toString();
                revStr=sb.reverse().toString();
                if(str.equals(revStr))
                    return str;
            }
        }
        return "0";
    }
}
