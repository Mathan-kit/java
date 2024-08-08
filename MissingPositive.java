import java.util.*;
public class MissingPositive
{
    public static void main(String[] args) 
    {
        int a[] = {-1,1,3,4};
        int z = 1;
        for(int i=0;i<a.length;i++)
        {
            if(z!=a[i] && a[i]>0)
            {
                System.out.print(z);
                break;
            }
            z++;
        }
    }
}