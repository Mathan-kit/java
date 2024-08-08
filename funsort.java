import java.util.*;
public class funsort
{
    public static void main(String[] args) 
    {
        int arr[] = {5,1,4,3,2};
        int a[] = sort(arr);
        System.out.print(Arrays.toString(a));
    }
    public static int[] sort(int[] ar)
    {
        int temp=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(ar[i]<ar[j])
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }
}