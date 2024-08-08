import java.util.*;
public class Starbox 
{
    public static void main(String[] args)
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(   i==a-1 || j==0 || j==a-1 || i==0 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
