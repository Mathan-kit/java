import java.util.*;
public class arithmetic 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the operator : ");
        char operator = obj.next().charAt(0);
        System.out.print("Enter 1st value : ");
        int a = obj.nextInt();
        System.out.print("Enter 2nd value : ");
        int b = obj.nextInt();
        switch(operator)
        {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);;
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;            
        }
    }
}
