import java.util.*;
public class Shufflestring 
{
    public static void main(String[] args) 
    {
        String str = "HelloWorld";
        String r ="";
        char arr[] = new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i] = str.charAt(i);
        }
        int mid = arr.length/2;
        for(int i=0;i<mid;i++)
        {
            System.out.print(arr[i]);
            r+=arr[i];
            System.out.print(arr[i+mid]); 
            r+=arr[i+mid];
        }
        System.out.println();
        System.out.println(r);
    }
}
