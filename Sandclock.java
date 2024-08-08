import java.util.*;
public class Sandclock 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=a;j>i;j--)
            {
                System.out.print("*");
            }
            for(int j=1;j<a-i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=0;i<a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
