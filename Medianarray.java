import java.util.*;
public class Medianarray
{
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int num1[] = {1,3,4,10};
        int num2[] = {2,5,6,7,8,9};
        int a=num1.length,b=num2.length,cl=a+b;
        int arr[] = new int[cl];
        int temp =0;
        int len = arr.length/2;
        float median=0f ;
        for(int i=0;i<a;i++)
        {
            arr[i] = num1[i];
        }
        for(int j=0;j<b;j++)
        {
            arr[a+j] = num2[j];
        }
        for(int i=0;i<cl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<cl;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
            if(arr.length%2==1)
            {
                System.out.print(arr[len]);
            }
            else
            {
                median = ((float)(arr[len-1]+arr[len])/2);
                System.out.print(median);
            }
    }
}