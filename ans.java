import java.util.*;
public class ans 
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Any letter : ");
        char b = a.next().charAt(0);
        if(b >= 'a' && b <='z')
        {
            System.out.println("Small letter Alphates");
        }
            else if(b >= '0' && b <='9')
            {
                System.out.println("Numbers");
            }
            else if(b >= 'A' && b <= 'Z')
            {
                System.out.println("Capital letter alphabets");
            }
        else
        {
            System.out.println("Special characters");
        }

    }
   
}
