public class Prime 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int i=0;
        int b=a.length;
        while(i<b)
        {
            if(a[i]%2!=0 && a[i]%a[i] == 0 )
            {
                System.out.println(a[i]);
            }
            i++;
        }
    }    
}
