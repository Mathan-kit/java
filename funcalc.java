import java.security.PublicKey;
import java.util.*;
public class funcalc
{
    public static void main(String[] args) 
    { 
        Scanner as = new Scanner(System.in);
        int num1 = as.nextInt();
        int num2 = as.nextInt();
        int operation = as.nextInt();
        switch(operation)
        {
            case(1):
                add(num1,num2);
                break;
            case (2):
                sub(num1,num2);
                break;
            case(3):
                mul(num1,num2);
                break;
            case(4):
                div(num1,num2);
                break;
        }
    }
    public static void add(int a,int b)
    {
        System.out.print(a+b);
    }
    public static void sub(int a,int b)
    {
        System.out.print(a-b);
    }
    public static void mul(int a,int b)
    {
        System.out.print(a*b);
    }
    public static void div(int a, int b)
    {
        System.out.print(a/b);
    }
}
