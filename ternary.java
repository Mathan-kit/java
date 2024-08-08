import java.util.*;
public class ternary
{
    public static void main(String[] args)
    {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the gender : ");
        char gender = A.next().charAt(0);
        String result = (gender >= 'M' && gender >='F') ? "Male" : "Female";
        System.out.println(result);
    }   
}
