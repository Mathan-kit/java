import java.util.*;
public class Singletri 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        for(int i=1;i<a;i++)
        {   
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=a-1;j++)
                {
                    System.out.print(j);
                }
            System.out.print("\n");
        }   
    }
}
