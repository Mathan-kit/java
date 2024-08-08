import java.util.*;
public class hemoglobin
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter your Gender : ");
        char G = obj.next().charAt(0);
        System.out.println("Enter ur age: ");
        float age = obj.nextFloat();
        System.out.println("Enter hemo : ");
        float hemo = obj.nextFloat();
        if(G == 'm' || G =='M')
        {
            if(age >= 12 && age <= 18)
            {
                if(hemo >= 13.0 && hemo <= 16.4)
                {
                    System.out.println("Normal level");
                }
                else
                {
                    System.out.println("Abnormal level");
                }
            }
            else if (age > 18)
            {
                if(hemo >= 17.2 && hemo <= 20.5)
                {
                    System.out.println("Normal ");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else
            {
                System.out.println("Age is not valid");
            }
        }
        else if (G == 'f' || G == 'F')        
        {
            if(age >= 12 && age <= 18)
            {
                if(hemo >= 12.8 && hemo <=16.4)
                {
                    System.out.println("Normal");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else if(age >18)
            {
                if(hemo >= 13.1 && hemo <= 18.3)
                {
                    System.out.println("Normal");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else
            {
                System.out.println("Age is not valid");
            }
        }
        else if ( G == 'c' || G == 'C')
        {
            if(age < 1.0)
            {
                if( hemo >=10.0 && hemo <= 20.2)
                {
                    System.out.println("Normal");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else if(age >=1.0 && age <= 2.0)
            {
                if( hemo >= 21.0 && hemo <= 25.4)
                {
                    System.out.println("Normal");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else if (age >= 2.0 && age <= 6.0)
            {
                if(hemo >= 26.0 && hemo <= 28.4)
                {
                    System.out.println("Normal");
                }
                else
                {
                    System.out.println("Abnormal");
                }
            }
            else
            {
                System.out.println("Age is not valid");
            }
        }
    }    
}
