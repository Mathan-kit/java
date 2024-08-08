import java.util.*;
public class Pattern
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a row : ");
        int i=0,j;
        int r = a.nextInt();
        while(i<r)
        {
            j=1;
            while (j<r)
            {
                System.out.print("*"+ " ");                
                j++;
            }
            System.out.println("*"+" ");
            i++;
        }
    }
    
}
