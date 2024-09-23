
// 392 Is Subsequence 

public class IsSubsequence {
    public static void main(String[] args) {
        String s="aec";
        String t="abcde";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s , String t) {
        int n=t.length();
        int m=s.length();
        int pos=-1,flag;
        for(int i=0;i<m;i++){
            flag=0;
            for(int j=pos+1;j<n;j++){
                if(t.charAt(j)==s.charAt(i)){
                 pos=j;
                 flag=1;break;
                }
            }
            if(flag==0)
            return false;
        }
        return true;
    }
}
