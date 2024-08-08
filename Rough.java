import java.util.*;
public class Rough
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int t = as.nextInt();
        for(int i=1;i<=t;i++)
        {
            for(int j=t;j>=i;j--)
            {
            System.out.print("*");
            }
            System.out.println();  
             
        }
    }
}
