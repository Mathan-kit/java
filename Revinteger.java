import java.util.*;
public class Revinteger
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int rev =0,t ;
        while(a!=0)
        {
            t = a%10;
            rev = rev *10 + t;
            a/=10;
        }
        System.out.print(rev);
    }
}