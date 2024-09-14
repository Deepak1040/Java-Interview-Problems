//import java.util.regex.Pattern;

public class Encrypt {
    
    public static void main(String[] args) {
        String s="Helllo world javaaaaaa";
        int count=0;
        int end=0,start=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length()-1;i++)
        {   
            String temp="";
            if(s.charAt(i+1)==s.charAt(i))
            {
                count++;
                end=i;
                temp+=s.charAt(i);
            }
            
            if(count>1)
            {   temp=count+temp;
                sb.replace(start,end-start, temp);
                count=0;
            }
        }

        System.out.println(sb.toString());
    }
}
