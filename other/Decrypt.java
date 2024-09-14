package other;
public class Decrypt {
    public static void main(String args[])
    {
        String details="The good fr3d jumps oump4s";
        int length=details.length();
        char [] array=details.toCharArray();
        String res="";
        for(int i=0;i<length;i++)
        {
            if(Character.isDigit(array[i]))
            {
                int num=Integer.parseInt(String.valueOf(array[i]));
                for(int j=0;j<num-1;j++)
                {
                    res+=array[i-1];
                }
            }
            res+=array[i];
        }
        String s = res.replaceAll("\\d", "");
        System.out.println(s);

    }
}
