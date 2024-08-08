      import java.util.*;
public class collegeadmission 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Gender  : ");
        char G = obj.next().charAt(0);
        System.out.print("Enter your age : ");
        int age = obj.nextInt();
        if(G == 'm' || G == 'M')
        {
            if(age >= 18 && age <= 25)
            {
                System.out.println("Eligible for admission");
            }
            else
            {
                System.out.println("Not Eligible for admission");
            }
        }
        else{
            System.out.println("This is boys colloge");
        }
    }
    
}
