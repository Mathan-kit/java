import java.util.*;
public class Forarray 
{
    public static void main(String[] args) 
    {
        Scanner zx = new Scanner(System.in);
        int n = zx.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = zx.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
