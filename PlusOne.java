import java.util.*;
public class PlusOne
{
    public static void main(String[] args) 
    {
        int arr[] = {4,3,2,99};
        String s="";
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
        int a = Integer.parseInt(s);
        a=a+1;
        String q = Integer.toString(a);
        String[] arr1 = q.split("");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}