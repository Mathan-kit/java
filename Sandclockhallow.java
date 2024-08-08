import java.util.*;
public class Sandclockhallow 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=i;j<a;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                if(k==1 || i==a || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i=2;i<=a;i++)
        {
            for(int j=i;j<a;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                if(k==1 || i==a || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
