import java.util.*;
public class diamond 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=a-1;j>i;j--)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        
    }    
}
