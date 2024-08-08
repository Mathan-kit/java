import java.util.*;
public class RemoveDuplicateNum
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        int arr[] = {0,0,1,1,2,2};
        int len = arr.length;
        int arr2[] = new int [len];
        int b=0;
        for(int i=0;i<arr.length-1;i++)
        {
                    if(arr[i]==arr[i+1])
                    {
                        arr2[b] = arr[i];
                        b++;
                    }else{
                        arr2[b]=arr[i];
                        b++;
                        arr2[b]=arr[i+1];
                    }
                    i++;
        }
        for(int i=0;i<b;i++)
        {
            System.out.print(arr2[i]);    
        }
    }
}