import java.util.*;
public class Star 
{
    public static void main(String[] args) 
    {
        Scanner qw = new Scanner(System.in);
        int a = qw.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }    
}
