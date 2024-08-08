import java.util.*;
public class index 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner (System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b = a.length ,i=0;
        while(i<b)
        {
            System.out.println(a[b-1]); 
            b--;
        }
    }    
}
