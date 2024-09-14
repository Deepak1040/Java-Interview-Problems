import java.util.*;
public class StreamLineHealth  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter your height ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight ");
        double weight = sc.nextDouble();

        double bmi= weight/(height*height);

        double roundoff=Math.round(bmi);

        System.out.println("Hello "+name+", Your BMI is "+roundoff);
        String category;

        if(roundoff<18.5)
        {   category="Under Weight";
            System.out.println("you are under the category "+ category);
        }else if (roundoff<25) {
            category="Normal Weight";
            System.out.println("You are under the category "+ category);
        }else if(roundoff<=30){
            category="Over weight";
            System.out.println("You are under the category "+ category);
        }else{
            category="Obese";
            System.out.println("You are under the category "+ category);
        }

        sc.close();



    }
    
}
