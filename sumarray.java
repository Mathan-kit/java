import java.util.*;
public class sumarray 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int a[] = {5,6,7,8,20,40};
        int b = as.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i]+a[j]==b)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
