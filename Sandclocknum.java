import java.util.*;
public class Sandclocknum 
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
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=a-i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for(int i=1;i<=a;i++)
        {
            for(int j=a;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
