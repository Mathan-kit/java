import java.util.*;
public class Switch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        int b = a%2;
        switch(b)
        {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("Enter integer value");
                break;
        }
    }    
}
