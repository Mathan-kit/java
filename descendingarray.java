import java.util.*;
public class descendingarray 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a[] = {3,6,2,1,5,4};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}
